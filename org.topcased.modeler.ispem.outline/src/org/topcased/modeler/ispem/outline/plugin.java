/*******************************************************************************
 * 
 * Copyright AIRBUS FRANCE, 2005. All rights reserved.
 * 
 * This document and all information contained herein is the sole property of
 * AIRBUS FRANCE. No intellectual property rights are granted by the delivery of
 * this document or the disclosure of its content.
 * 
 ******************************************************************************/

package org.topcased.modeler.ispem.outline;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class plugin extends AbstractUIPlugin
{
  // The shared instance
  private static plugin plugin;
  
  /**
   * The constructor.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public plugin() {
    super();
    plugin = this;
  }

  /**
   * This method is called upon plug-in activation
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param context
   * @throws Exception
   * @generated
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
  }

  /**
   * This method is called when the plug-in is stopped
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param context
   * @throws Exception
   * @generated
   */
  public void stop(BundleContext context) throws Exception {
    super.stop(context);
    plugin = null;
  }

  /**
   * Returns the shared instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton
   * @generated
   */
  public static plugin getDefault() {
    return plugin;
  }

  /**
    * @return the Plugin Id
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static String getId()
  {
    return getDefault().getBundle().getSymbolicName();
  }

  /**
    * Log a message with given level into the Eclipse log file
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @param message the message to log
    * @param level the message priority
   * @generated
    */
  public static void log(String message, int level)
  {
    IStatus status = null;
    status = new Status(level, getId(), IStatus.OK, message, null);
    log(status);
  }

  /**
   * Log an exception into the Eclipse log file
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param e the exception to log
   * @generated
   */
  public static void log(Throwable e)
  {
    if (e instanceof InvocationTargetException)
      e = ((InvocationTargetException) e).getTargetException();

    IStatus status = null;
    if (e instanceof CoreException)
      status = ((CoreException) e).getStatus();
    else
      status = new Status(IStatus.ERROR, getId(), IStatus.OK, "Error", e);

    log(status);
  }

  /**
   * Log an IStatus
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param status
   * @generated
   */
  public static void log(IStatus status)
  {
    ResourcesPlugin.getPlugin().getLog().log(status);
  }
}
