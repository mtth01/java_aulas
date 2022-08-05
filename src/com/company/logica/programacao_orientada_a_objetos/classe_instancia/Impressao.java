package com.company.logica.programacao_orientada_a_objetos.classe_instancia;

public class Impressao {

    void informacao(String texto){
        System.out.println("[INFO] " + texto);
    }

    static void erro(String texto){
        System.out.println("[ERRO] " + texto);
    }
}
