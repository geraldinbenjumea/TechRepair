package co.edu.uniquindio.poo.model;
/**
 * Trabajo parcial 2
 * author: gerladinBenjumea
 * 17/10/2026
 */

import java.time.LocalDate;
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
    protected List<OrdenServicio> listaOrdenes= new ArrayList<>();

    public TechPair(String nombre, String ciudad, String departamento, List<Cliente> listaClientes,
                    List<Tecnico> listaTecnicos, List<Repuesto> listaRepuestos, List<EquipoTecnologico>
                            listaEquipos, List<Servicio> listaServicios, List<OrdenServicio> listaOrdenes) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.listaClientes = listaClientes;
        this.listaTecnicos = listaTecnicos;
        this.listaRepuestos = listaRepuestos;
        this.listaEquipos = listaEquipos;
        this.listaServicios = listaServicios;
        this.listaOrdenes= listaOrdenes;
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

    public List<OrdenServicio> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<OrdenServicio> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
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
    //
    //FUNCIONALIDADES
    //1. registrar cliente (esta en el CRUD)
    //2. registrar equipo asociado a un cliente
    public String registrarEquipoACliente(String numeroDocumento, EquipoTecnologico nuevoEquipo) {
        Optional<Cliente> cliente1 = buscarCliente(numeroDocumento);
        if (cliente1.isEmpty()) {
            return " El cliente no está registrado.";
        }
        Optional<EquipoTecnologico> equipo1 = buscarEquipo(nuevoEquipo.getNumeroSerie());
        if (equipo1.isPresent()) {
            return "Ya existe un equipo registrado con ese número de serie";
        }
        // Asociar el cliente al equipo y guardar
        Cliente cliente = cliente1.get();
        nuevoEquipo.setPropietario(cliente);
        listaEquipos.add(nuevoEquipo);
        return "Equipo registrado y asociado exitosamente al cliente " + cliente.getNombreCompleto();
    }
    //3. registrar tecnico (esta en el CRUD)
    //4. Registrar repuesto (esta en el CRUD)
    //5. crear orden de servicio para un cliente
    public String crearOrdenServicio(String codigoUnico, String numeroDocumento) {
        Optional<Cliente> cliente= buscarCliente(numeroDocumento);
        if (cliente.isEmpty()) {
            return "El cliente no se encuentra registrado.";
        }
        // que no exista una orden con el mismo número
        Optional<OrdenServicio> ordenOpt = buscarOrdenServicio(codigoUnico);
        if (ordenOpt.isPresent()) {
            return "Error: Ya existe una orden registrada con ese número.";
        }
        Cliente cliente2 = cliente.get();
        OrdenServicio nuevaOrden = new OrdenServicio(codigoUnico, LocalDate.now(),"Orden de servicio abierta",
                EstadoOrden.ABIERTA, new ArrayList<>(), cliente2);
        listaOrdenes.add(nuevaOrden);
        return "Orden de servicio creada exitosamente para el cliente con identificacion "+ numeroDocumento;
    }
    private Optional<OrdenServicio> buscarOrdenServicio(String codigoUnico) {
        return listaOrdenes.stream().
                filter(ordenServicio -> ordenServicio.getCodigoUnico().equals(codigoUnico)).findFirst();
    }
    //6. Agregar detalle a una orden
    public String agregarDetalleOrden (String codigoDetalle, String codigoUnico,String numeroSerie,
                                       Servicio servicio, String fallaReportada, Tecnico tecnico, float horas){
        Optional<OrdenServicio> orden1 = buscarOrdenServicio(codigoUnico);
        if (orden1.isEmpty()) {
            return "La orden de servicio no existe.";
        }
        Optional<EquipoTecnologico> equipo1= buscarEquipo(numeroSerie);
        if(equipo1.isEmpty()){
            return "El equipo no existe";
        }
        OrdenServicio nuevaOrden= orden1.get();
        EquipoTecnologico nuevoEquipo= equipo1.get();
        DetalleServicio nuevoDetalle = new DetalleServicio(codigoDetalle, nuevoEquipo, "Agregando detalle servicio",
                 tecnico, EstadoIntervencion.EN_PROCESO, horas, "No se han encontrado observaciones",
                nuevaOrden, fallaReportada);
        nuevaOrden.getListaDetalles().add(nuevoDetalle);
        return "El detalle se ha añadido a la orden";
    }
    //7.Asignar técnico


}



