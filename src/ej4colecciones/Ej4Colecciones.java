/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4colecciones;

import ServiciosEntidades.Servicios;
import java.util.ArrayList;
import java.util.Scanner;
import peliculasEntidades.Peliculas;

/**
 *
 * @author Leandro
 */
public class Ej4Colecciones {

   
    public static void main(String[] args) {
        ArrayList<Peliculas> arrayPeliculas = new ArrayList();
        boolean seguir = true;
        Scanner leer = new Scanner (System.in);
        
        while(seguir){
            System.out.println("Ingrese el nombre de la pelicula");
            String nombre=leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String director= leer.next();
            System.out.println("Ingrese la duracion de la pelicula");
            int duracion= leer.nextInt();
            arrayPeliculas.add(new Peliculas(nombre,director,duracion));
            
            System.out.println("¿QUIERE CONTINUAR? S/N");
            String preg = leer.next();
            seguir = !"n".equals(preg);
        }
        
          Servicios.mostrarPeliculasLargas(arrayPeliculas);
          Servicios.mostrarPeliculas(arrayPeliculas);
          Servicios.ordenarDuracionDesc(arrayPeliculas);
          Servicios.ordenarDuracionAsc(arrayPeliculas);
          Servicios.ordenarTituloAlf(arrayPeliculas);
          Servicios.ordenarDirectorAlf(arrayPeliculas);
          
          
    }
    
}
