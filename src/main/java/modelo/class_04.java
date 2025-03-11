/*
5. Problema Desarrolle un algoritmo que convierta de grados Celsius a grados Fahrenheit y
de grados Fahrenheit a grados Celsius. La fórmula correspondiente para pasar de grados
centígrados a fahrenheit es: F = 32 + ( 9 * C / 5).
 */
package modelo;

/**
 *
 * @author Propietario
 */
public class class_04 {
    
    public double resu_far, resu_cel;
    
    public void CelciusaFar(int cel){
        resu_cel = (cel * 9 / 5) + 32;
    }
    
    public void FaraCelcius(double far){
        resu_far = (far - 32) * 1.8f;   
    }
}
