package gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;
public class VentanaLoginUsuarios extends JFrame{
	
	

	JTextField tfNombreUsuario = new JTextField(15);
	JTextField tfContrasenya = new JTextField(15); 
	
	public VentanaLoginUsuarios() {
		setVisible(true);
		setName("AstroLone");
		setSize(640,420);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
//		Crear Contenedores
		JPanel pCentral = new JPanel(new GridLayout(2, 2));
		JPanel pBotones = new JPanel();
		JPanel superior = new JPanel();
//		Crear Componentes
		
		JLabel lUsuario = new JLabel("Nombre de usuario :");
		JLabel lContrasenya = new JLabel("Contraseña :");
		JButton bAceptar = new JButton("Iniciar sesion");
		JButton bCancelar = new JButton("Cancelar");
		JButton bRegistrar = new JButton("Registrar");
		
//		Estilo Componentes
		
		tfNombreUsuario.setMaximumSize(getPreferredSize());
		tfContrasenya.setMaximumSize(getPreferredSize());
//		Estilo Contenedores
		pCentral.setMaximumSize(getPreferredSize());
		pBotones.setMaximumSize(getPreferredSize());
//		pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
//		Asignar componentes a contenedores
		
		pCentral.add(lUsuario);
		pCentral.add(tfNombreUsuario);
		pCentral.add(lContrasenya);
		pCentral.add(tfContrasenya);
		pBotones.add(bCancelar);
		pBotones.add(bRegistrar);
		pBotones.add(bAceptar);
		
		
		
		add(superior,BorderLayout.NORTH);
		add(pCentral);
		add(pBotones,BorderLayout.SOUTH);
		
		
		
		
		
		
		
	}
}
