/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.CNLRuntimeModule;
import org.xtext.example.CNLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CNLIdeSetup extends CNLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CNLRuntimeModule(), new CNLIdeModule()));
	}
	
}