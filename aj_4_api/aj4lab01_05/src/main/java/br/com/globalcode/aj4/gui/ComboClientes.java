/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package aj_4_api.aj4lab01_05.aj4lab01_05.src.main.java.br.com.globalcode.aj4.gui;

import java.util.List;

import javax.swing.JComboBox;

import br.com.globalcode.aj4.dao.ClientesDAO;
import br.com.globalcode.aj4.dao.IClientesDAO;
import aj_4_api.aj4lab01_05.aj4lab01_05.src.main.java.br.com.globalcode.model.Cliente;
import aj_4_api.aj4lab01_05.aj4lab01_05.src.main.java.br.com.globalcode.util.GlobalcodeException;

/**
 * Classe que estende JComboBox para criar um combo de clientes do banco de
 * dados.
 */
public class ComboClientes extends JComboBox {

	public ComboClientes() throws GlobalcodeException {
		this.reloadFromDatabase();
	}

	public void reloadFromDatabase() throws GlobalcodeException {
		IClientesDAO db = new ClientesDAO();
		List<Cliente> clientes = db.getAllClientes();
		this.removeAllItems();
		for (Cliente c : clientes) {
			this.addItem(c);
		}
	}
}
