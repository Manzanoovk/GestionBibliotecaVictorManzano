/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import sistemagestionbiblioteca_victormanzano.*;
import java.sql.*;
import java.util.*;

public class LectorControlador {
    private LectorDAO dao = new LectorDAO();

    public void agregarLector(Lector lector) {
        try {
            dao.agregar(lector);
            System.out.println("✅ Lector agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al agregar lector: " + e.getMessage());
        }
    }

    public void listarLectores() {
        try {
            List<Lector> lista = dao.listar();
            if (lista.isEmpty()) {
                System.out.println("📭 No hay lectores registrados.");
            } else {
                for (Lector l : lista) {
                    System.out.printf("[%d] %s - %s%n", l.getId(), l.getNombre(), l.getEmail());
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al listar lectores: " + e.getMessage());
        }
    }

    public void actualizarLector(Lector lector) {
        try {
            dao.actualizar(lector);
            System.out.println("✅ Lector actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar lector: " + e.getMessage());
        }
    }

    public void eliminarLector(int id) {
        try {
            dao.eliminar(id);
            System.out.println("✅ Lector eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar lector: " + e.getMessage());
        }
    }
}
