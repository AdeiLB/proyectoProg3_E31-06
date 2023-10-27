package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import domain.Usuario;
public class VentanaLoginUsuarios extends JFrame{
	
	

	JTextField tfNombreUsuario = new JTextField(15);
	JTextField tfContrasenya = new JTextField(15); 
	
	public VentanaLoginUsuarios(Set<Usuario> listaUsuarios) {
		setVisible(true);
		setName("AstroLone");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
//		Crear Contenedores
		JPanel pCentral = new JPanel(new GridLayout(2, 2));
		JPanel pBotones = new JPanel();
		JPanel superior = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		JMenu menuOpciones = new JMenu("Opciones");
		
//		Crear Componentes
		
		JLabel lUsuario = new JLabel("Nombre de usuario :");
		JLabel lContrasenya = new JLabel("Contraseña :");
		JButton bAceptar = new JButton("Iniciar sesion");
		JButton bCancelar = new JButton("Cancelar");
		JButton bRegistrar = new JButton("Registrar");
		JMenuItem itemOpciones = new JMenuItem("opciones");
//		Estilo Componentes
		
		tfNombreUsuario.setMaximumSize(getPreferredSize());
		tfContrasenya.setMaximumSize(new Dimension(150,2));
		
		
//		Estilo Contenedores
		
		
		pCentral.setMaximumSize(new Dimension(40, 1));
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
		menuOpciones.add(itemOpciones);
		menuBar.add(menuOpciones);
		
//		Añadir contenedores a Frame
		
		setJMenuBar(menuBar);
		add(superior,BorderLayout.NORTH);
		add(pCentral);
		add(pBotones,BorderLayout.SOUTH);
		
		setResizable(false);
//		*Listeners
		
		bCancelar.addActionListener(x->dispose());
		bAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(listaUsuarios.contains(new Usuario(tfNombreUsuario.getText()))) {
					JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre");
				}else {
					JOptionPane.showMessageDialog(null, "Has iniciado sesión adecuadamente");
				}
			}
		});
		
		
	}
}
