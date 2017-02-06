package org.kie.eclipse.navigator.view.actions.project;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.kie.eclipse.navigator.view.actions.KieNavigatorAction;
import org.kie.eclipse.navigator.view.content.IContainerNode;
import org.kie.eclipse.server.IKieProjectHandler;
import org.kie.eclipse.server.IKieServiceDelegate;

public class DeleteProjectAction extends KieNavigatorAction {

	public DeleteProjectAction(ISelectionProvider provider) {
		super(provider, "Delete Project...");
	}

	public void run() {
        IContainerNode<?> container = getContainer();
        if (container==null)
        	return;
        
        IKieProjectHandler project = (IKieProjectHandler) container.getHandler();
        IKieServiceDelegate delegate = getDelegate();

        boolean doit = MessageDialog.openConfirm(
				getShell(), "Delete Project",
				"Are you sure you want to delete the Project " + container.getName() + "?");
		if (doit) {
            try {
            	delegate.deleteProject(project);
            	container.getParent().clearChildren();
            	refreshViewer(container.getParent());
            }
            catch (Exception e) {
            	handleException(e);
            }
        }
	}
}
