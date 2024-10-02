/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.pkg7;

import Productos.Producto;
import Pedidos.NotasEntrega;
import Pedidos.Pedido;
import Pedidos.Provedor;
import Ventas.Cajero;
import Ventas.Empleado;
import Ventas.Venta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Caso7 {

    public static String imprimir(ArrayList<Producto> listaProductos) {
        String lista = "";

        for (int i = 0; i < listaProductos.size(); i++) {
            lista = lista + listaProductos.get(i).getNombre() + " -- " + listaProductos.get(i).getPrecio() + " -- " + listaProductos.get(i).getCantidad() + "\n";
        }
        lista = lista + (listaProductos.size() + 1) + ". Salir";

        return lista;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //provedores
        Provedor provedor1 = new Provedor("Proveedor A", "001");
        Provedor provedor2 = new Provedor("Proveedor B", "002");
        Provedor provedor3 = new Provedor("Proveedor C", "003");
        ArrayList<Producto> inventario = new ArrayList<Producto>();
        //inventario
        inventario.add(new Producto("Producto 1", "P001", 10.99f, 50, provedor1));
        inventario.add(new Producto("Producto 2", "P002", 25.50f, 30, provedor2));
        inventario.add(new Producto("Producto 3", "P003", 15.75f, 20, provedor3));
        inventario.add(new Producto("Producto 4", "P004", 8.99f, 60, provedor1));
        inventario.add(new Producto("Producto 5", "P005", 99.99f, 10, provedor2));
        inventario.add(new Producto("Producto 6", "P006", 49.99f, 15, provedor3));
        inventario.add(new Producto("Producto 7", "P007", 5.50f, 100, provedor1));
        inventario.add(new Producto("Producto 8", "P008", 20.00f, 25, provedor2));
        inventario.add(new Producto("Producto 9", "P009", 30.75f, 40, provedor3));
        inventario.add(new Producto("Producto 10", "P010", 12.99f, 70, provedor1));

        //pedidos aun no aprobados
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

        //notas
        NotasEntrega nota = new NotasEntrega();
        
        //registrar ventas
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        
        
        //Cajeros para el login
        Cajero cajeros = new Cajero();
        
        cajeros.getCajeros().add(new Empleado("Juan", "123"));
        cajeros.getCajeros().add(new Empleado("Maria", "456"));
        cajeros.getCajeros().add(new Empleado("Pedro", "789"));

        
        
        //menu
        Scanner scanner = new Scanner(System.in);
        String nom = "", contra = "";
        Empleado sesion = null;
        int option;
        
        do{
            System.out.println("Introduce tu nombre");
            nom = scanner.next();
            System.out.println("Introduce tu contraseña");
            contra = scanner.next();
            
            sesion = cajeros.busquedaExist(contra, nom);
            System.out.println("\n \n \n");
        }while(sesion == null);
        

        do {
            
            int aux1 = 0, aux2 = 0;
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Hacer Pedido");
            System.out.println("2. Confirmar Peididos");
            System.out.println("3. Notas");
            System.out.println("4. Venta");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                //pedido
                case 1:
                    //se crea
                    Pedido p = new Pedido();
                    pedidos.add(p);
                    System.out.println(imprimir(inventario));
                    do {

                        System.out.println("Elige el producto");
                        aux1 = scanner.nextInt();

                        if ((aux1 > 0 && aux1 <= inventario.size())) {
                            System.out.println("Elige la cantidad");
                            aux2 = scanner.nextInt();
                            pedidos.get(pedidos.size() - 1).elegirCantidad(inventario.get(aux1 - 1), aux2);
                            System.out.println("\n");
                        }

                    } while (aux1 > 0 && aux1 <= inventario.size());

                    

                    break;

                case 2:
                    System.out.println("\n \n");
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("---------");
                        System.out.println("Pedido " + (i + 1));
                        System.out.println(pedidos.get(i).toString());
                        System.out.println("---------");
                    }

                    System.out.println("Aprobar pedido");
                    aux1 = scanner.nextInt();
                    
                    //se añadem a el inventario porque ya se resivieron
                    pedidos.get(aux1 - 1).agregarProductosInventario(inventario);
                    nota.añadirPedido(pedidos.get(aux1 - 1));
                    pedidos.remove(aux1 - 1);

                    break;
                case 3:

                    System.out.println("Imprimiendo Notas:");
                    System.out.println(nota.toString());

                    break;
                    
                case 4:
                    System.out.println("Pago: \n 1.En linea \n 2.fisico");
                    aux1 = scanner.nextInt();
                    boolean linea = (aux1 == 1);
                    Venta v = new Venta(sesion, linea);
                    ventas.add(v);
                    System.out.println(imprimir(inventario));
                    do {

                        System.out.println("Elige el producto");
                        aux1 = scanner.nextInt();

                        if ((aux1 > 0 && aux1 <= inventario.size())) {
                            System.out.println("Elige la cantidad");
                            aux2 = scanner.nextInt();
                            ventas.get(ventas.size() - 1).elegirCantidad(inventario.get(aux1 - 1), aux2);
                            System.out.println("\n");
                        }

                    } while (aux1 > 0 && aux1 <= inventario.size());
                    System.out.println("El saldo a pagar es de: "+ventas.get(ventas.size() - 1).precioTotal() + "\n Introducir importe a recibir");
                    aux1 = scanner.nextInt();
                    ventas.get(ventas.size() - 1).setImporteRecibido(aux1);
                    
                    System.out.println( ventas.get(ventas.size() - 1).generarTicket());
                    
                    ventas.get(ventas.size() - 1).DescuentoCantidad(inventario);
                    break;
                case 5:
                break;

                default:
                    System.out.println("Opción inválida, por favor intenta de nuevo.");
            }
        } while (option != 5);

        scanner.close();

    }

}
