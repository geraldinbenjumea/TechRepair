package co.edu.uniquindio.poo.model;

public abstract class Servicio {
    protected String codigo;
    private String nombre;
    public String descripcion;
    protected double tarifaBase;

    private TechPair ownedByTechPair;

    public Servicio(String codigo, String nombre, String descripcion, double tarifaBase, TechPair ownedByTechPair) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarifaBase = tarifaBase;
        this.ownedByTechPair = ownedByTechPair;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public TechPair getOwnedByTechPair() {
        return ownedByTechPair;
    }

    public void setOwnedByTechPair(TechPair ownedByTechPair) {
        this.ownedByTechPair = ownedByTechPair;
    }

    public abstract double calcularCostoServicio();
}
