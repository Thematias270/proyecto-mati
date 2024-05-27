/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa01;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Programa01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero binario de hasta 16 digitos");
        String binario;
        binario = entrada.nextLine();
        
        while(binario.length()%4 !=0){
            binario = "0" + binario;
        }
        StringBuilder octal = new StringBuilder();
        StringBuilder hexadecimal = new StringBuilder();
            for (int i = 0; i < binario.length(); i+=4) {
                String GruposDeTres = binario.substring(i,i+4);
                int decimal = Integer.parseInt(GruposDeTres,2);
                octal.append(Integer.toOctalString(decimal));
                hexadecimal.append(Integer.toHexString(decimal));
            }
            System.out.println("El numero binario " + binario + " es equivalente al octal " + octal);
            System.out.println("El numero binario " + binario + " es equivalente al hexadecimal " + hexadecimal);
    }
}
