package co.edu.uniquindio.poo.model;

public class ComputadorEscritorio extends EquipoTecnologico {

    protected String procesador;
    private float RAM;
    protected boolean tarjetaGrafica;

    public ComputadorEscritorio(String codigo, String numeroSerie, String marca, String añoFabricacion,
                                String estado, TechPair ownedByTechPair, float almacenamiento,
                                String procesador, float RAM, boolean tarjetaGrafica) {
        super(codigo, numeroSerie, marca, añoFabricacion, estado, ownedByTechPair, almacenamiento);
        this.procesador=procesador;
        this.RAM=RAM;
        this.tarjetaGrafica=tarjetaGrafica;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public float getRAM() {
        return RAM;
    }

    public void setRAM(float RAM) {
        this.RAM = RAM;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
}
