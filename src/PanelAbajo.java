import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAbajo extends JPanel{

	private JButton btnnumero1,btnnumero2,btnnumero3,btnnumero4,btnnumero5,btnnumeral,btnusuario,
	btnnumero6,btnnumero7,btnnumero8,btnnumero9,btnnumero0,btnlimpiar,btncancelar,btnsalir,btnasterisco;
    private JLabel lbretirar,lbinsertar,lbnulo,lbnulo1;
    private JTextField txtretirar,txtcedula;
	
	public PanelAbajo() {
		
		componentes();
		
}

	public void componentes() {
	this.setLayout(new GridLayout(7,4,30,5));
	
	btnnumero1 = new JButton("1");
	add(btnnumero1);
	
	btnnumero2 = new JButton("2");
	add(btnnumero2);
	
	btnnumero3 = new JButton("3");
	add(btnnumero3);
	
	btncancelar = new JButton("Cancelar");
	add(btncancelar);
	
	btnnumero4 = new JButton("4");
	add(btnnumero4);

	btnnumero5 = new JButton("5");
	add(btnnumero5);

	btnnumero6 = new JButton("6");
	add(btnnumero6);
	
	btnlimpiar = new JButton("limpiar");
	add(btnlimpiar);
	
	btnnumero7 = new JButton("7");
	add(btnnumero7);
	
	btnnumero8 = new JButton("8");
	add(btnnumero8);
	
	btnnumero9 = new JButton("9");
	add(btnnumero9);
	
	btnsalir = new JButton("salir");
	add(btnsalir);

	btnasterisco = new JButton("*");
	add(btnasterisco);
	
	btnnumero0 = new JButton("0");
	add(btnnumero0);
	
	btnnumeral = new JButton("#");
	add(btnnumeral);
	
	lbnulo = new JLabel();
	add(lbnulo);

	
	lbretirar = new JLabel("retire su dinero:");
    add(lbretirar);

    lbnulo1 = new JLabel();
    add(lbnulo1);
    
    lbinsertar = new JLabel("inserte tarjeta");
    add(lbinsertar);
    
    JLabel lbnulo2 = new JLabel();
    add(lbnulo2);
    
	txtretirar = new JTextField("mensaje de la aplicacion");
     add(txtretirar);
	
     JLabel lbnulo3 = new JLabel();
     add(lbnulo3);
     
     txtcedula = new JTextField("cedula");
     add(txtcedula);
     
     JButton btnok = new JButton("OK");
     add(btnok);
    
     JLabel lbnulo4 = new JLabel();
     add(lbnulo4);
     
     JLabel lbnulo5 = new JLabel();
     add(lbnulo5);
     
     JLabel lbnulo6 = new JLabel();
     add(lbnulo6);
     
	btnusuario = new JButton("agregar usuario");
	add(btnusuario);


	btnusuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent  ev) {
			
			JFrame u = new JFrame();
			
			
		}
	});
	}
	
}

