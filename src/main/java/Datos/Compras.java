/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author david camelo
 */
public class Compras {
    public String nombre;
    public String fecha;
    public long valorCuota;
    public int NdeCuotas;
    public Compras next;
    public int code;
    public long Total;



    public Compras(String nombre,String fecha, long valorCuota, int ndeCuotas,int code) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.valorCuota = valorCuota;
        this.NdeCuotas = ndeCuotas;
        this.code = code;

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
        return("El nombre de la compra es: "+getNombre()+", la fecha es "+ getFecha()+", el valor de las cuotas es "+getValorCuota()+", el numero de cuotas "+getNdeCuotas()+" y el total es "+getTotal()+" ");
    }
    
}
