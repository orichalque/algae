/**
 * generated by Xtext 2.12.0
 */
package org.naomod.tblf.petrinet;

import org.naomod.tblf.petrinet.PetrinetStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PetrinetStandaloneSetup extends PetrinetStandaloneSetupGenerated {
  public static void doSetup() {
    new PetrinetStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}