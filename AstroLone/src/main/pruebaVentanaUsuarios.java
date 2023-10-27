package main;

import java.util.HashSet;
import java.util.Set;

import domain.Usuario;
import gui.VentanaLoginUsuarios;

public class pruebaVentanaUsuarios {
	public static void main(String[] args) {
		System.out.println("hola");
		Set<Usuario> listaUsuarios = new HashSet<>(); 
		listaUsuarios.add(new Usuario("Victor","Hola"));
		listaUsuarios.add(new Usuario("iker"));
		
		VentanaLoginUsuarios vent = new VentanaLoginUsuarios(listaUsuarios);
		vent.pack();
		
	}
}
