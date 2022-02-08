
package Datos;


public class HashTab {

    private LinkedList[] ListaCompras;
    private int size;
    public HashTab(int size) {
        this.ListaCompras = new LinkedList[size];
        this.size = size;
        for (int i = 0; i < size; i++) {
            ListaCompras[i] = new LinkedList();
        }
    }
    private int funcionHash(int codigo) {
        return codigo % size;
    }
    public void AgregarHT(Compras compra) {
        int numero = funcionHash(compra.code);
        ListaCompras[numero].AgregarLK(compra);
    }
    public void EliminarHT(int codigo) {
        int posicion = funcionHash(codigo);
        ListaCompras[posicion].EliminarLK(codigo);
    }
    public void changeHT(Compras r, String nombre,String fecha, long valorCuota, int ndeCuotas){
        int numero = funcionHash(r.code);
        ListaCompras[numero].change(r,nombre,fecha,valorCuota,ndeCuotas);

    }
    public void changeNombreHT(Compras r, String nombre){
        int numero = funcionHash(r.code);
        ListaCompras[numero].changeNombre(r,nombre);
    }
    public void changeFechaHT(Compras r ,String fecha){
        int numero = funcionHash(r.code);
        ListaCompras[numero].changeFecha(r,fecha);
    }
    public void changeValorCuotaHT(Compras r,  long valorCuota){
        int numero = funcionHash(r.code);
        ListaCompras[numero].changeValorCuota(r,valorCuota);
    }
    public void changeNdeCuotasHT(Compras r,  int ndeCuotas){
        int numero = funcionHash(r.code);
        ListaCompras[numero].changeNdeCuotas(r,ndeCuotas);
    }

    public String BuscarHT(int codigo) {
        int posicion = funcionHash(codigo);
        Compras compra = ListaCompras[posicion].BuscarLK(codigo);
        if (compra != null) {
            System.out.println(compra);
        }
        return compra.toString();
    }
    public Compras Seleccionar(int codigo) {
        int posicion = funcionHash(codigo);
        Compras compra = ListaCompras[posicion].BuscarLK(codigo);
        return compra;
    }
    public void MostrarTodoHT() {
        for (int i = 0; i < size; i++) {
            ListaCompras[i].MostrarTodoLK();
        }
    }
}


