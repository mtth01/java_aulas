package com.company.segundo_modulo._11_4_introducao_ao_stream.dao;

import com.company.segundo_modulo._11_4_introducao_ao_stream.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarTodasFaturas(){
        //obviamente voce buscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("matheus@gmail.com", 350.0));
        faturas.add(new Fatura("maria@gmail.com", 150.0));
        faturas.add(new Fatura("joao@gmail.com", 290.0));

        return faturas;

    }

}
