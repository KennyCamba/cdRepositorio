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
public class Cancion {

   private String titulo;
   private String autor;
   private int duracion;
   
   public Cancion(String titulo, String autor, int duracion){
       this.titulo = titulo;
       this.autor = autor;
       this.duracion = duracion;
   } 
   
   public Cancion(){
   
   }
   
   public String getTitulo(){
       return this.titulo;
   }
   
   public String getAutor(){
       return this.autor;
   }
    
   public int getDuracion(){
       return this.duracion;
   }
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public void setDuracion(int duracion){
       this.duracion = duracion;
   }
   
   public void mostrarTiempoMinutos(){
       System.out.println(this.duracion/60);
   }
}
