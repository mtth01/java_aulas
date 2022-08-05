package com.company.segundo_modulo._11_8_api_de_data.exemplos;

import com.company.segundo_modulo._11_8_api_de_data.model.Cliente;

import java.time.LocalDate;
import java.time.Month;

public class CadastroCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matheus Loureiro", LocalDate.of(2003, Month.DECEMBER, 05));

    }
}
