/*
 * • Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ServiciosEntidades;

import Comparadores.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import peliculasEntidades.Peliculas;

public class Servicios {
    
    public static void mostrarPeliculas(ArrayList arrayPeliculas){
        System.out.println("LAS PELICULAS SON : " + arrayPeliculas);
    }
    
    public static void mostrarPeliculasLargas(ArrayList arrayPeliculas){
          Iterator<Peliculas> it = arrayPeliculas.iterator();
          while(it.hasNext()){
              Peliculas p = it.next();
              if(p.getDuracion()>1){
                  System.out.println("La pelicula " + p.getTitulo() + " dura mas de 1 hora");
              }
          }
          System.out.println("-------------------------------------------------------------------------");
    }
    
    public static void ordenarDuracionDesc(ArrayList arrayPeliculas){
        Collections.sort(arrayPeliculas, Comparadores.compararDuracionDesc);
        mostrarPeliculas(arrayPeliculas);
    }
    
    public static void ordenarDuracionAsc (ArrayList arrayPeliculas){
        Collections.sort(arrayPeliculas, Comparadores.compararDuracionAsc);
        mostrarPeliculas(arrayPeliculas);
    }
    
    public static void ordenarTituloAlf(ArrayList arrayPeliculas){
        Collections.sort(arrayPeliculas, Comparadores.ordenarTituloAlf);
        mostrarPeliculas(arrayPeliculas);
    }
    
    public static void ordenarDirectorAlf(ArrayList arrayPeliculas){
        Collections.sort(arrayPeliculas, Comparadores.ordenarDirectorAlf);
        mostrarPeliculas(arrayPeliculas);
    }
}
