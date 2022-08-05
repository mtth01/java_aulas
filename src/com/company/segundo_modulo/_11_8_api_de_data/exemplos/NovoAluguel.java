package com.company.segundo_modulo._11_8_api_de_data.exemplos;

import com.company.segundo_modulo._11_8_api_de_data.model.Aluguel;
import com.company.segundo_modulo._11_8_api_de_data.model.Carro;
import com.company.segundo_modulo._11_8_api_de_data.model.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matheus Loureiro", LocalDate.of(2003, Month.DECEMBER, 5));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now()
        , LocalTime.of(LocalTime.now().getHour(), 0));


        LocalDateTime dataEHoraPrevistaParaDevolucao =
                LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);

        imprimirRecibo(aluguel);

    }

    private static void imprimirRecibo(Aluguel aluguel) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getDataDeNascimento());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        System.out.println("Data e hor da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
        System.out.println("Data a hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
    }

}
