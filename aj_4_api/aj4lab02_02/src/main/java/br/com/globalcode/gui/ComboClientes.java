/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package aj_4_api.aj4lab02_02.aj4lab02_02.src.main.java.br.com.globalcode.gui;

import java.util.List;

import javax.swing.JComboBox;

import aj_4_api.aj4lab02_02.aj4lab02_02.src.main.java.br.com.globalcode.beans.Cliente;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.ClienteDAOSerialization;
import aj_4_api.aj4lab02_02.aj4lab02_02.src.main.java.br.com.globalcode.util.GlobalcodeException;

/**
 * @author Globalcode
 * 
 */
public class ComboClientes extends JComboBox {

    public ComboClientes() throws GlobalcodeException {
        this.reloadFromDatabase();
    }

    public final void reloadFromDatabase() throws GlobalcodeException {
        ClienteDAO db = new ClienteDAOSerialization();
        List<Cliente> clientes = db.getAllClientes();
        this.removeAllItems();
        for (Cliente cliente : clientes) {
            this.addItem(cliente);
        }
    }
}
