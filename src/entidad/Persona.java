/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author 54117
 */
public class Persona {

    private int edad;
    private String nombre;
    private long dni;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", dni=" + dni + '}';
    }

    public Persona(int edad, String nombre, long dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public Persona() {
    }
    
    
}
