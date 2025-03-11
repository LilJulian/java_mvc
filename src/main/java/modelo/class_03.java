/*
4. Programa que muestre el pago de una llamada telefónica sabiendo que cada minuto cuesta
$355 pesos y un IVA de 20%.
 */
package modelo;

/**
 *
 * @author Propietario
 */
public class class_03 {
    public int total;
    
    public void MetodoCalcular(int min){
        int multi = min * 355;
        int iva = 20;
        int asignacion = multi * iva / 100;
        total = asignacion + multi;
        
    }
        
                
}
