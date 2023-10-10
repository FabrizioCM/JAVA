package org.generation.logicOperators;

public class Exercise {
    public static void main(String[] args) {
        double precioIphone = 23999.0;
        int qtyIphone = 3;
        double totalSinDescuento = precioIphone * qtyIphone;
        double totalConDescuento = 0; 
        if (totalSinDescuento > 25000.0) {
            double descuento = totalSinDescuento * 0.10;
            totalConDescuento = totalSinDescuento - descuento; 
        }
        
        double pagoMensual = totalConDescuento / 12;
        System.out.println("Total con descuento: $" + totalConDescuento + " PejeCoins");
        System.out.println("TEMU TE REGALA DESCUENTAZO");
        System.out.println("Tu total es de:  $" + pagoMensual + " PejeCoins");
        
    }
}