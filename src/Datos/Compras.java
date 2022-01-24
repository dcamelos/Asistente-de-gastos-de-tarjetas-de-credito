
package Datos;
public class Compras {
    public String nombre;
    public String fecha;
    public long valorCuota;
    public int NdeCuotas;
    public Compras left;
    public Compras right;
    public int height;
    public long Total;



    public Compras(String nombre,String fecha, long valorCuota, int ndeCuotas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.valorCuota = valorCuota;
        this.NdeCuotas = ndeCuotas;

    }

    public String getNombre() {
        return nombre;
    }
    public String  getFecha() {
        return fecha;
    }

    public long getValorCuota() {
        return valorCuota;
    }

    public int getNdeCuotas() {
        return NdeCuotas;
    }

    public long getTotal() {
        Total=(valorCuota*(long)NdeCuotas);
        return Total;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String  fecha) {
        this.fecha = fecha;
    }

    public void setValorCuota(long valorCuota) {
        this.valorCuota = valorCuota;
    }

    public void setNdeCuotas(int ndeCuotas) {
        NdeCuotas = ndeCuotas;
    }


    @Override
    public String toString(){
        return("El nombre de la cuenta es: "+getNombre()+", la fecha es "+ getFecha()+", el valor de las cuotas es "+getValorCuota()+", el numero de cuotas "+getNdeCuotas()+" y el total es "+getTotal()+" ");
    }
}
