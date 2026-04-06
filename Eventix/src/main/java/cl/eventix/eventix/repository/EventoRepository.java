package cl.eventix.eventix.repository;

import cl.eventix.eventix.model.Evento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventoRepository {

    private List<Evento> listaEventos = new ArrayList<>();
    
    public List<Evento> obtenerEventos() {
        return listaEventos;
    }

    public Evento buscarPorId(int id) {
        for (Evento e : listaEventos) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
 
    public Evento guardar(Evento evento) {
        listaEventos.add(evento);
        return evento;
    }

    public Evento actualizar(int id, Evento eventoActualizado) {
        for (Evento e : listaEventos) {
            if (e.getId() == id) {
                e.setNombre(eventoActualizado.getNombre());
                e.setTipo(eventoActualizado.getTipo());
                e.setFecha(eventoActualizado.getFecha());
                e.setUbicacion(eventoActualizado.getUbicacion());
                e.setCapacidad(eventoActualizado.getCapacidad());
                return e;
            }
        }
        return null;
    }
    
    public boolean eliminar(int id) {
        for (Evento e : listaEventos) {
            if (e.getId() == id) {
                listaEventos.remove(e);
                return true;
            }
        }
        return false;
    }
}