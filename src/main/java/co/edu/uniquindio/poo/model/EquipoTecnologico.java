package co.edu.uniquindio.poo.model;

public abstract class EquipoTecnologico {

    private String codigo;
    protected String numeroSerie;
    public String marca;
    public String añoFabricacion;
    private String estado;
    private float almacenamiento;

    private TechPair ownedByTechPair;

    public EquipoTecnologico(String codigo, String numeroSerie, String marca, String añoFabricacion,
                             String estado, TechPair ownedByTechPair, float almacenamiento) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
        this.estado = estado;
        this.ownedByTechPair = ownedByTechPair;
        this.almacenamiento = almacenamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public TechPair getOwnedByTechPair() {
        return ownedByTechPair;
    }

    public void setOwnedByTechPair(TechPair ownedByTechPair) {
        this.ownedByTechPair = ownedByTechPair;
    }

}
