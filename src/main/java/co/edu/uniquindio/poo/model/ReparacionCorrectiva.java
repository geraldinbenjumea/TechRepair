package co.edu.uniquindio.poo.model;

public class ReparacionCorrectiva extends Servicio{

    private final float COSTO_HORA=45000;

    public ReparacionCorrectiva(String codigo, String nombre, String descripcion, double tarifaBase, TechPair ownedByTechPair) {
        super(codigo, nombre, descripcion, tarifaBase, ownedByTechPair);
    }
}
