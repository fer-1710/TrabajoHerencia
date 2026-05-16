package tito;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca(); 

        Recurso libro1 = new Libro("1001", "Cien años de soledad", "Gabriel García Márquez", 471); 
        Recurso revista1 = new Revista("R001", "National Geographic", "Mayo", "245"); 
        Recurso digital1 = new Digital("D001", "Java Core Concepts", "PDF", 14.5);

        miBiblioteca.registrarRecurso(libro1); 
        miBiblioteca.registrarRecurso(revista1); 
        miBiblioteca.registrarRecurso(digital1);


        System.out.println("=== INVENTARIO COMPLETO ===");
        miBiblioteca.mostrarInventario();

        System.out.println("\n=== FILTRANDO SOLO REVISTAS ===");
        List<Recurso> revistas = miBiblioteca.filtrarPorTipo(Revista.class);
        for (Recurso r : revistas) {
            r.mostrarFichaTecnica();
        }

        System.out.println("\nBuscando recurso 1001...");
        Recurso encontrado = miBiblioteca.buscarPorId("1001"); 
        if (encontrado != null) { 
            System.out.println("Resultado de búsqueda: " + encontrado.gettitulo()); 
            encontrado.mostrarFichaTecnica();
        }
    }
 }