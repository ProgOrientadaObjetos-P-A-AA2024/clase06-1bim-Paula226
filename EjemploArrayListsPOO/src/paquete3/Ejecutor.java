/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;
import java.util.ArrayList;
import java.util.Scanner;
import paquete3.Computador;
import paquete3.Memoria;
import paquete3.Procesador;
import paquete3.Venta;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número de computadoras: ");
        int numeroComputadoras = leer.nextInt();
        System.out.println("=========================================");
        
        Venta v1 = new Venta(); 
        ArrayList<Computador> computadoras = new ArrayList<>(); 
        
        for (int i = 0; i < numeroComputadoras; i++) {
            leer.nextLine(); 
            System.out.println("Componentes de su Computadora");
            System.out.println("=========================================");
            
       
            System.out.print("Ingrese la marca del computador: ");
            String marcaC = leer.nextLine();
            
            System.out.print("Ingrese la marca de la memoria: ");
            String marcaM = leer.nextLine();
            System.out.print("Ingrese el costo de la memoria: ");
            double costoM = leer.nextDouble();
            leer.nextLine(); 
            
            
            System.out.print("Ingrese la marca del procesador: ");
            String marcaP = leer.nextLine();
            System.out.print("Ingrese el costo del procesador: ");
            double costoP = leer.nextDouble();
            System.out.println("=========================================");

            
            Memoria m1 = new Memoria(marcaM, costoM);
            Procesador p1 = new Procesador(marcaP, costoP);
            
            Computador c1 = new Computador(marcaC, p1, m1);
            computadoras.add(c1);
        }

        
        v1.establecerComputadoras(computadoras);
        v1.calcularValorVenta();

        System.out.printf("%s\n", v1);
    }
}