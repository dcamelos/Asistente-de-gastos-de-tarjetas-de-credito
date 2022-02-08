package Datos;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        // número de identificación
        int id = 1;
        // Crear una tabla hash
        HashTab hashTab = new HashTab(10);
        String key = "";
        String key2 = "";
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("add: add del: delete list: show find: find exit: exit");
            key = input.next();
            switch (key) {
                case "add":
                    System.out.print("Ingrese nombre:");
                    String name = input.next();
                    String a=input.next();
                    long b =input.nextInt();
                    int c =input.nextInt();
                    // Crear empleado
                    Compras emp = new Compras(name,a,b,c,id++);
                    hashTab.AgregarHT(emp);
                    break;
                case "del":
                    System.out.println("Introducir clave");
                    hashTab.EliminarHT(input.nextInt());
                    break;
                case "list":
                    hashTab.MostrarTodoHT();
                    break;
                case "find":
                    System.out.println("Introducir clave");
                    hashTab.BuscarHT(input.nextInt());
                    break;
                case "exit":
                    input.close();
                    System.exit(0);
                    break;
                case "change":
                    System.out.println("que desea cambiar");
                    key2 = input.next();
                    switch (key2){
                        case "todo":
                            Compras r = hashTab.Seleccionar(input.nextInt());
                            String name2 = input.next();
                            String a2=input.next();
                            int b2 =input.nextInt();
                            int c2 =input.nextInt();
                            hashTab.changeHT(r,name2,a2,b2,c2);
                            break;
                        case "nombre":
                            hashTab.changeNombreHT(hashTab.Seleccionar(input.nextInt()),input.next());
                            break;
                        case "fecha":
                            hashTab.changeFechaHT(hashTab.Seleccionar(input.nextInt()),input.next());
                            break;
                        case "cc":
                            hashTab.changeNdeCuotasHT(hashTab.Seleccionar(input.nextInt()),input.nextInt());
                            break;
                        case "vc":
                            hashTab.changeValorCuotaHT(hashTab.Seleccionar(input.nextInt()),input.nextLong());
                            break;
                    }
                default:
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }

}
