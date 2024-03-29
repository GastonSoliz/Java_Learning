/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaGestion;

/**
 *
 * @author Gaston-PC
 */
public class Cliente {
    private String name;
    private String lastName;
    private String phone;
    private String mail;
    private String country;
    
    public Cliente(){
        System.out.println("Instanciamos un constructor vacio");
    }
    
    public Cliente(String n, String lN, String p, String m, String c){
        this.name = n;
        this.lastName = lN;
        this.phone = p;
        this.mail = m;
        this.country = c;
        System.out.println("Instanciamos un constructor con argumentosw");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String toString(){
        return (name+" "+lastName);
    }
}
