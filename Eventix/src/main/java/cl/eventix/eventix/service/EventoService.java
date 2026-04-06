package cl.eventix.eventix.service;

import cl.eventix.eventix.model.Evento;
import cl.eventix.eventix.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository repository;

    public List<Evento> obtenerEventos() {
        return repository.obtenerEventos();
    }

    public Evento buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public Evento guardar(Evento evento) {
        return repository.guardar(evento);
    }

    public Evento actualizar(int id, Evento evento) {
        return repository.actualizar(id, evento);
    }

    public boolean eliminar(int id) {
        return repository.eliminar(id);
    }

    
    public List<Evento> buscarPorTipo(String tipo) {
        List<Evento> resultado = new java.util.ArrayList<>();

        for (Evento e : repository.obtenerEventos()) {
            if (e.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(e);
            }
        }

        return resultado;
    }
}