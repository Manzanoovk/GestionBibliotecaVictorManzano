/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Controlador.Controlador;
import sistemagestionbiblioteca_victormanzano.Libro;
import java.util.Scanner;

public class MenuLibros {
    public static void mostrar(Scanner sc) {
        Controlador controlador = new Controlador();
        int opcion;

        do {
            System.out.println("--- Gestion de Libros ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Listar Libros");
            System.out.println("3. Editar Libro");
            System.out.println("4. Eliminar Libro");
            System.out.println("5. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año de publicacion: ");
                    int año = sc.nextInt(); sc.nextLine();
                    controlador.agregarLibro(new Libro(0, titulo, autor, año));
                }
                case 2 -> controlador.listarLibros();
                case 3 -> {
                    System.out.print("ID del libro a editar: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nuevo titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Nuevo autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Nuevo año de publicacion: ");
                    int año = sc.nextInt(); sc.nextLine();
                    controlador.actualizarLibro(new Libro(id, titulo, autor, año));
                }
                case 4 -> {
                    System.out.print("ID del libro a eliminar: ");
                    int id = sc.nextInt(); sc.nextLine();
                    controlador.eliminarLibro(id);
                }
                case 5 -> System.out.println("🔙 Volviendo...");
                default -> System.out.println("❌ Opción invalida.");
            }
        } while (opcion != 5);
    }
}