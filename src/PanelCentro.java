import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class PanelCentro extends JPanel{

	private JLabel lbenunciado;
	private JLabel imagen;
	
	public PanelCentro() {
	contenido();
}
	
	public void contenido () {
		
		this.setLayout(new BorderLayout());
		Border borde = BorderFactory.createTitledBorder( "Panel centro" );
	      setBorder( borde );
		
	imagen = new JLabel();
	ImageIcon icono = new ImageIcon("imagen/logo_cajero.1.png");
	 imagen.setIcon(icono);
	add(imagen,BorderLayout.WEST);
	//this.add(imagen,BorderLayout.CENTER);
	
		lbenunciado = new JLabel("BIENVENIDO A CAJERO UDEC");
		lbenunciado.setForeground(Color.BLUE);
		lbenunciado.setFont(new Font("MonoSpaced",Font.ROMAN_BASELINE,20));
		add(lbenunciado,BorderLayout.CENTER);
	
		JLabel lbii = new JLabel("Inserte su tarjeta para iniciar");
	lbii.setFont(new Font("DialogInput",Font.BOLD,20));
	lbii.setForeground(Color.BLUE);
	add(lbii,BorderLayout.SOUTH);
	
	  String[] nombreFuentes=getToolkit().getFontList();
      for(int i=0; i<nombreFuentes.length; i++){
          System.out.println(nombreFuentes[i]);
      }	
	}
}
