/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {
    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

   public Computador(String ma, Procesador p, Memoria me) {
        marca = ma;
        procesador = p;
        memoria = me;
        calcularCostoComputador();
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerProcesador(Procesador p) {
        procesador = p;
    }

    public void establecerMemoria(Memoria c) {
        memoria = c;
    }

    public void calcularCostoComputador() {
        costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }

    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public double obtenerCosto() {
        return costoComputador;
    }
}
