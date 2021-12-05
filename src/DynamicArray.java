package com.estructuraDeDatos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;


/**
 *
 * @author Daniel
 */
public class DynamicArray <T> {
    private int idx;
    private T data;
    private T [] array;
    private T [] aux;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void añadir(Class <T> clase, T data){
        if(idx==0){
            aux = (T[]) Array.newInstance(clase,2);
            aux[getIdx()]=data;
            setIdx(1);
            setCapacity(2);
        }else if(getIdx()==getCapacity()){
            setCapacity(getIdx()*2);
            aux=(T[]) Array.newInstance(clase,getCapacity());
            for(int i=0;i<getIdx();i++){
                aux[i]=array[i];
            }
            aux[getIdx()]=data;
            setIdx(getIdx()+1);
        }else{
            aux=getArray();
            aux[getIdx()]=data;
            setIdx(getIdx()+1);
        }
        setArray(aux);

    }

    public void eliminar (int posicion){
        aux=getArray();
        if(getIdx() > posicion && getIdx() > 0){
            for(int i =(posicion -1);i<(getIdx()-1);i++){
                aux[i]=aux[i+1];
            }
            setIdx(getIdx()-1);
        }else if(getIdx()==posicion){
            setIdx(getIdx()-1);
        }else{
            System.out.println("No se puede eliminar esta posicion");
        }
        setArray(aux);
    }

    public void modificar (int posicion, T data){
        aux=getArray();
        if(getIdx() >= posicion && getIdx() > 0){
            aux[posicion-1]=data;
        }
        else{
            System.out.println("No se puede modificar esta posicion");
        }
        setArray(aux);
    }

    public void mostrar (int posicion){
        aux=getArray();
        System.out.println(aux[posicion-1]);
    }



}