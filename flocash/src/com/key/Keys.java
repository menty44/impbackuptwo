package com.key;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

public class Keys {
	
	public static void main(String[] args) {
		12
			        Scanner sn = new Scanner(System.in);
		13
			        System.out.print("Please enter data for which SHA256 is required:");
		14
			        String data = sn.nextLine();
		15
			         
		16
			        SHA256InJava sj = new SHA256InJava();
		17
			        String hash = sj.getSHA256Hash(data);
		18
			        System.out.println("The SHA256 (hexadecimal encoded) hash is:"+hash);
		19
			    }
		20
			 
		21
			    /**
		22
			     * Returns a hexadecimal encoded SHA-256 hash for the input String.
		23
			     * @param data
		24
			     * @return
		25
			     */
		26
			    private String getSHA256Hash(String data) {
		27
			        String result = null;
		28
			        try {
		29
			            MessageDigest digest = MessageDigest.getInstance("SHA-256");
		30
			            byte[] hash = digest.digest(data.getBytes("UTF-8"));
		31
			            return bytesToHex(hash); // make it printable
		32
			        }catch(Exception ex) {
		33
			            ex.printStackTrace();
		34
			        }
		35
			        return result;
		36
			    }
		37
			     
		38
			    /**
		39
			     * Use javax.xml.bind.DatatypeConverter class in JDK to convert byte array
		40
			     * to a hexadecimal string. Note that this generates hexadecimal in upper case.
		41
			     * @param hash
		42
			     * @return
		43
			     */
		44
			    private String  bytesToHex(byte[] hash) {
		45
			        return DatatypeConverter.printHexBinary(hash);
		46
			    }

}
