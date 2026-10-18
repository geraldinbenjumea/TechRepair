package co.edu.uniquindio.poo.model;

public class DetalleRepuesto {

    protected int cantidad;
    protected float precioAplicado;
    private Repuesto repuesto;

    private DetalleServicio ownedByDetalleServicio;

    public DetalleRepuesto(int cantidad, float precioAplicado, Repuesto repuesto, DetalleServicio ownedByDetalleServicio) {
        this.cantidad = cantidad;
        this.precioAplicado = precioAplicado;
        this.repuesto = repuesto;
        this.ownedByDetalleServicio = ownedByDetalleServicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioAplicado() {
        return precioAplicado;
    }

    public void setPrecioAplicado(float precioAplicado) {
        this.precioAplicado = precioAplicado;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }

    public DetalleServicio getOwnedByDetalleServicio() {
        return ownedByDetalleServicio;
    }

    public void setOwnedByDetalleServicio(DetalleServicio ownedByDetalleServicio) {
        this.ownedByDetalleServicio = ownedByDetalleServicio;
    }
}
