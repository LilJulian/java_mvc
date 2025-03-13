/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Propietario
 */
public class class_07 {
    public double pago;
    
    public void CalcularMonto(double monto){
        if (monto < 500) pago = monto;        
        else if (monto > 500 && monto <= 1000) pago = (monto * 0.05) - monto;
        else if (monto > 1000 && monto <= 7000) pago = (monto * 0.11) - monto;
        else if (monto > 7000 && monto <= 15000) pago = (monto * 0.18) - monto;
        else if(monto > 15000) pago = (monto * 0.25) - monto;
    }
}
