/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author sano2
 */
public class Torneo {

    //se definen los atributos generales de la clase torneo
    //el caracter con interfaces gráficas es mejor trabajarlo String
    
    //ArrayList que solo se pueden settears
    ArrayList<Equipo> listado_equipos;
    ArrayList<Juez> listado_jueces;

    TipoTorneo tipo;
    String nombre, genero, lugar, caracter, estado;
    int cant_equipos, limite_edad, valor_inscripcion;
    Fecha fecha_inicio_inscripcion, fecha_fin_inscripcion, fecha_inicio_torneo;

    public Torneo() {

    }

    public Torneo(TipoTorneo tipo, String nombre, String genero, String lugar, String caracter, String estado,
            int cant_equipos, int limite_edad, int valor_inscripcion, Fecha fecha_inicio_inscripcion,
            Fecha fecha_fin_inscripcion, Fecha fecha_inicio_torneo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.genero = genero;
        this.lugar = lugar;
        this.caracter = caracter;
        this.estado = estado;
        this.cant_equipos = cant_equipos;
        this.limite_edad = limite_edad;
        this.valor_inscripcion = valor_inscripcion;
        this.fecha_inicio_inscripcion = fecha_inicio_inscripcion;
        this.fecha_fin_inscripcion = fecha_fin_inscripcion;
        this.fecha_inicio_torneo = fecha_inicio_torneo;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCant_equipos(int cant_equipos) {
        this.cant_equipos = cant_equipos;
    }

    public void setLimite_edad(int limite_edad) {
        this.limite_edad = limite_edad;
    }

    public void setValor_inscripcion(int valor_inscripcion) {
        this.valor_inscripcion = valor_inscripcion;
    }

    public void setFecha_inicio_inscripcion(Fecha fecha_inicio_inscripcion) {
        this.fecha_inicio_inscripcion = fecha_inicio_inscripcion;
    }

    public void setFecha_fin_inscripcion(Fecha fecha_fin_inscripcion) {
        this.fecha_fin_inscripcion = fecha_fin_inscripcion;
    }

    public void setFecha_inicio_torneo(Fecha fecha_inicio_torneo) {
        this.fecha_inicio_torneo = fecha_inicio_torneo;
    }

    public void setTipo(TipoTorneo tipo) {
        this.tipo = tipo;
    }

    public void setListado_equipos(ArrayList<Equipo> listado_equipos) {
        this.listado_equipos = listado_equipos;
    }

    public void setListado_jueces(ArrayList<Juez> listado_jueces) {
        this.listado_jueces = listado_jueces;
    }

}
