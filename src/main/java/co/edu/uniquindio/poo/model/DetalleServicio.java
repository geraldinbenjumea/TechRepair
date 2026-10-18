package co.edu.uniquindio.poo.model;

public class DetalleServicio {

    private String codigoDetalle;
    private EquipoTecnologico equipo;
    protected String descripcion;
    protected Tecnico tecnicoResponsable;
    private EstadoIntervencion estado;
    private float horas;
    protected String observaciones;
    protected String fallaReportada;

    private OrdenServicio ownedByOrdenServicio;

    public DetalleServicio(String codigoDetalle, EquipoTecnologico equipo, String descripcion, Tecnico tecnicoResponsable,
                           EstadoIntervencion estado, float horas, String observaciones, OrdenServicio ownedByOrdenServicio, String fallaReportada) {
        this.codigoDetalle = codigoDetalle;
        this.equipo = equipo;
        this.descripcion = descripcion;
        this.tecnicoResponsable = tecnicoResponsable;
        this.estado = estado;
        this.horas = horas;
        this.observaciones = observaciones;
        this.ownedByOrdenServicio = ownedByOrdenServicio;
        this.fallaReportada=fallaReportada;
    }

    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public EquipoTecnologico getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoTecnologico equipo) {
        this.equipo = equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tecnico getTecnicoResponsable() {
        return tecnicoResponsable;
    }

    public void setTecnicoResponsable(Tecnico tecnicoResponsable) {
        this.tecnicoResponsable = tecnicoResponsable;
    }

    public EstadoIntervencion getEstado() {
        return estado;
    }

    public void setEstado(EstadoIntervencion estado) {
        this.estado = estado;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public OrdenServicio getOwnedByOrdenServicio() {
        return ownedByOrdenServicio;
    }

    public void setOwnedByOrdenServicio(OrdenServicio ownedByOrdenServicio) {
        this.ownedByOrdenServicio = ownedByOrdenServicio;
    }

    public String getFallaReportada() {
        return fallaReportada;
    }

    public void setFallaReportada(String fallaReportada) {
        this.fallaReportada = fallaReportada;
    }
}
