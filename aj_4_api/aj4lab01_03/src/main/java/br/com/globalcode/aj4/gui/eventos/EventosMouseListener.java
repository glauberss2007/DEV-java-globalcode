/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package aj_4_api.aj4lab01_03.aj4lab01_03.src.main.java.br.com.globalcode.aj4.gui.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosMouseListener implements MouseListener {

	public void mouseClicked(MouseEvent arg0) {
		System.out.println("[EventosMouseListener] mouse clicked");
	}

	public void mousePressed(MouseEvent evento) {
		System.out.println("[EventosMouseListener] mouse pressed");
	}

	public void mouseReleased(MouseEvent evento) {
		System.out.println("[EventosMouseListener] mouse released");
	}

	public void mouseEntered(MouseEvent evento) {
		System.out.println("[EventosMouseListener] mouse entered");
	}

	public void mouseExited(MouseEvent evento) {
		System.out.println("[EventosMouseListener] mouse exited");
	}
}