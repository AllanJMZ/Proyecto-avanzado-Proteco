package com.mycompany.proteco_avanzado;

import java.util.ArrayList;


public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) throws ClienteYaRegistradoException {
        for (Cliente c : clientes) {
            if (c.getNombreCompleto().equals(cliente.getNombreCompleto())) {
                throw new ClienteYaRegistradoException("El cliente ya está registrado.");
            }
        }
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String nombreCompleto) {
        for (Cliente c : clientes) {
            if (c.getNombreCompleto().equals(nombreCompleto)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void imprimirClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}