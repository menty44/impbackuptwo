package com.ins.test;
 
import java.io.FileReader;
import java.net.URL;
import java.util.Iterator;
 
import org.drools.QueryResult;
import org.drools.QueryResults;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.audit.WorkingMemoryFileLogger;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;
 
import com.ins.Coverage;
import com.ins.Insured;
import static com.ins.Insured.*;
import com.ins.Policy;
import com.ins.PolicyProduct;
import com.ins.result.PolicyRuleResult;
 
public class IssueTest {
 
    public static void main(String args[]) {
        try {
 
            //load up the rulebase
            RuleBase ruleBase = readDRL();
            WorkingMemory workingMemory = ruleBase.newStatefulSession();
 
            WorkingMemoryFileLogger logger = new WorkingMemoryFileLogger(workingMemory);
            logger.setFileName("C:/drools-audit");
 
            Policy policy = new Policy();
            policy.addAgent("Bill Smith");
            Coverage coverage1 = new Coverage();
            coverage1.setEligible(true);
            coverage1.setFaceAmount(250000);
 
            Coverage coverage2 = new Coverage();
            coverage2.setEligible(true);
            coverage2.setFaceAmount(1500000);
 
            policy.addCoverage(coverage1);
            policy.addCoverage(coverage2);
            policy.setIssueState("CO");
 
            Insured insured1 = new Insured();
            insured1.setFirstName("Elizabeth");
            insured1.setAge(30);
            insured1.setGender(GENDER_FEMALE);
            coverage1.setInsured(insured1);
 
            Insured insured2 = new Insured();
            insured2.setFirstName("Elizabeth");
            insured2.setAge(45);
            insured2.setGender(GENDER_FEMALE);
            coverage2.setInsured(insured2);
 
            PolicyRuleResult result = new PolicyRuleResult();
            PolicyProduct policyProd = new PolicyProduct();
 
            workingMemory.insert(policy);
            workingMemory.insert(policyProd);
            workingMemory.setGlobal("result", result);
            workingMemory.fireAllRules();
            logger.writeToDisk();
 
            System.out.println(result.isEligible());
            System.out.println(result.isAllCoveragesAreEligible());
            System.out.println(result.isAgentInformationValid());
            System.out.println(result.isApprovedState());
            System.out.println(result.getSoundMessages());
            System.out.println(result.isSoundexWorksCollect());
 
            System.out.println("Cov1: " + coverage1.isEligible());
            System.out.println("Cov2: " + coverage2.isEligible());
 
            System.out.println("Ret Id: " + result.isRetIdentifier());
            System.out.println("Total Face Amount: " + result.getTotalFaceAmount());
            System.out.println("Total Face Amount Simp: " + result.getTotalFaceAmountSimp());
            System.out.println("Ave. Face Amount: " + result.getAverageFaceAmount());
 
            //Query Results
            QueryResults results = workingMemory.getQueryResults("Get Insured details for the policy");
            System.out.println( "we have " + results.size() + " insured(s)" );
 
            for ( Iterator it = results.iterator(); it.hasNext(); ) {
                QueryResult qResult = (QueryResult)it.next();
                Insured insured = (Insured) qResult.get( "$insured" );
                System.out.println( insured.getFirstName() + "\n" );
            }
 
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
 
    private static RuleBase readDRL() throws Exception {
        PackageBuilder builder = new PackageBuilder();
        builder.addPackageFromDrl( new FileReader(getDRLFilePath()));
        Package pkg = builder.getPackage();
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        ruleBase.addPackage( pkg );
        return ruleBase;
    }
 
    private static String getDRLFilePath() {
        ClassLoader loader = Policy.class.getClassLoader();
        URL url = loader.getResource("IssueRules.drl");
        return url.getPath();
    }
}