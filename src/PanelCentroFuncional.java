import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCentroFuncional extends JPanel{

	JTextField txtretiro, txtpagos,txtconsulta,txtcambioClave,txttransferencia;
	JLabel lbmenu;
	
	public PanelCentroFuncional() {
	componentes();
}

public void componentes() {
	this.setLayout(new GridLayout(4,2,30,5));
	lbmenu = new JLabel("MENU");
	lbmenu.setHorizontalAlignment(lbmenu.CENTER);
	add(lbmenu);

	JLabel lbnulo = new JLabel();
	add(lbnulo);

	txtretiro = new JTextField(10);

	add(txtretiro);
	
	txtpagos = new JTextField(10);
	add(txtpagos);
	
	txtconsulta = new JTextField(10);
	add(txtconsulta);
	
	txtcambioClave = new JTextField(10);
	add(txtcambioClave);
	
	txttransferencia = new JTextField(10);
	add(txttransferencia);
	
}
}
