package com.mycompany.proteco_avanzado;



    public class Cliente {
    private String nombreCompleto;
    private double saldo;

    public Cliente(String nombreCompleto, double saldo) {
        this.nombreCompleto = nombreCompleto;
        this.saldo = saldo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCompleto + ", Saldo: " + saldo;
    }
}

