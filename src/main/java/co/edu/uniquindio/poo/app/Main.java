package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main {
    static void main() {
    TechPair techPair = new TechPair("TechRepair", "Armenia", "quindio", new ArrayList<>(),
           new ArrayList<>(),  new ArrayList<>(),  new ArrayList<>(),
            new ArrayList<>(),  new ArrayList<>());

    Cliente cliente= new Cliente("1091885750", "Juan Perez", "3113746953",
            "juan123.gmail", "Armenia", techPair,  new ArrayList<>() );

        Tecnico tecnico = new Tecnico(Especialidad.COMPUTADORES, "001", "Maria", "12345",
                true, techPair);

        EquipoTecnologico nuevoEquipo =new ComputadorPortatil("002", "760", "Asus",
                "2024", "usado", techPair, 16, 12, 26, true);

        Repuesto repuesto = new Repuesto("123", "tornillo", "buen estado",
                500, 10, "compatible con todos", techPair);

        Servicio servicio= new Mantenimiento("015", "mantenimiento asus", "revisar pantalla",
                60000, techPair);

        OrdenServicio nuevaOrden= new OrdenServicio("101", LocalDate.of(2026, 10, 20), "arreglo portatil",
                EstadoOrden.ABIERTA, new ArrayList<>(), cliente);

        DetalleServicio detalleServicio= new DetalleServicio("505", nuevoEquipo, "Nuevo detalle",
                tecnico, EstadoIntervencion.FINALIZADA, 12, "Ninguna", nuevaOrden, "Pantalla negra",
                servicio);
        //1
        techPair.registrarCliente(cliente);
        //2
        techPair.registrarEquipoACliente("1091885750",nuevoEquipo);
        //3
        techPair.registrarTecnico(tecnico);
        //4
        techPair.registrarRepuesto(repuesto);
        //5
        techPair.crearOrdenServicio("321", "1091885750");
        //6
        techPair.agregarDetalleOrden("505", "001", "411", servicio, "No da imagen",
                tecnico, 5);
        //7
        techPair.asignarTecnico(tecnico, EstadoIntervencion.EN_PROCESO);
        //8
        techPair.registrarRepuesto(repuesto);
        //9
        techPair.cacularValorDetalle("505","001", servicio, repuesto );
        //10
        techPair.calcularTotalOrden(detalleServicio, servicio, repuesto);
        //11
        techPair.actualizarDetalle(EstadoIntervencion.FINALIZADA, "505", "001", detalleServicio);
        //12
        techPair.finalizarOrden(detalleServicio, EstadoIntervencion.FINALIZADA);
        //13
        techPair.consultarOrdenes(cliente, "1091885750");
        //14
        techPair.consultarTrabajosTecnico(tecnico, detalleServicio);
        //15
        techPair.equiposPendiente(nuevoEquipo, detalleServicio);
        //16
        techPair.consultarServiciosPorCategoria(servicio, repuesto);
        //17
        techPair.reporteTecnicos(tecnico, servicio, detalleServicio);
        //18
        techPair.inventarioCritico();


    }
}