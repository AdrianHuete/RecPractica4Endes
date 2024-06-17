/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que contiene el método main y métodos para probar la ejecución de
 * algunos métodos de la clase CCuenta
 *
 * @author Adrian
 */
public class Main {

    /**
     * Metodo main, por donde comienza a ejecutarse el programa
     *
     * @param args Parámetros de ejecución
     */
    public static void main(String[] args) {
        try {
            CCuenta objetoCuenta;
            double saldoActual;

            objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
            saldoActual = objetoCuenta.estado();
            System.out.println("El saldo actual es" + saldoActual);

            probarIngresar(objetoCuenta, 23, 0);
            probarRetirar(objetoCuenta, 23, 0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Método de prueba del método ingresar de la claseCCuenta
     *
     * @param c El objeto CCuenta que ejecutará el método ingresar
     * @param cantidad La cantidad con la que se ejecutará el método ingresar,
     * no debe ser menor de 0
     * @param cantidadEsperada La cantidad que debería devolver el método
     * ingresar en funcón de la cantidad con la que se ejecute
     * @throws Exception Error al intentar ingresar una cantidad negativa
     */
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        c.ingresar(cantidad);

    }

    /**
     * Método de prueba del método retirar de la clase CCuenta
     *
     * @param c El objeto CCuenta que ejecutará el método retirar
     * @param cantidad La cantidad con la que se ejecutará el método ingresar,
     * debe ser mayor que 0 y menor que el saldo de la cuenta
     * @param cantidadEsperada El saldo que debería quedar en la cuenta después
     * de retirar la cantidad
     * @throws Exception Error al intentar retirar una cantidad no mayor de 0, o
     * mayor que el saldo de la cuenta
     */
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        c.retirar(cantidad);
    }
}
