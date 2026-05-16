package tito;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca  {
    
    private List<Recurso> inventario;
    
    public Biblioteca(){
        this.inventario = new ArrayList<>();
    }

    public void registrarRecurso(Recurso r){
        if(r != null)
            inventario.add(r);
        }

        public List<Recurso> filtrarPorTipo(Class<? extends Recurso> tipoClase) {
        List<Recurso> sublista = new ArrayList<>();
        for (Recurso r : inventario) {
    
            if (tipoClase.isInstance(r)) {
                sublista.add(r);
            }
        }
        return sublista;
    }

    public Recurso buscarPorId(String id) {
        for (Recurso r : inventario) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

    
    public void mostrarInventario() {
        for (Recurso r : inventario) {
            r.mostrarFichaTecnica(); 
        }
    }
}
   


