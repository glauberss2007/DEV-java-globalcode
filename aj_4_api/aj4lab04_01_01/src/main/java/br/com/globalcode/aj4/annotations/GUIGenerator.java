/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package aj_4_api.aj4lab04_01_01.aj4lab04_01_01.src.main.java.br.com.globalcode.aj4.annotations;

import java.lang.reflect.Field;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIGenerator extends javax.swing.JPanel {

	public static final int STEP_H = 20;
	private String className;
	private int lastWidth = 10;
	private int lastHeight = 10;

	public GUIGenerator() {
		this.setLayout(null);
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
		// chamada ao metodo que interpreta as anotacaoes da classe
		loadClass();
	}

	private void loadClass() {
		Class classe = null;
		try {
			// Carregamento da classe
			classe = Class.forName(className);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// Obtencao dos atributos da classe
		Field fields[] = classe.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(GUIVisible.class)) {
				// apos identifica��o da anotacao, chamada para construir o
				// componente de campo de texto na tela.
				buildGUIField(field);
			}
		}
	}

	public void bind(Object entidade) {
		if (getClassName() == null) {
			setClassName(entidade.getClass().getName());
		}
	}

	public void buildGUIField(Field field) {
		GUIVisible anotacao = field.getAnnotation(GUIVisible.class);
		String nomeDoCampo = anotacao.nomeCampo();
		JLabel label1 = new JLabel(nomeDoCampo);
		JTextField text1 = new JTextField("");

		label1.setBounds(lastWidth, lastHeight, 200, 15);
		lastHeight += STEP_H;
		text1.setBounds(lastWidth, lastHeight, 200, 15);
		lastHeight += STEP_H;

		this.add(label1);
		this.add(text1);
	}
}
