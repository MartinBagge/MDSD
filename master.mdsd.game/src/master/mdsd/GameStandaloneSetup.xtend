/*
 * generated by Xtext 2.10.0
 */
package master.mdsd


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GameStandaloneSetup extends GameStandaloneSetupGenerated {

	def static void doSetup() {
		new GameStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
