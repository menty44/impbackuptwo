package org.kie.eclipse.utils;

import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.egit.ui.UIUtils;
import org.eclipse.jgit.transport.URIish;
import org.kie.eclipse.IKieConstants;
import org.kie.eclipse.IKieConstants;
import org.kie.eclipse.server.IKieRepositoryHandler;
import org.kie.eclipse.server.IKieServerHandler;
import org.kie.eclipse.server.IKieServiceDelegate;

public class PreferencesUtils implements IKieConstants {

	public PreferencesUtils() {
	}

	public static String getRepoRoot(IKieRepositoryHandler repository) {
		IKieServerHandler server = (IKieServerHandler) repository.getRoot();
	    boolean useDefaultGitPath = server.getPreference(IKieConstants.PREF_USE_DEFAULT_GIT_PATH, false);
		String defaultRepoRoot = UIUtils.getDefaultRepositoryDir();
		String repoRoot;
		if (useDefaultGitPath) {
			repoRoot = defaultRepoRoot;
		}
		else
		{
			defaultRepoRoot += File.separator + server.getPreferenceName(null).replace(IKieConstants.PREF_PATH_SEPARATOR.charAt(0), File.separator.charAt(0));
			repoRoot = server.getPreference(IKieConstants.PREF_GIT_REPO_PATH, defaultRepoRoot);
		}
		return repoRoot;
	}
	
	public static String getRepoPath(IKieRepositoryHandler repository) {
		return getRepoRoot(repository) + File.separator + repository.getName();
	}
	
	public static URIish getRepoURI(IKieRepositoryHandler repository) {
		IKieServiceDelegate delegate = repository.getDelegate();
		String host = delegate.getServer().getHost();
		int port = delegate.getGitPort();
		String username = delegate.getUsername();
		return getRepoURI(host, port, username, repository.getName());
	}
	
	public static URIish getRepoURI(String host, int port, String username, String repoName) {
        // URI is in the form:
        // ssh://admin@localhost:8001/jbpm-playground
		URIish uri = null;
		try {
			uri = new URIish(
					"ssh://"+
			(username==null || username.isEmpty() ? "" : username+"@") +
					host+":"+
					port+"/"+
					repoName
			);
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return uri;
	}
}
