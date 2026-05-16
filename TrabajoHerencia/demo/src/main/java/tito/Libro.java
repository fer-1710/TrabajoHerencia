package tito;

public class Libro extends Recurso {

    protected String autor;
    protected int paginas;
    
    public Libro(String id, String titulo, String autor, int paginas){
        super(id, titulo);
        this.autor=autor;
        this.paginas=paginas;
    }
    
    @Override
    public void mostrarFichaTecnica() {
       System.out.println("---------------------------------------");
        System.out.println("[LIBRO] ID: " + getId());
        System.out.println("Titulo: " + gettitulo());
        System.out.println("Estado: " + (isDisponible() ? "Disponible" : "Prestado"));
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }


    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public int getPaginas() { return paginas; }
    public void setPaginas(int paginas) { this.paginas = paginas; }
    }

