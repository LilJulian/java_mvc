/*
3. Escribir un programa que calcule la velocidad de un proyectil que recorre 2 Km en 5 minutos.
Expresar el resultado en metros/segundo. Velocidad = espacio/tiempo
 */
package modelo;

/**
 *
 * @author julia
 */
public class class_02 {
    public double distancia;
    
    public void MetodoHallar(int km, int min){
        km = km * 1000;
        min = min * 60;
        distancia = km /min;
        
    }
}
