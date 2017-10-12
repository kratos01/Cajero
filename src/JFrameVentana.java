import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class JFrameVentana extends JFrame  {

	public JFrameVentana() {
	super("CAJERO UDEC");
	iniciar();
	Componentes();
	
	this.setVisible(true);
	pack();
	this.setLocationRelativeTo(null);
	
}
	public void iniciar() {
	Dimension dm = new Dimension(600,600);	
	this.setSize(dm);
	this.setPreferredSize(dm);
	this.setLayout(new BorderLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void Componentes() {
	 PanelArriba pa = new PanelArriba();
	 add( pa , BorderLayout.NORTH);

	 PanelIzquierdo pi = new PanelIzquierdo();
	 add(pi, BorderLayout.WEST);

	 PanelCentro pc = new PanelCentro();
	 add(pc,BorderLayout.CENTER);
	 
	//PanelCentroFuncional pcf= new PanelCentroFuncional();
	//add(pcf,BorderLayout.CENTER);
	 
	 PanelDerecho pd = new PanelDerecho();
	 add(pd , BorderLayout.EAST);
	 
	 PanelAbajo ab = new PanelAbajo();
	 
	 add(ab,BorderLayout.SOUTH);
	}
}
