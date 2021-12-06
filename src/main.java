package com.estructuraDeDatos;



import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        DynamicArray<Compras> compras = new DynamicArray();
        boolean corriendo = true;
        do {
            Scanner accion = new Scanner(System.in);
            System.out.println("Que operacion desea hacer?");
            System.out.println("1. insertar una compra ");
            System.out.println("2.eliminar una compra");
            System.out.println("3.modificar compra");
            System.out.println("4.consultar compras");
            System.out.println("5.salir");
            int opcion = accion.nextInt();

            if (opcion == 1) {
                System.out.println("Nombre de la compra");
                String nombre = accion.next();
                System.out.println("Nombre de la fecha de compra dd//mm/aaaa");
                String fecha = accion.next();
                System.out.println("valor de la cuota");
                Long valorCuota = accion.nextLong();
                System.out.println("numero de cuotas");
                int NumeroCuotas = accion.nextInt();

                Compras a = new Compras(nombre,fecha,valorCuota,NumeroCuotas);

               // compras.añadir((Class<com.estructuraDeDatos.Compras>) Compras,a);

            } else if (opcion == 2) {
                System.out.println("Que compra desea eliminar?");
                compras.eliminar(1);
            } else if (opcion == 3) {
                System.out.println("Que compra desea modificar?");
                //compras.modificar(1,"hola");

            } else if (opcion == 4) {
                System.out.println("Que compra desea mostrar?");
                //compras.mostrar(1);

            }else if (opcion == 5) {
                corriendo =false;

            } else {
                System.out.println("ERROR");
            }
        }while (corriendo);


    }
}
