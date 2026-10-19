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
    protected List<OrdenServicio> listaOrdenes = new ArrayList<>();

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
        this.listaOrdenes = listaOrdenes;
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
    public String actualizarRepuesto(String codigo, String nombre, String descripcion, float precioUnitario,
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
        Optional<Cliente> cliente = buscarCliente(numeroDocumento);
        if (cliente.isEmpty()) {
            return "El cliente no se encuentra registrado.";
        }
        // que no exista una orden con el mismo número
        Optional<OrdenServicio> ordenOpt = buscarOrdenServicio(codigoUnico);
        if (ordenOpt.isPresent()) {
            return "Error: Ya existe una orden registrada con ese número.";
        }
        Cliente cliente2 = cliente.get();
        OrdenServicio nuevaOrden = new OrdenServicio(codigoUnico, LocalDate.now(), "Orden de servicio abierta",
                EstadoOrden.ABIERTA, new ArrayList<>(), cliente2);
        listaOrdenes.add(nuevaOrden);
        return "Orden de servicio creada exitosamente para el cliente con identificacion " + numeroDocumento;
    }

    private Optional<OrdenServicio> buscarOrdenServicio(String codigoUnico) {
        return listaOrdenes.stream().
                filter(ordenServicio -> ordenServicio.getCodigoUnico().equals(codigoUnico)).findFirst();
    }

    //6. Agregar detalle a una orden
    public String agregarDetalleOrden(String codigoDetalle, String codigoUnico, String numeroSerie,
                                      Servicio servicio, String fallaReportada, Tecnico tecnico, float horas) {
        Optional<OrdenServicio> orden1 = buscarOrdenServicio(codigoUnico);
        if (orden1.isEmpty()) {
            return "La orden de servicio no existe.";
        }
        Optional<EquipoTecnologico> equipo1 = buscarEquipo(numeroSerie);
        if (equipo1.isEmpty()) {
            return "El equipo no existe";
        }
        OrdenServicio nuevaOrden = orden1.get();
        EquipoTecnologico nuevoEquipo = equipo1.get();
        DetalleServicio nuevoDetalle = new DetalleServicio(codigoDetalle, nuevoEquipo, "Agregando detalle servicio",
                tecnico, EstadoIntervencion.EN_PROCESO, horas, "No se han encontrado observaciones",
                nuevaOrden, fallaReportada, servicio);
        nuevaOrden.getListaDetalles().add(nuevoDetalle);
        return "El detalle se ha añadido a la orden";
    }

    //7.Asignar técnico
    public String asignarTecnico(Tecnico tecnico, EstadoIntervencion estadoIntervencion) {
        if (tecnico.isActivo()) {
            estadoIntervencion.equals(EstadoIntervencion.EN_PROCESO);
            return "El tecnico ya se encuentra haciendo la intervención";
        } else {
            return "El tecnico no se encuentra activo para realizar la intervencion";
        }
    }

    //8. Registrar repuestos utilizados
    public String asignarRepuesto(Repuesto repuesto, Servicio servicio) {
        if (repuesto.inventarioCritico(repuesto.cantidadDisponible).equals("Inventario critico")) {
            return "No se puede asignar un repuesto a esta reparación";
        }
        Optional<Repuesto> repuesto1 = buscarRepuesto(repuesto.codigo);
        Optional<Servicio> nuevoServicio = buscarServicio(servicio.codigo);
        if (repuesto1.isEmpty() && nuevoServicio.isEmpty()) {
            ReparacionCorrectiva reparacionCorrectiva = new ReparacionCorrectiva(repuesto.codigo, "Nueva reparación",
                    "se ha asignado el repuesto a la reparacion", 45000, servicio.getOwnedByTechPair());
            listaRepuestos.remove(repuesto1);
        }
        return "Se ha asignado y creado la nueva reparacion correctiva";
    }

    private Optional<Servicio> buscarServicio(String codigo) {
        return listaServicios.stream().
                filter(servicio -> servicio.getCodigo().equals(codigo)).findFirst();
    }

    //9.Calcular valor de un detalle
    public String cacularValorDetalle(String codigoDetalle, String codigoUnico, Servicio servicio, Repuesto repuesto) {
        Optional<OrdenServicio> orden1 = buscarOrdenServicio(codigoUnico);
        if (orden1.isEmpty()) {
            return "La orden de servicio no existe.";
        }
        OrdenServicio ordenNueva = orden1.get();
        Optional<DetalleServicio> detalle1 = ordenNueva.getListaDetalles().stream()
                .filter(d -> d.getCodigoDetalle().equalsIgnoreCase(codigoUnico))
                .findFirst();
        DetalleServicio detalle = detalle1.get();
        double valorTotal = detalle.calcularCostoDetalle(servicio, repuesto);

        return "El valor del detalle es:" + valorTotal;
    }

    //10.Calcular valor total de la orden
    public String calcularTotalOrden(DetalleServicio detalleServicio, Servicio servicio, Repuesto repuesto) {
        float total = 0;
        if (cacularValorDetalle(detalleServicio.getCodigoDetalle(), servicio.codigo, servicio, repuesto).isEmpty()) {
            return "No hay detalles a sumar";
        } else {
            total += Float.parseFloat(cacularValorDetalle(detalleServicio.getCodigoDetalle(), servicio.codigo, servicio, repuesto));
        }
        return "EL valor total de la orden es de: " + total;
    }

    //11.Actualizar estado de un detalle
    public String actualizarDetalle(EstadoIntervencion estadoIntervencion, String codigoDetalle, String codigoUnico, DetalleServicio detalleServicio) {
        Optional<OrdenServicio> orden1 = buscarOrdenServicio(codigoUnico);
        if (orden1.isEmpty()) {
            return "La orden de servicio no existe, no hay detalle por actualizar";
        }
        OrdenServicio ordenNueva = orden1.get();
        Optional<DetalleServicio> detalle1 = ordenNueva.getListaDetalles().stream()
                .filter(d -> d.getCodigoDetalle().equalsIgnoreCase(codigoUnico))
                .findFirst();
        DetalleServicio detalle = detalle1.get();
        detalle.setEstado(estadoIntervencion);
        return "El estado del detalle #" + codigoDetalle + " fue actualizado exitosamente a: " + estadoIntervencion;
    }

    //12. Finalizar una orden
    public String finalizarOrden(DetalleServicio detalleServicio, EstadoIntervencion estadoIntervencion) {
        if (detalleServicio.getEstado().equals(EstadoIntervencion.FINALIZADA)) {
            return "todos sus detalles estan finalizados, orden terminada";
        } else {
            return "todavia quedan detalles por terminar";
        }
    }

    //13.Consultar órdenes de un cliente
    public String consultarOrdenes(Cliente cliente, String numeroDocumento) {
        if (buscarCliente(numeroDocumento).isEmpty()) {
            return "El cliente a consultar no esta registrado";
        }
        List<OrdenServicio> ordenesCliente = listaOrdenes.stream()
                .filter(o -> o.getPropietario().getNumeroDocumento().equalsIgnoreCase(numeroDocumento)).toList();
        if (ordenesCliente.isEmpty()) {
            return "El cliente no tiene ordenes registradas";
        }
        return "El cliente tiene registradas las siguientes ordenes: " + ordenesCliente;
    }

    //14.Consultar trabajos de un técnico
    public String consultarTrabajosTecnico(Tecnico tecnico, DetalleServicio detalleServicio) {
        int contador = 0;
        if (buscarTecnico(tecnico.documentoIdentidad).isEmpty()) {
            return "El tecnico no esta registrado";
        }
        if (detalleServicio.getTecnicoResponsable().equals(tecnico)) {
            contador++;
        }
        return "El tecnico a consultar ha realizado " + contador + "trabajos";
    }

    //15. Consultar equipos pendientes
    public String equiposPendiente(EquipoTecnologico equipoTecnologico, DetalleServicio detalleServicio) {
        if (buscarEquipo(equipoTecnologico.numeroSerie).isEmpty()) {
            return "No hay equipos con ese numero de serie";
        }
        if (detalleServicio.getEquipo().equals(equipoTecnologico)) {
            return "El equipo se encuentra en servicio\n";
        }
        if (detalleServicio.getEstado().equals(EstadoIntervencion.PENDIENTE)) {
            return "El equipo se encuentra pendiente todavia";
        } else {
            return "El equipo ya paso del estado pendiente";
        }
    }

    //16. Generar reporte de servicios
    public String consultarServiciosPorCategoria(Servicio servicio, Repuesto repuesto) {
        int cantidadDiagnostico = 0;
        double totalDiagnostico = 0;

        int cantidadMantenimiento = 0;
        double totalMantenimiento = 0;

        int cantidadReparacion = 0;
        double totalReparacion = 0;

        for (OrdenServicio orden : listaOrdenes) {
            if (orden.getListaDetalles() != null) {
                for (DetalleServicio detalle : orden.getListaDetalles()) {
                    servicio = detalle.getServicio();
                    if (servicio instanceof Diagnostico) {//instanceof= verificar si un objeto es una instancia
                        // de una clase específica, de una subclase o de una interfaz.
                        cantidadDiagnostico++;
                        totalDiagnostico += detalle.calcularCostoDetalle(servicio, repuesto);
                    } else if (servicio instanceof Mantenimiento) {
                        cantidadMantenimiento++;
                        totalMantenimiento += detalle.calcularCostoDetalle(servicio, repuesto);
                    } else if (servicio instanceof ReparacionCorrectiva) {
                        cantidadReparacion++;
                        totalReparacion += detalle.calcularCostoDetalle(servicio, repuesto);
                    }
                }
            }
        }
        String mensaje = "=== REPORTE DE SERVICIOS POR CATEGORÍA ===\n";
        mensaje += "• Diagnóstico:\n";
        mensaje += "  - Cantidad: " + cantidadDiagnostico + "\n";
        mensaje += "  - Total Facturado: $" + totalDiagnostico + "\n";

        mensaje += "• Mantenimiento:\n";
        mensaje += "  - Cantidad: " + cantidadMantenimiento + "\n";
        mensaje += "  - Total Facturado: $" + totalMantenimiento + "\n\n";

        mensaje += "• Reparación Correctiva:\n";
        mensaje += "  - Cantidad: " + cantidadReparacion + "\n";
        mensaje += "  - Total Facturado: $" + totalReparacion;

        return mensaje;
    }

    //17. generar reporte Tecnicos
    public String reporteTecnicos(Tecnico tecnico, Servicio servicio, DetalleServicio detalleServicio) {
        int contadorFinalizado = 0;
        String mensaje = "";
        listaTecnicos.stream().
                filter(tecnico2 -> tecnico2.equals(detalleServicio.getEstado()
                        .equals(EstadoIntervencion.FINALIZADA)));
        for (Tecnico tecnico2 : listaTecnicos) {
            if (tecnico2.equals(detalleServicio.getEstado().equals(EstadoIntervencion.FINALIZADA))) {
                contadorFinalizado++;
                mensaje += "El tecnico ha realizado: " + contadorFinalizado + " intervenciones finalizadas";
            }
        }
        return mensaje;
    }

    //18.valor critico
    public String inventarioCritico() {
        String mensaje = "";
        for (Repuesto repuesto : listaRepuestos) {
            mensaje +="El repuesto " + repuesto.getNombre() + " tiene: " + repuesto.inventarioCritico(repuesto.cantidadDisponible);
        }

        return mensaje;
    }
}




