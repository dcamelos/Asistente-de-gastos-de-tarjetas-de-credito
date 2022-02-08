
package Datos;


public class LinkedList {

    private Compras head;
    public void AgregarLK(Compras compra) {
        if (head == null) {
            head = compra;
            return;
        }
        Compras actual = head;
        while (actual.next != null) {
            actual = actual.next;
        }
        actual.next = compra;
    }
    public void EliminarLK(int codigo) {
        if (head == null) {
            return;
        }
        Compras actual = head;
        while (true) {
            if (actual.code== codigo) {
                head = actual.next;
                break;
            }
            if (actual.next == null) {
                break;
            }
            if (actual.next.code==codigo) {
                actual.next = actual.next.next;
                break;
            }
            actual = actual.next;
        }
    }
    public void change(Compras r, String nombre,String fecha, long valorCuota, int ndeCuotas){
        if(BuscarLK(r.code)!=null){
            r.setNombre(nombre);
            r.setFecha(fecha);
            r.setNdeCuotas(ndeCuotas);
            r.setValorCuota(valorCuota);
        }
    }
    public void changeNombre(Compras r, String nombre){
        if(BuscarLK(r.code)!=null){
            r.setNombre(nombre);

        }
    }
    public void changeFecha(Compras r ,String fecha){
        if(BuscarLK(r.code)!=null){
            r.setFecha(fecha);


        }
    }
    public void changeValorCuota(Compras r,  long valorCuota){
        if(BuscarLK(r.code)!=null){
            r.setValorCuota(valorCuota);
        }
    }
    public void changeNdeCuotas(Compras r,  int ndeCuotas){
        if(BuscarLK(r.code)!=null){
            r.setNdeCuotas(ndeCuotas);
        }
    }

    public Compras BuscarLK(int codigo) {
        if (head == null) {
            return null;
        }
        Compras actual = head;
        while (true) {
            if (actual.code== codigo) {
                break;
            }
            if (actual.next == null) {
                actual = null;
                break;
            }
            actual = actual.next;
        }
        return actual;
    }
    public void MostrarTodoLK() {
        if (head == null) {
            return;
        }
        Compras actual = head;
        while (true) {
            System.out.print(actual);
            if (actual.next == null) {
                break;
            }
            actual= actual.next;
        }
        System.out.println();
    }

}
