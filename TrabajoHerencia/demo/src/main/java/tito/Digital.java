package tito;

public class Digital extends Recurso {

   private String formato; 
    private double tamanoMB;

    public Digital(String id, String titulo, String formato, double tamanoMB) {
        super(id, titulo);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarFichaTecnica() {
        System.out.println("---------------------------------------");
        System.out.println("[DIGITAL] ID: " + getId());
        System.out.println("Titulo: " + gettitulo());
        System.out.println("Estado: " + (isDisponible() ? "Disponible" : "Prestado"));
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamanoMB + " MB");
    }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    public double getTamanoMB() { return tamanoMB; }
    public void setTamanoMB(double tamanoMB) { this.tamanoMB = tamanoMB; }

}
