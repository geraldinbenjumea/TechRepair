package co.edu.uniquindio.poo.model;

public class Diagnostico extends Servicio{

    private final float COSTO_FIJO= 35000;

    public Diagnostico(String codigo, String nombre, String descripcion, double tarifaBase, TechPair ownedByTechPair) {
        super(codigo, nombre, descripcion, tarifaBase, ownedByTechPair);
    }
}
