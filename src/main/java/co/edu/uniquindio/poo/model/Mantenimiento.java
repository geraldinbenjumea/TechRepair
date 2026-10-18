package co.edu.uniquindio.poo.model;

public class Mantenimiento extends Servicio{
    public Mantenimiento(String codigo, String nombre, String descripcion, double tarifaBase, TechPair ownedByTechPair) {
        super(codigo, nombre, descripcion, tarifaBase, ownedByTechPair);
    }
}
