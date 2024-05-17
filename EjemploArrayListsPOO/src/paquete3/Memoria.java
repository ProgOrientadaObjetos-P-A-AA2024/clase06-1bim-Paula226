
package paquete3;

/**
 *
 * @author reroes
 */
public class Memoria {
    private String marca;
    private double costo;
     public Memoria(String m, double c) {
        marca = m;
        costo = c;
     }

public void establecerMarca (String m){
    marca = m;
}
public void establcerCosto(double c) {
    costo = c;
}
public String obtenerMarca() {
    return marca;
}
public double obtenerCosto() {
    return costo;
}
}
