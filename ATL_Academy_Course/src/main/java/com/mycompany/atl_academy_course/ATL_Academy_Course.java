/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atl_academy_course;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gaston-PC
 */
public class ATL_Academy_Course {

    public static void main(String[] args) throws IOException {

        System.out.print("Ingresar el primer numero: ");
        int num1 = Cargar_Numero();
        Analizar_ParImpar(num1);
        Analizar_Primo(num1);
        System.out.print("Ingresar el segundo numero: ");
        int num2 = Cargar_Numero();
        Analizar_ParImpar(num2);
        Analizar_Primo(num2);
        System.out.print("Ingresar el tercer numero: ");
        int num3 = Cargar_Numero();
        Analizar_ParImpar(num3);
        Analizar_Primo(num3);
        
        
        
        Calcular_NumMenor(num1,num2,num3);
        Calcular_NumMayor(num1,num2,num3);
        Calcular_Promedio(num1,num2,num3);
        
        
    }
    
    private static Integer Cargar_Numero()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(reader.readLine());
        
        return num;
    }
    
    private static void Analizar_ParImpar(Integer num){
        if(num%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
    private static void Analizar_Primo(Integer num){
        //Double number = Double.valueOf(num);
        
        String resultado="";
        if(num>2){
        for(int i=2;i<num;i++){
            Boolean primo=true;
            Integer o=2;
            while(o<i && primo){
                if(i%o==0){
                    primo=false;
                }
                o++;
            }
            if(primo){
                resultado+=i+", ";
            }
        }
        System.out.println("Los numeros primos hasta ese numero son: "+resultado);
        }
        else{
            System.out.println("No hay numeros primos hasta ese numero");
        }
    }
    
    private static void Calcular_Promedio(Integer num1, Integer num2,Integer num3){
        Double promedio = Double.valueOf(num1+num2+num3)/3;
        
        System.out.println("El promedio es: "+promedio);
    }
    
    private static void Calcular_NumMayor(Integer num1,Integer num2,Integer num3){
        if(num1>num2){
            if(num1>num3){
                System.out.println("El numero mayor es: "+num1);
            }else
                System.out.println("El numero mayor es: "+num3);
            
        }else{
                if(num2>num3){
                    System.out.println("El numero mayor es:´"+num2);
                }
            }
    }
    
    private static void Calcular_NumMenor(Integer num1,Integer num2,Integer num3){
        if(num1<num2){
            if(num1<num3){
                System.out.println("El numero menor es: "+num1);
            }else
                System.out.println("El numero menor es: "+num3);
            
        }else{
                if(num2<num3){
                    System.out.println("El numero menor es:´"+num2);
                }
            }
    }
}
