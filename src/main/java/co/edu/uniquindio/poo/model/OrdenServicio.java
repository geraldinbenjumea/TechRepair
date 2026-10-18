package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio {
    private String codigoUnico;
    protected LocalDate fecha;
    protected String descripcion;
    protected EstadoOrden estado;
    private List <DetalleServicio> listaDetalles= new ArrayList<>();

    public OrdenServicio(String codigoUnico, LocalDate fecha, String descripcion, EstadoOrden estado,
                         List<DetalleServicio> listaDetalles) {
        this.codigoUnico = codigoUnico;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.listaDetalles = listaDetalles;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }

    public List<DetalleServicio> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<DetalleServicio> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }
}
