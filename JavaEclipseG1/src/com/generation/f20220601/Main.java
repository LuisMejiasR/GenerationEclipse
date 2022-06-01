package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		//herencia
		Mascota mascotaInstancia = new Mascota ();
		mascotaInstancia.setColor("Gris");
		mascotaInstancia.setNombre("Tom");
		
		Perro perro = new Perro ();
		perro.setColor("Marron");
		perro.setNombre("Iron");

		System.out.println(perro.toString());

		
		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("Pelo");
		
		
		System.out.println(gato.toString());
		//System.out.println(mascotaInstancia.toString());
		
		Mishi mishi = new Mishi(true);
		
		System.out.println(mishi.toString());
		
		/*Polimorfismo*/
		
		
		//creando una mascota nueva
		Mascota regalon = new Mascota("Blanco","Cannes","pelo","Toledo",3.5f,"masculino");
		
		//generando nuevas mascotas
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("negro");
		felix.setPeso(3);
		
		Mascota clifford = new Perro();
		clifford.setNombre("Cliford");
		clifford.setColor("Rojo");
		clifford.setPeso(500);
		
		
		//MUCHAS FORMAS DE RESPUESTA
		regalon.hacerSonido();//llamando al metodo en mascota
		felix.hacerSonido();
		clifford.hacerSonido();
		
		System.out.println("*************");
		List<Mascota> listaDeMascotas = new ArrayList<Mascota>(); //crear una lista
		listaDeMascotas.add(regalon); //añadiendo la mascota dentro de la lista
		listaDeMascotas.add(felix); //añadiendo la mascota dentro de la lista
		listaDeMascotas.add(clifford);//añadiendo la mascota dentro de la lista
		
		//recorrer el arreglo
		for (Mascota mascota2 : listaDeMascotas) {
			mascota2.hacerSonido();
		}
		
		//transformar el objeto
		Perro perroClifford = (Perro) clifford;
		perroClifford.setCantPaseos(6);
		
	}

}
