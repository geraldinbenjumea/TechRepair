package co.edu.uniquindio.poo.model;

public class TelefonoInteligente extends EquipoTecnologico{

    protected String sistemaOperativo;
    private float capacidadmAh;
    protected boolean compatible;

    public TelefonoInteligente(String codigo, String numeroSerie, String marca,
                               String añoFabricacion, String estado, TechPair ownedByTechPair, float almacenamiento,
                               String sistemaOperativo, float capacidadmAh, boolean compatible) {
        super(codigo, numeroSerie, marca, añoFabricacion, estado, ownedByTechPair, almacenamiento);
        this.sistemaOperativo=sistemaOperativo;
        this.capacidadmAh=capacidadmAh;
        this.compatible=compatible;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public float getCapacidadmAh() {
        return capacidadmAh;
    }

    public void setCapacidadmAh(float capacidadmAh) {
        this.capacidadmAh = capacidadmAh;
    }

    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }
}
