package co.edu.uniquindio.poo.model;

public class ComputadorPortatil extends EquipoTecnologico {
    private float tamañoPantalla;
    protected float RAM;
    protected boolean bateriaExtraible;


    public ComputadorPortatil(String codigo, String numeroSerie, String marca, String añoFabricacion,
                              String estado, TechPair ownedByTechPair, float almacenamiento,
                              float tamañoPantalla, float RAM, boolean bateriaExtraible) {
        super(codigo, numeroSerie, marca, añoFabricacion, estado, ownedByTechPair,
                almacenamiento);

        this.tamañoPantalla=tamañoPantalla;
        this.RAM=RAM;
        this.bateriaExtraible=bateriaExtraible;
    }

    public float getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(float tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public float getRAM() {
        return RAM;
    }

    public void setRAM(float RAM) {
        this.RAM = RAM;
    }

    public boolean isBateriaExtraible() {
        return bateriaExtraible;
    }

    public void setBateriaExtraible(boolean bateriaExtraible) {
        this.bateriaExtraible = bateriaExtraible;
    }
}
