package com.github.enerate.python.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jet.JET2Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.ActionDelegate;

import com.github.enerate.python.Activator;

public class GeneratePythonAction extends ActionDelegate implements IActionDelegate {

	/** The list of selected ECore files. */
	private ArrayList<IFile> ecoreFiles = new ArrayList<IFile>();

	/** Progress monitor for the transformation. */
	IProgressMonitor monitor = new NullProgressMonitor();

	/**
	 * Constructor for GeneratePythonAction.
	 */
	public GeneratePythonAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {

		if (ecoreFiles.size() != 1) {
			Shell shell = new Shell();
			MessageDialog.openInformation(shell, "Enerate", "Please select one ECore file.");
			return;
		}

		final IFile ecoreFile = ecoreFiles.get(0);

		IProject project = ecoreFile.getProject();
		final HashMap<String, String> variables = new HashMap<String, String>();
		variables.put("org.eclipse.jet.resource.project.name", project.getName()); // theNameOfTheProjectContainingTheEMFResource

		Job job = new Job("Python Code Generation") {
			protected IStatus run(final IProgressMonitor monitor) {
				JET2Platform.runTransformOnResource("com.github.enerate.python", ecoreFile, variables, monitor);
				return Status.OK_STATUS;
			}
		};
		job.setUser(true); // shows dialog window
		job.schedule();
		IStatus status = job.getResult();

		if (!status.isOK())
			Activator.getDefault().getLog().log(status);
	}

	/**
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		if (!(selection instanceof IStructuredSelection))
			return;

		final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		final Iterator<?> it = structuredSelection.iterator();
		ecoreFiles = new ArrayList<IFile>();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (obj instanceof IFile) {
				ecoreFiles.add((IFile) obj);
			}
		}
	}
}
