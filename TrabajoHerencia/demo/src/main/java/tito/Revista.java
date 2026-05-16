package tito;
public class Revista extends Recurso{
     
    private String mes;
    private String edicion;

    public Revista(String id, String titulo, String mes, String edicion) {
        super(id, titulo);
        this.mes = mes;
        this.edicion = edicion;
    }

    @Override
    public void mostrarFichaTecnica() {
        System.out.println("---------------------------------------");
        System.out.println("[REVISTA] ID: " + getId());
        System.out.println("Titulo: " + gettitulo());
        System.out.println("Estado: " + (isDisponible() ? "Disponible" : "Prestado"));
        System.out.println("Mes: " + mes);
        System.out.println("Edición: " + edicion);
    }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }
    public String getEdicion() { return edicion; }
    public void setEdicion(String edicion) { this.edicion = edicion; }
}
