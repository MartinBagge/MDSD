/*
 * generated by Xtext 2.10.0
 */
package master.mdsd.ui.tests;

import com.google.inject.Injector;
import master.mdsd.game.ui.internal.GameActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class GameUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GameActivator.getInstance().getInjector("master.mdsd.Game");
	}

}
