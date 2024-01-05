/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadJava;

/**
 *
 * @author Gaston-PC
 */
public class Caja {
    private int ancho;
    private int alto;
    private int profundo;
    
    public Caja(){
        System.out.println("Instancia de constructor vacio");
    }
    
    public Caja(int an, int al, int pr){
        System.out.println("Instancia de constructor con argumentos");
        this.ancho = an;
        this.alto = al;
        this.profundo = pr;
    }
    
    public int calcularVolumen(){
        return this.ancho*this.alto*this.profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    
}
