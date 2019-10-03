/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_primitivewritechars;

import java.io.*;

/**
 *
 * @author oracle
 */
public class Ex5_primitivewritechars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*
         Propoñovos un exercicio que consistirá grabar unha mesma cadea  de texto
         duas veces usando o metodo  writeChars(String) nun ficheiro denominado 
         text4.txt para posteriormente recuperalas (voltalas a ler) mediante o 
         metodo readChar().
         */
        /*
        PONER BIEN LA SALIDA, EJERCICIO HECHO
        */
        //escritura
        FileOutputStream escribir = null;
        BufferedOutputStream escribirBuffer = null;
        DataOutputStream escribirData = null;
        //lectura
        FileInputStream leer = null;
        BufferedInputStream leerBuffer = null;
        DataInputStream leerData = null;
        String lecturas = "";

        escribir = new FileOutputStream("/home/oracle/Desktop/ex5/texto4.txt");
        escribirBuffer = new BufferedOutputStream(escribir);
        escribirData = new DataOutputStream(escribirBuffer);

        leer = new FileInputStream("/home/oracle/Desktop/ex5/texto4.txt");
        leerBuffer = new BufferedInputStream(leer);
        leerData = new DataInputStream(leerBuffer);

        //writeChars escribe 2 bytes por caracter y, al escribir las cadenas,
        //no dja el espacio de 2 bytes de separación como el writeUTF
        String cadena = "o tempo está xélido";
        escribirData.writeChars(cadena);
        escribirData.writeChars(cadena);
        escribirData.close();

        //readChar solo lee un caracter cada vez que se llama
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(leerData.readChar());
            
        }

        leerData.close();

    }

}
