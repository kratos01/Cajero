import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelArriba extends JPanel {

	public PanelArriba() {
		 setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );
	        ImageIcon icono = new ImageIcon( "imagen/logo_cajero.png" );
	      
	        
	        imagen.setIcon( icono );
	        //Define el icono que mostrará este componente.
	        imagen.setHorizontalAlignment( JLabel.CENTER );
	        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
	        
	        add( imagen, BorderLayout.CENTER );
	        //ubicacion de mi imagen dentro del panel
	        
	        setBackground( Color.WHITE );
	
	}
	
}
