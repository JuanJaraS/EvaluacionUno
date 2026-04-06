package cl.eventix.eventix.controller;

import cl.eventix.eventix.model.Evento;
import cl.eventix.eventix.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eventos")
public class EventoController {

    @Autowired
    private EventoService service;

   
    @GetMapping
    public List<Evento> obtenerEventos() {
        return service.obtenerEventos();
    }
    
    @GetMapping("/{id}")
    public Evento obtenerPorId(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Evento guardar(@RequestBody Evento evento) {
        return service.guardar(evento);
    }

    @PutMapping("/{id}")
    public Evento actualizar(@PathVariable int id, @RequestBody Evento evento) {
        return service.actualizar(id, evento);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id) {
        boolean eliminado = service.eliminar(id);

        if (eliminado) {
            return "Evento eliminado";
        } else {
            return "Evento no encontrado";
        }
    }
   
    @GetMapping("/tipo/{tipo}")
    public List<Evento> buscarPorTipo(@PathVariable String tipo) {
        return service.buscarPorTipo(tipo);
    }
}
