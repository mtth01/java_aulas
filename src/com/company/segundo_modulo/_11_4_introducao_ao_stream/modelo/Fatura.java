package com.company.segundo_modulo._11_4_introducao_ao_stream.modelo;

public class Fatura {

    private String email;
    private double Valor;

    public Fatura(String email, double valor) {
        this.email = email;
        Valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public boolean estarEmRisco(){
        return Valor >= 250 ? true : false;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "email='" + email + '\'' +
                ", Valor=" + Valor +
                '}';
    }
}
