package com.github.enerate.action;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.jet.JET2Platform;

public class GeneratePythonAction
extends ActionDelegate
implements IActionDelegate {
      protected static final URI PLATFORM_RESOURCE = URI.createPlatformResourceURI("/", false);

      protected GenModel genModel;

      IProgressMonitor monitor = new NullProgressMonitor();

      public GeneratePythonAction()
      {
        super();
      }

      @Override
      public void run(IAction action)
      {
          URI uri = genModel.eResource().getURI();
          IStructuredSelection selection = StructuredSelection.EMPTY;
          if (uri != null && uri.isHierarchical())
          {
              if (uri.isRelative() || (uri = uri.deresolve(PLATFORM_RESOURCE)).isRelative())
              {
                  IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toString()));
                  if (file.exists())
                  {
                      selection = new StructuredSelection(file);
                  }
             }
        }

        Object object = ((IStructuredSelection)selection).getFirstElement();
        if (object instanceof GenModel)
        {
            genModel = (GenModel)object;

            HashMap<String, String> variables = new HashMap<String, String>();
            variables.put("org.eclipse.jet.resource.project.name", "theNameOfTheProjectContainingTheEMFResource");
            JET2Platform.runTransformOnObject("com.github.enerate", genModel.eResource(), variables, monitor);
        }
      }

      @Override
      public void selectionChanged(IAction action, ISelection selection)
      {
        if (selection instanceof IStructuredSelection)
        {
          Object object = ((IStructuredSelection)selection).getFirstElement();
          if (object instanceof GenModel)
          {
            action.setEnabled(true);
            return;
          }
        }
        genModel = null;
        action.setEnabled(false);
      }
}
