package com.tcna.inyeccion;

import com.tcna.inyeccion.dependencias.ServicioEnvio;
import com.tcna.inyeccion.dependencias.ServicioPDF;

public class ServicioImpresion {

    ServicioEnvio sEnv;
    ServicioPDF sPDF;

    public ServicioImpresion(ServicioEnvio sEnv, ServicioPDF sPDF){
        this.sEnv = new ServicioEnvio();
        this.sPDF = new ServicioPDF();
    }

    public void imprimir(){
        sEnv.envio();
        sPDF.pdf();
    }
}
