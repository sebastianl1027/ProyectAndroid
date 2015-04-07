package com.universidadcauca.movil.preguntas.Models;

/**
 * Created by Sebastian on 03/04/2015.
 */
public class Preguntas {

    String pregunta, categoria, nivel_pregunta;

    public Preguntas(String edad, String genero, String titulo) {
        this.pregunta = pregunta;
        this.categoria = categoria;
        this.nivel_pregunta = nivel_pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel_pregunta() {
        return nivel_pregunta;
    }

    public void setEdad(String nivel_pregunta) {
        this.nivel_pregunta = nivel_pregunta;
    }
}

