package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente {

    private String numeroDocumento;
    private String nombreCompleto;
    public String telefono;
    public String correo;
    private String residecia;

    private TechPair ownedByTechPair;
    public List<EquipoTecnologico> listaEquiposTecnologicos= new LinkedList<>();

    public Cliente(String numeroDocumento, String nombreCompleto, String telefono, String correo, String residecia,
                   TechPair ownedByTechPair, List<EquipoTecnologico> listaEquiposTecnologicos) {
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.residecia = residecia;
        this.ownedByTechPair = ownedByTechPair;
        this.listaEquiposTecnologicos = listaEquiposTecnologicos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getResidecia() {
        return residecia;
    }

    public void setResidecia(String residecia) {
        this.residecia = residecia;
    }

    public TechPair getOwnedByTechPair() {
        return ownedByTechPair;
    }

    public void setOwnedByTechPair(TechPair ownedByTechPair) {
        this.ownedByTechPair = ownedByTechPair;
    }

    public List<EquipoTecnologico> getListaEquiposTecnologicos() {
        return listaEquiposTecnologicos;
    }

    public void setListaEquiposTecnologicos(List<EquipoTecnologico> listaEquiposTecnologicos) {
        this.listaEquiposTecnologicos = listaEquiposTecnologicos;
    }
}
