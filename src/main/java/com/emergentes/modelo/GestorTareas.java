/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emergentes.modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Edson
 */
public class GestorTareas {
    private ArrayList<Tarea> lista;
    public GestorTareas(){
        lista = new ArrayList<Tarea>();
    }

    public ArrayList<Tarea> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Tarea> lista) {
        this.lista = lista;
    }
    public void insertarTareas(Tarea item){
        lista.add(item);
    }
    public void modificarTarea(int pos, Tarea item){
        lista.set(pos, item);
    }
    public void eliminarTarea(int pos){
        lista.remove(pos);
    }
    public int obtieneId(){
        int idaux =0;
        for(Tarea item: lista){
            idaux = item.getId();
        }
        return idaux+1;
    }
    public int ubicarTarea(int id){
        int pos = -1;
        Iterator<Tarea> it = lista.iterator();
        while(it.hasNext()){
            ++pos;
            Tarea aux = it.next();
            if(aux.getId() == id){
                break;
            }
        }
        return pos;
    }
}
