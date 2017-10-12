import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDerecho extends JPanel{

	private JButton btn4,btn5;
	
	public PanelDerecho() {
		componentes();
	}
	
	public void componentes() {
		
		this.setLayout(new GridBagLayout());
		 Border borde = BorderFactory.createTitledBorder( "Panel Derecho" );
	      setBorder( borde );
		
	      GridBagConstraints co = new GridBagConstraints(); 
	      Insets insets = new Insets( 5, 10, 5, 10 );
	      co.insets = insets;
		
		
		btn4 = new JButton("OK");
		co = new GridBagConstraints( );
	    co.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    co.gridy = 1;//
	    co.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	    insets = new Insets( 20, 10, 5, 10 );
	    co.insets = insets;	        
	    add( btn4, co);
		
		btn5 = new JButton("OK");
		co = new GridBagConstraints( );
	    co.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    co.gridy = 2;//
	    co.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	    insets = new Insets( 5, 10, 20, 10 );
	    co.insets = insets;	        
	    add( btn5, co);
		
	}
	
}
