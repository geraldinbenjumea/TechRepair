package co.edu.uniquindio.poo.model;

public class Tecnico {

    private String codigo;
    private String nombre;
    protected String documentoIdentidad;
    private boolean activo;
    private final Especialidad especialidad;

    private TechPair ownedByTechPair;

    public Tecnico(Especialidad especialidad, String codigo, String nombre,
                   String documentoIdentidad, boolean activo, TechPair ownedByTechPair) {
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.activo = activo;
        this.ownedByTechPair = ownedByTechPair;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public TechPair getOwnedByTechPair() {
        return ownedByTechPair;
    }

    public void setOwnedByTechPair(TechPair ownedByTechPair) {
        this.ownedByTechPair = ownedByTechPair;
    }
}
