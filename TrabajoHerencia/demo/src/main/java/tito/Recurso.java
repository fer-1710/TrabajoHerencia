package tito;

public abstract class Recurso {
    private String id;
    private String titulo;
    private boolean disponible;

    public Recurso(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract void mostrarFichaTecnica();
}