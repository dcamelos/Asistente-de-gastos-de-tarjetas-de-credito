package  src;

public class Compras{
    private String nombre;
    private int fecha;
    private long valorCuota;
    private int NdeCuotas;

    public String getNombre() {
        return nombre;
    }
    public int getFecha() {
        return fecha;
    }

    public long getValorCuota() {
        return valorCuota;
    }

    public int getNdeCuotas() {
        return NdeCuotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setValorCuota(long valorCuota) {
        this.valorCuota = valorCuota;
    }

    public void setNdeCuotas(int ndeCuotas) {
        NdeCuotas = ndeCuotas;
    }
}