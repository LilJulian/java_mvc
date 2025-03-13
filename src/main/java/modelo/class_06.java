/*
7. “EL NÁUFRAGO SATISFECHO” ofrece hamburguesas sencillas (S), dobles (D) y triples (T), las
cuales tienen un costo de $5000, $6500 y $7800 respectivamente. La empresa acepta tarjetas
de crédito con un cargo de 5 % sobre la compra. Suponiendo que los clientes adquieren N
hamburguesas, las cuales pueden ser de diferente tipo, represente la solución en entorno
grafico de NetBeans para determinar cuánto deben pagar.
 */
package modelo;

/**
 *
 * @author Propietario
 */
public class class_06 {
    public double suma;
    
    public void cacluclarTotal(int sencilla, int doble, int triple){
        sencilla *= 5000;
        doble *= 6500;
        triple *= 7800;
        suma = sencilla + doble + triple;
        
    }
    

}
