/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoDeOrdenacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jerico
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
       
        int v[]=new int[5];
        int aux;
        System.out.println("METODO DE LA BURBUJA");
        System.out.println("====================");
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("Ingrese un número");
            v[i]=Integer.parseInt(dato.readLine());
            
        }
        System.out.println("Vector no ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" ["+v[i]+"] ");
            
        }
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length-i-1; j++) {
                if (v[j+1]<v[j]) 
                {
                   aux=v[j+1];
                   v[j+1]=v[j];
                   v[j]=aux;
                }
                
            }
            
        }
        System.out.println(" ");
        System.out.println("Vector ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" ["+v[i]+"] ");
            
        }
        
        
        System.out.println(" ");
        
        
    }
    
}
