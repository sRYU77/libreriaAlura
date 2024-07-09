package com.aluracursos.libreriaAlura.services;

public interface IconvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
