/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadJava;

/**
 *
 * @author Gaston-PC
 */
public class Main {
    
    public static void main(String[] args){
        //Instanciar constructor vacio
        Caja c1 = new Caja();
        //Instancias constructor lleno
        Caja c2 = new Caja(3,2,6);
        System.out.println("El volumen de la caja 2 es: "+c2.calcularVolumen());
    }
    
}
