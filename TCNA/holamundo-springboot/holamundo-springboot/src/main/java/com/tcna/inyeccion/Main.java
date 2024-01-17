package com.tcna.inyeccion;

import com.tcna.inyeccion.dependencias.ServicioEnvio;
import com.tcna.inyeccion.dependencias.ServicioPDF;

public class Main {
    public static  void main(String[] args){
        ServicioImpresion sImp = new ServicioImpresion(new ServicioEnvio(), new ServicioPDF());
        sImp.imprimir( );
    }
}
