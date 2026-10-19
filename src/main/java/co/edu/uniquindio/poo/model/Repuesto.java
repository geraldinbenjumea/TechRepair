package co.edu.uniquindio.poo.model;

public class Repuesto {

    protected String codigo;
    private String nombre;
    public String descripcion;
    public float precioUnitario;
    protected int cantidadDisponible;
    protected String categoriacomp;

    private TechPair ownedByTechPair;

    public Repuesto(String codigo, String nombre, String descripcion, float precioUnitario,
                    int cantidadDisponible, String categoriacomp, TechPair ownedByTechPair) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
        this.categoriacomp = categoriacomp;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCategoriacomp() {
        return categoriacomp;
    }

    public void setCategoriacomp(String categoriacomp) {
        this.categoriacomp = categoriacomp;
    }

    public TechPair getOwnedByTechPair() {
        return ownedByTechPair;
    }

    public void setOwnedByTechPair(TechPair ownedByTechPair) {
        this.ownedByTechPair = ownedByTechPair;
    }

    public String inventarioCritico (int cantidadDisponible) {
        if (cantidadDisponible < 5) {
            return "Inventario critico";
        } else {
            return "Inventario estable";
        }
    }
    public double calcularSubtotal(int cantidadDisponible, float precioUnitario ){
        return cantidadDisponible*precioUnitario;
    }
}
