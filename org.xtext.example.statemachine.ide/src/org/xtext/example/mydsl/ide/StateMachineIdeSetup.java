/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.StateMachineRuntimeModule;
import org.xtext.example.mydsl.StateMachineStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class StateMachineIdeSetup extends StateMachineStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new StateMachineRuntimeModule(), new StateMachineIdeModule()));
	}
	
}
