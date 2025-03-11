/*
6. Cada programa académico contiene el código del programa, el documento del estudiante,
Nombre del estudiante, y tres notas de previos del estudiante, realice un algoritmo que
permita calcular y dar como salida lo siguiente:
• Nota final del estudiante y un mensaje de salida que si Aprobó o no el curso.
• Una nota se da como aprobada si es mayor o igual a 6.0 de lo contrario reprueba.
 */
package modelo;

/**
 *
 * @author Propietario
 */
public class class_05 {
    public double promedio;
    
    public void HallarPromedio(int n1, int n2, int n3){
        int suma = n1 +n2 +n3;
        promedio = suma / 3;
    }
}
