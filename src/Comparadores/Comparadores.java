/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import java.util.Comparator;
import peliculasEntidades.Peliculas;

public class Comparadores {

    public static Comparator<Peliculas> compararDuracionAsc = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Peliculas> compararDuracionDesc = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Peliculas> ordenarTituloAlf = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
     public static Comparator<Peliculas> ordenarDirectorAlf = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
}
