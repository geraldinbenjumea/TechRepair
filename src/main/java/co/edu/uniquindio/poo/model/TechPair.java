package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TechPair {
    private String nombre;
    private String ciudad;
    private String departamento;

    protected List <Cliente> listaClientes= new ArrayList<>();
    protected List <Tecnico> listaTecnicos= new LinkedList<>();
    protected List <Repuesto> listaRepuestos= new ArrayList<>();
    protected List <EquipoTecnologico> listaEquipos= new LinkedList<>();
    protected List <Servicio> listaServicios= new ArrayList<>();

    public TechPair(String nombre, String ciudad, String departamento, List<Cliente> listaClientes,
                    List<Tecnico> listaTecnicos, List<Repuesto> listaRepuestos, List<EquipoTecnologico> listaEquipos, List<Servicio> listaServicios) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.listaClientes = listaClientes;
        this.listaTecnicos = listaTecnicos;
        this.listaRepuestos = listaRepuestos;
        this.listaEquipos = listaEquipos;
        this.listaServicios = listaServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }

    public void setListaTecnicos(List<Tecnico> listaTecnicos) {
        this.listaTecnicos = listaTecnicos;
    }

    public List<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }

    public void setListaRepuestos(List<Repuesto> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    public List<EquipoTecnologico> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(List<EquipoTecnologico> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }
    
}
