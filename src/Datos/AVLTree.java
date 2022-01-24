
package Datos;
import java.util.Objects;

public class AVLTree {


    private Compras root;

    public Compras find(String nombre) {
        Compras current = root;
        while (current != null) {
            if (Objects.equals(current.nombre, nombre)) {
                break;
            }
            current = current.nombre.compareTo(nombre) < 0 ? current.right : current.left;
        }
        return current;
    }

    public void insert(String nombre,String fecha, long valorCuota, int ndeCuotas) {
        root = insert(root, nombre,fecha, valorCuota, ndeCuotas);
    }

    public void delete(String nombre) {
        root = delete(root, nombre);
    }

    public Compras getRoot() {
        return root;
    }

    public int height() {
        return root == null ? -1 : root.height;
    }

    private Compras insert(Compras node, String nombre,String fecha, long valorCuota, int ndeCuotas) {
        if (node == null) {
            return new Compras(nombre,fecha, valorCuota, ndeCuotas);
        } else if (node.nombre.compareTo(nombre) > 0) {
            node.left = insert(node.left, nombre,fecha, valorCuota, ndeCuotas);
        } else if (node.nombre.compareTo(nombre) < 0) {
            node.right = insert(node.right, nombre,fecha, valorCuota, ndeCuotas);
        } else {
            throw new RuntimeException("duplicate Key!");
        }
        return rebalance(node);
    }

    private Compras delete(Compras node, String nombre) {
        if (node == null) {
            return node;
        } else if (node.nombre.compareTo(nombre) > 0) {
            node.left = delete(node.left, nombre);
        } else if (node.nombre.compareTo(nombre) < 0) {
            node.right = delete(node.right, nombre);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
            } else {
                Compras mostLeftChild = mostLeftChild(node.right);
                node.nombre = mostLeftChild.nombre;
                node.right = delete(node.right, node.nombre);
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }

    private Compras mostLeftChild(Compras node) {
        Compras current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private Compras rebalance(Compras z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.right.right) > height(z.right.left)) {
                z = rotateLeft(z);
            } else {
                z.right = rotateRight(z.right);
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.left.left) > height(z.left.right)) {
                z = rotateRight(z);
            } else {
                z.left = rotateLeft(z.left);
                z = rotateRight(z);
            }
        }
        return z;
    }

    private Compras rotateRight(Compras y) {
        Compras x = y.left;
        Compras z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Compras rotateLeft(Compras y) {
        Compras x = y.right;
        Compras z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private void updateHeight(Compras n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    private int height(Compras n) {
        return n == null ? -1 : n.height;
    }

    public int getBalance(Compras n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }
    public void PreOrden(Compras r) {
        if (r != null) {
            System.out.println(r.toString());
            PreOrden(r.left);
            PreOrden(r.right);
        }
    }
    public void change(Compras r, String nombre,String fecha, long valorCuota, int ndeCuotas){
        if(find(nombre)!=null){
                r.setNombre(nombre);
                r.setFecha(fecha);
                r.setNdeCuotas(ndeCuotas);
                r.setValorCuota(valorCuota);
        }
    }
    public void changeNombre(Compras r, String nombre){
        if(find(nombre)!=null){
            r.setNombre(nombre);

        }
    }
    public void changeFecha(Compras r ,String fecha){
        if(find(r.nombre)!=null){
                r.setFecha(fecha);


        }
    }
    public void changeValorCuota(Compras r,  long valorCuota){
        if(find(r.nombre)!=null){
            r.setValorCuota(valorCuota);
            }
        }
    public void changeNdeCuotas(Compras r,  int ndeCuotas){
        if(find(r.nombre)!=null){
            r.setNdeCuotas(ndeCuotas);
        }
    }



}