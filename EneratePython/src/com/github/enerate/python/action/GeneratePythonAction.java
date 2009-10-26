package com.github.enerate.python.action;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.jet.JET2Platform;

public class GeneratePythonAction extends ActionDelegate implements IActionDelegate {

	protected static final URI PLATFORM_RESOURCE = URI.createPlatformResourceURI("/", false);

	protected GenModel genModel;

	IProgressMonitor monitor = new NullProgressMonitor();

	public GeneratePythonAction() {
		super();
	}

	@Override
	public void run(IAction action) {

		System.out.println("Generating Python Code");

		URI uri = genModel.eResource().getURI();

		System.out.println("GenModel URI: " + uri.toString());

		IStructuredSelection selection = StructuredSelection.EMPTY;
		if (uri != null && uri.isHierarchical()) {
			if (uri.isRelative() || (uri = uri.deresolve(PLATFORM_RESOURCE)).isRelative()) {
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toString()));

				System.out.println("File: " + uri.segment(0));

				if (file.exists()) {
					selection = new StructuredSelection(file);
				}
			}
		}

		Object object = ((IStructuredSelection)selection).getFirstElement();

		System.out.println("Object: " + object.getClass().toString());

		if (true){//object instanceof GenModel) {
//			genModel = (GenModel)object;

			HashMap<String, String> variables = new HashMap<String, String>();
			variables.put("org.eclipse.jet.resource.project.name", uri.segment(0)); // theNameOfTheProjectContainingTheEMFResource

			System.out.println("Transforming: " + genModel.eResource().toString());

			IStatus status = JET2Platform.runTransformOnObject("com.github.enerate.python", genModel.eResource(), variables, monitor);

			if (!status.isOK())
				System.err.println("JET transformation failed! " + status.getMessage());
//				Activator.getDefault().getLog().log(status);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		System.out.println("Selection changed: " + selection.toString());

		if (selection instanceof IStructuredSelection) {
			Object object = ((IStructuredSelection)selection).getFirstElement();
			if (object instanceof GenModel) {
				action.setEnabled(true);
				genModel = (GenModel)object;
				return;
			}
		}
		genModel = null;
		action.setEnabled(false);
	}
}
