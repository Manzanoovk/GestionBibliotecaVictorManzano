/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import sistemagestionbiblioteca_victormanzano.*;
import java.util.*;
import java.sql.*;
import sistemagestionbiblioteca_victormanzano.Libro;
import sistemagestionbiblioteca_victormanzano.LibroDAO;

public class Controlador {
    private LibroDAO dao = new LibroDAO();

    public void agregarLibro(Libro libro) {
        try {
            dao.agregar(libro);
            System.out.println("✅ Libro agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al agregar libro: " + e.getMessage());
        }
    }

    public void listarLibros() {
        try {
            List<Libro> lista = dao.listar();
            if (lista.isEmpty()) {
                System.out.println("📭 No hay libros registrados.");
            } else {
                for (Libro l : lista) {
                    System.out.printf("[%d] %s, %s (%d)%n", l.getId(), l.getTitulo(), l.getAutor(), l.getAñoPublicacion());
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al listar libros: " + e.getMessage());
        }
    }

    public void actualizarLibro(Libro libro) {
        try {
            dao.actualizar(libro);
            System.out.println("✅ Libro actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar libro: " + e.getMessage());
        }
    }

    public void eliminarLibro(int id) {
        try {
            dao.eliminar(id);
            System.out.println("✅ Libro eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar libro: " + e.getMessage());
        }
    }
}