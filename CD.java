/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancion;

/**
 *
 * @author Municipio de Kenny Camba
 */
public class CD {
    
    private Cancion[] canciones;
    private int contador;
    
    public CD(int tamano){
        canciones = new Cancion[tamano];
    }
    
    public int numeroCanciones(){
        contador = canciones.length;
        return contador;
    }
    
    public Cancion getCancion(int index){
        return canciones[index];
    }
    
    public void agregar(int index, Cancion cancion){
        this.canciones[index] = cancion;
    }
}
