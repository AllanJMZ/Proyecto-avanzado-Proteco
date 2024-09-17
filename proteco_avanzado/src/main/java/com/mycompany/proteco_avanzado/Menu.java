package com.mycompany.proteco_avanzado;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Registrar a un cliente");
            System.out.println("2. Comprobar que tenga solo una cuenta registrada");
            System.out.println("3. Consultar si está registrado un cliente con su ID");
            System.out.println("4. Consultar el saldo de un cliente");
            System.out.println("5. Ver toda la colección de clientes");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Nombre completo del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Saldo inicial del cliente: ");
                    double saldo = scanner.nextDouble();
                    try {
                        banco.agregarCliente(new Cliente(nombre, saldo));
                        System.out.println("Cliente registrado exitosamente.");
                    } catch (ClienteYaRegistradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Nombre completo del cliente: ");
                    nombre = scanner.nextLine();
                    if (banco.buscarCliente(nombre) != null) {
                        System.out.println("El cliente tiene una cuenta registrada.");
                    } else {
                        System.out.println("El cliente no está registrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre completo del cliente: ");
                    nombre = scanner.nextLine();
                    Cliente cliente = banco.buscarCliente(nombre);
                    if (cliente != null) {
                        System.out.println("Cliente encontrado: " + cliente);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nombre completo del cliente: ");
                    nombre = scanner.nextLine();
                    cliente = banco.buscarCliente(nombre);
                    if (cliente != null) {
                        System.out.println("Saldo del cliente " + nombre + ": " + cliente.getSaldo());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 5:
                    banco.imprimirClientes();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
