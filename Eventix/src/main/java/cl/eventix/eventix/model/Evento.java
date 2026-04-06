package cl.eventix.eventix.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    private int id;
    private String nombre;
    private String tipo;
    private String fecha;
    private String ubicacion;
    private int capacidad;

}