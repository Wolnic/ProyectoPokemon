/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica;

import java.util.Scanner;

public class Main {

    // Clase Nodo implementada dentro de Main
    public static class Nodo {
        String nombre;
        int prioridad;
        int llegada;
        Nodo siguiente;

        public Nodo(String nombre, int prioridad, int llegada) {
            this.nombre = nombre;
            this.prioridad = prioridad;
            this.llegada = llegada;
            this.siguiente = null;
        }

        public String getNombre() {
            return nombre;
        }

        public int getPrioridad() {
            return prioridad;
        }

        public int getLlegada() {
            return llegada;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }

    // Clase ColaPrioridad implementada dentro de Main
    public static class ColaPrioridad {
        private Nodo cabeza = null;
        private int tiempo = 0;

        // Método para insertar un cliente en la cola
        public void insertar(String nombre, int prioridad) {
            Nodo nuevo = new Nodo(nombre, prioridad, tiempo++);
            if (cabeza == null || cabeza.getPrioridad() < prioridad ||
                (cabeza.getPrioridad() == prioridad && cabeza.getLlegada() > nuevo.getLlegada())) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                return;
            }

            Nodo actual = cabeza;
            while (actual.getSiguiente() != null &&
                   (actual.getSiguiente().getPrioridad() > prioridad ||
                    (actual.getSiguiente().getPrioridad() == prioridad && actual.getSiguiente().getLlegada() < nuevo.getLlegada()))) {
                actual = actual.getSiguiente();
            }

            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }

        // Método para aumentar la prioridad de un cliente específico
        public void aumentarPrioridad(char letra, int incremento) {
            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.getNombre().charAt(0) == letra) {
                    actual.prioridad += incremento;
                    break;
                }
                actual = actual.getSiguiente();
            }
            reordenarCola();
        }

        // Método para atender al siguiente cliente con mayor prioridad
        public String atender() {
            if (cabeza == null) {
                return null;
            }
            String nombreAtendido = cabeza.getNombre();
            cabeza = cabeza.getSiguiente();
            return nombreAtendido;
        }

        // Método para reordenar la cola de prioridad
        private void reordenarCola() {
            if (cabeza == null || cabeza.getSiguiente() == null) return;

            Nodo nuevaCabeza = null;
            Nodo actual = cabeza;

            while (actual != null) {
                Nodo siguiente = actual.getSiguiente();
                actual.setSiguiente(null);

                if (nuevaCabeza == null || nuevaCabeza.getPrioridad() < actual.getPrioridad() ||
                    (nuevaCabeza.getPrioridad() == actual.getPrioridad() && nuevaCabeza.getLlegada() > actual.getLlegada())) {
                    actual.setSiguiente(nuevaCabeza);
                    nuevaCabeza = actual;
                } else {
                    Nodo aux = nuevaCabeza;
                    while (aux.getSiguiente() != null &&
                           (aux.getSiguiente().getPrioridad() > actual.getPrioridad() ||
                            (aux.getSiguiente().getPrioridad() == actual.getPrioridad() && aux.getSiguiente().getLlegada() < actual.getLlegada()))) {
                        aux = aux.getSiguiente();
                    }
                    actual.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(actual);
                }
                actual = siguiente;
            }
            cabeza = nuevaCabeza;
        }
    }

    // Método main donde ejecutas la lógica
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solicitar al usuario la cantidad de eventos a procesar
        System.out.println("Introduce la cantidad de eventos");
        int ee = in.nextInt();  // Cantidad de eventos a procesar

        if (ee < 1 || ee > 50000) {
            System.out.println("Cantidad Invalida");
            return;
        }

        ColaPrioridad cola = new ColaPrioridad();

        // Procesar cada evento ingresado por el usuario
        for (int i = 0; i < ee; i++) {
            System.out.println("Introduce el tipo de evento (C, S, A)");

            String evento = in.next();  // Lee el tipo de evento (C, S, A)

            switch (evento) {
                case "C":  // Insertar cliente
                    System.out.println("Introduce el nombre del cliente y la prioridad");
                    String nombre = in.next();
                    int prioridad = in.nextInt();
                    cola.insertar(nombre, prioridad);
                    break;

                case "S":  // Aumentar prioridad
                    System.out.println("Introduce la letra del cliente y el incremento de prioridad");
                    char letra = in.next().toUpperCase().charAt(0);
                    int incremento = in.nextInt();
                    cola.aumentarPrioridad(letra, incremento);
                    break;

                case "A":  // Atender cliente
                    String atendido = cola.atender();
                    if (atendido != null) {
                        System.out.println(atendido);
                    } else {
                        System.out.println("No hay clientes para atender");
                    }
                    break;

                default:
                    System.out.println("Opción inválida");
                    return;
            }
        }

        in.close();
    }
}