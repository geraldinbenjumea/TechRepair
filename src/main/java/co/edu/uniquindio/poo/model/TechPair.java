package co.edu.uniquindio.poo.model;
/**
 * Trabajo parcial 2
 * author: gerladinBenjumea
 * 17/10/2026
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class TechPair {
    private String nombre;
    private String ciudad;
    private String departamento;

    protected List<Cliente> listaClientes = new ArrayList<>();
    protected List<Tecnico> listaTecnicos = new LinkedList<>();
    protected List<Repuesto> listaRepuestos = new ArrayList<>();
    protected List<EquipoTecnologico> listaEquipos = new LinkedList<>();
    protected List<Servicio> listaServicios = new ArrayList<>();

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
    //                                 ----CRUD Cliente-----
    //registrar
    public String registrarCliente(Cliente cliente) {
        Optional<Cliente> encontrado = buscarCliente(cliente.getNumeroDocumento());
        if (encontrado.isPresent()) {
            return "El cliente ya se encuentra registrado";
        } else {
            listaClientes.add(cliente);
            return "El cliente fue registrado exitosamente";
        }
    }
    //buscar
    private Optional<Cliente> buscarCliente(String numeroDocumento) {
        return listaClientes.
                stream().
                filter(e -> e.getNumeroDocumento().equals(numeroDocumento)).findFirst();
    }
    //actualizar
    public String actualizarCliente(String numeroDocumento, String nuevoNombre,
                                    String nuevoTelefono, String nuevoCorreo,
                                    String nuevaDireccion) {
        Optional<Cliente> encontrado = buscarCliente(numeroDocumento);
        if (encontrado.isPresent()) {
            Cliente cliente = encontrado.get();
            cliente.setNombreCompleto(nuevoNombre);
            cliente.setTelefono(nuevoTelefono);
            cliente.setCorreo(nuevoCorreo);
            cliente.setResidecia(nuevaDireccion);

            return "El cliente fue actualizado exitosamente";
        } else {
            return "El cliente no se encuentra registrado";
        }
    }

    //eliminar
    public String eliminarCliente(String numeroDocumento) {
        Optional<Cliente> encontrado = buscarCliente(numeroDocumento);
        if (encontrado.isPresent()) {
            listaClientes.remove(encontrado.get());
            return "El cliente fue eliminado exitosamente";
        } else {
            return "El cliente no se encuentra registrado";
        }
    }

    //                                      ----CRUD tecnico-----
    //registrar
    public String registrarTecnico(Tecnico tecnico) {
        Optional<Tecnico> encontrado = buscarTecnico(tecnico.getDocumentoIdentidad());
        if (encontrado.isPresent()) {
            return "El tecnico ya se encuentra registrado";
        } else {
            listaTecnicos.add(tecnico);
            return "El tecnico fue registrado exitosamente";
        }
    }
    //buscar
    private Optional<Tecnico> buscarTecnico(String documentoIdentidad) {
        return listaTecnicos.
                stream().
                filter(t -> t.getDocumentoIdentidad().equals(documentoIdentidad)).findFirst();
    }
    //actualizar
    public String actualizarTecnico(String documentoIdentidad, String nuevoNombre) {
        Optional<Tecnico> encontrado = buscarTecnico(documentoIdentidad);
        if (encontrado.isPresent()) {
            Tecnico tecnico = encontrado.get();
            tecnico.setNombre(nuevoNombre);
            return "El tecnico fue actualizado exitosamente";
        } else {
            return "El tecnico no se encuentra registrado";
        }
    }

    //eliminar
    public String eliminarTecnico(String documentoIdentidad) {
        Optional<Tecnico> encontrado = buscarTecnico(documentoIdentidad);
        if (encontrado.isPresent()) {
            listaTecnicos.remove(encontrado.get());
            return "El Tecnico fue eliminado exitosamente";
        } else {
            return "El Tecnico no se encuentra registrado";
        }
    }

    //                                 ----CRUD equipo tecnologico-----
    //registrar
    public String registrarEquipo(EquipoTecnologico nuevoEquipo) {
        Optional<EquipoTecnologico> encontrado = buscarEquipo(nuevoEquipo.getNumeroSerie());
        if (encontrado.isPresent()) {
            return "El equipo con ese número de serie ya está registrado.";
        }
        listaEquipos.add(nuevoEquipo);
        return "Equipo registrado exitosamente.";
    }

    //buscar
    public Optional<EquipoTecnologico> buscarEquipo(String numeroSerie) {
        return listaEquipos.stream()
                .filter(e -> e.getNumeroSerie().equalsIgnoreCase(numeroSerie))
                .findFirst();
    }
    //eliminar
    public String eliminarEquipo(String numeroSerie) {
        Optional<EquipoTecnologico> encontrado = buscarEquipo(numeroSerie);
        if (encontrado.isPresent()) {
            listaEquipos.remove(encontrado.get());
            return "Equipo eliminado exitosamente.";
        }
        return "El equipo no se encuentra registrado.";
    }

    //                                     -----CRUD repuesto---------
    //registrar
    public String registrarRepuesto(Repuesto repuesto) {
        Optional<Repuesto> encontrado = buscarRepuesto(repuesto.getCodigo());
        if (encontrado.isPresent()) {
            return "El repuesto con ese codigo ya está registrado.";
        }
        listaRepuestos.add(repuesto);
        return "Repuesto registrado exitosamente.";
    }
    //buscar
    private Optional<Repuesto> buscarRepuesto(String codigo) {
        return listaRepuestos.
                stream().
                filter(r -> r.getCodigo().equals(codigo)).findFirst();
    }
    //actualizar
    public String actualizarRepuesto(String codigo, String nombre, String descripcion, String precioUnitario,
                                     int cantidadDisponible, String categoriacomp) {
        Optional<Repuesto> encontrado = buscarRepuesto(codigo);
        if (encontrado.isPresent()) {
            Repuesto repuesto = encontrado.get();
            repuesto.setCantidadDisponible(cantidadDisponible);
            repuesto.setCategoriacomp(categoriacomp);
            repuesto.setDescripcion(descripcion);
            repuesto.setNombre(nombre);
            repuesto.setPrecioUnitario(precioUnitario);
            return "El repuesto fue actualizado exitosamente";
        } else {
            return "El repuesto no se encuentra registrado";
        }
    }
    //eliminar
    public String eliminarRepuesto(String codigo) {
        Optional<Repuesto> encontrado = buscarRepuesto(codigo);
        if (encontrado.isPresent()) {
            listaRepuestos.remove(encontrado.get());
            return "Repuesto eliminado exitosamente.";
        }
        return "El repuesto no se encuentra registrado.";
    }


}



