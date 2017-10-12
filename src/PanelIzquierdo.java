import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelIzquierdo extends JPanel{
private JButton btn1,btn2,btn3,btn4;

public PanelIzquierdo() {
componentes();
}
public void componentes() {
	
	this.setLayout(new GridBagLayout());
	  Border borde = BorderFactory.createTitledBorder( "Panel Izquierdo" );
      setBorder( borde );
	
      GridBagConstraints co = new GridBagConstraints(); 
      Insets insets = new Insets( 5, 10, 5, 10 );
      co.insets = insets;
	
	
	btn1 = new JButton("OK");
	co = new GridBagConstraints( );
    co.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
    co.gridy = 1;//
    co.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
    insets = new Insets( 5, 10, 5, 10 );
    co.insets = insets;	        
    add( btn1, co);
	
	btn2 = new JButton("OK");
	co = new GridBagConstraints( );
    co.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
    co.gridy = 2;//
    co.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
    insets = new Insets( 15, 10, 15, 10 );
    co.insets = insets;	        
    add( btn2, co);
	
	btn3 = new JButton("OK");
	co = new GridBagConstraints( );
    co.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
    co.gridy = 3;//
    co.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
    insets = new Insets( 5, 10, 5, 10 );
    co.insets = insets;	        
    add( btn3, co);

}


}
