/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Controlador.LectorControlador;
import sistemagestionbiblioteca_victormanzano.Lector;
import java.util.Scanner;

public class MenuLectores {
    public static void mostrar(Scanner sc) {
        LectorControlador controlador = new LectorControlador();
        int opcion;

        do {
            System.out.println("--- Gestion de Lectores ---");
            System.out.println("1. Agregar Lector");
            System.out.println("2. Listar Lectores");
            System.out.println("3. Editar Lector");
            System.out.println("4. Eliminar Lector");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    controlador.agregarLector(new Lector(0, nombre, email));
                }
                case 2 -> controlador.listarLectores();
                case 3 -> {
                    System.out.print("ID del lector a editar: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nuevo email: ");
                    String email = sc.nextLine();
                    controlador.actualizarLector(new Lector(id, nombre, email));
                }
                case 4 -> {
                    System.out.print("ID del lector a eliminar: ");
                    int id = sc.nextInt(); sc.nextLine();
                    controlador.eliminarLector(id);
                }
                case 5 -> System.out.println("🔙 Volviendo...");
                default -> System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 5);
    }
}
