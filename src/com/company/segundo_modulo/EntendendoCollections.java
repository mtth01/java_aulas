package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class EntendendoCollections {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        System.out.println("-------------------------------------");
        aulas.remove(0);

        System.out.println(aulas);

        System.out.println("-------------------------------------");
        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        System.out.println("-------------------------------------");
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: "  + primeiraAula);

        System.out.println("-------------------------------------");
        for (int i = 0; i < aulas.size(); i++){
            System.out.println("aula: " + aulas.get(i));
        }

        System.out.println("-------------------------------------");
        // ver quanos elementos tem dentro de uma lista
        System.out.println(aulas.size());

        System.out.println("-------------------------------------");
        // isso quer dizer que: para cada aula execute esse trecho código...
        aulas.forEach(aula -> {
            System.out.println("percorrendo:");
            System.out.println("aula " + aula);
        });

        System.out.println("-------------------------------------");

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println("depois de ordenado: ");
        System.out.println(aulas);
    }
}
