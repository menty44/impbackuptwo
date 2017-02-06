package org.kie.eclipse.navigator.view.actions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.SelectionProviderAction;
import org.kie.eclipse.navigator.view.content.IContainerNode;
import org.kie.eclipse.server.IKieServiceDelegate;

public class KieNavigatorAction extends SelectionProviderAction implements IKieNavigatorAction {

	public KieNavigatorAction(ISelectionProvider provider, String text) {
		super(provider, text);
	}

	@Override
	public void calculateEnabled() {
		setEnabled(isEnabled());
	}

	protected IContainerNode<?> getContainer() {
		IStructuredSelection selection = getStructuredSelection();
		if (selection == null || selection.isEmpty()) {
			return null;
		}
		Object element = selection.getFirstElement();
		if (element instanceof IContainerNode)
			return (IContainerNode<?>) element;
		return null;
	}

	protected IKieServiceDelegate getDelegate() {
		return getContainer().getHandler().getDelegate();
	}

	protected static void refreshViewer(final IContainerNode<?> container) {
		container.clearChildren();
		container.refresh();
	}

	protected static Shell getShell() {
		return Display.getDefault().getActiveShell();
	}

	@Override
	public void handleException(final Throwable t) {
		t.printStackTrace();
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(getShell(), "Error", t.getMessage());
			}
		});
	}
}
