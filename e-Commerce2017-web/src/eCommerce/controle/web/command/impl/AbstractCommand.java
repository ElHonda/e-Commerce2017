
package eCommerce.controle.web.command.impl;

import eCommerce.controle.web.command.ICommand;
import eCommerce.core.IFachada;
import eCommerce.core.impl.controle.Fachada;



public abstract class AbstractCommand implements ICommand {

	protected IFachada fachada = new Fachada();

}
