/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.cnl.ui.internal.CnlActivator;

public class CNLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CnlActivator.getInstance().getInjector("org.xtext.example.CNL");
	}

}
