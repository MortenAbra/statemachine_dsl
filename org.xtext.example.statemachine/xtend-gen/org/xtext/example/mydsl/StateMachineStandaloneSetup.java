/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.StateMachineStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class StateMachineStandaloneSetup extends StateMachineStandaloneSetupGenerated {
  public static void doSetup() {
    new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
