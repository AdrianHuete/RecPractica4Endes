/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

/**
 * Cuenta corriente
 *
 * @author Adrian
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;

    /**
     * IBAN de la cuenta
     */
    private String cuenta;

    /**
     * Saldo de la cuenta
     */
    private double saldo;

    /**
     * Tipo de interés de la cuenta
     */
    private double tipoInterés;

    /**
     * Constante con el mensaje de error que salta al intentar ingresar
     * una cantidad negativa
     */
    private static final String ERRORCANTIDADNEGATIVA
            = "No se puede ingresar una cantidad negativa";

    /**
     * Constructor sin parámetros
     */
    public CCuenta() {
    }

    /**
     * Constructor con todos los patámetros
     *
     * @param nom Nombre del titular de la cuenta
     * @param cue IBAN de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el nombre del titular de la cuenta
     *
     * @return Nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del titular de la cuenta por el pasado por parámetro
     *
     * @param nombre Nuevo nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el IBAN de la cuenta
     *
     * @return IBAN de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el IBAN de la cuenta por la cadena pasada por parámetro
     *
     * @param cuenta Nuevo IBAN de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     *
     * @return Saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta al valor pasado por parámetro
     *
     * @param saldo Nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés de la cuenta
     *
     * @return Tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta por el pasado por parámetro
     *
     * @param tipoInterés El nuevo tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo de la cuenta
     *
     * @return El saldo de la cuenta
     */
    public double estado() {
        return this.saldo;
    }

    /**
     * Si recibe una cantidad mayor que 0, la suma al saldo de la cuenta
     *
     * @param cantidad La cantidad a ingresar en la cuenta, debe ser positiva
     * @throws Exception Error al intentar ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception(ERRORCANTIDADNEGATIVA);
        }
        saldo = saldo + cantidad;
    }

    /**
     * Si recibe una cantidad entera positiva no mayor que el saldo de la
     * cuenta, resta la cantidad al saldo de la cuenta
     *
     * @param cantidad La cantidad a retirar de la cuenta
     * @throws Exception Error al intentar retirar una cantidad negativa o 0, o
     * al intentar retirar una cantidad mayor que el saldo de la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}
