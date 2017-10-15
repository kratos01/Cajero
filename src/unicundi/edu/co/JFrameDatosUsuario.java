package unicundi.edu.co;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDatosUsuario extends JFrame {

	
	
	public JFrameDatosUsuario() {
		super("Datos Usuario");
		iniciar();
		componentes();
		this.setVisible(true);
		pack();
		this.setLocationRelativeTo(null);
	}
public void iniciar() {
	Dimension dm = new Dimension(300,300);	
	this.setSize(dm);
	this.setPreferredSize(dm);
	this.setLayout(new FlowLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
public JFrameDatosUsuario componentes() {
	
	JLabel lbcedula = new JLabel("Cedula:");
	add(lbcedula);
	
<<<<<<< HEAD

=======
>>>>>>> master
	return null;
	
}
}
