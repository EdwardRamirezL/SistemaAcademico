/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    
    // El constructor xd
    public Estudiante(String codigo, String nombre, String apellido,int edad, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
        this.edad = edad;
    }

    
    // Getters (☞ﾟヮﾟ)☞
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public int getSemestre() {
        return semestre;
    }

    // Setters ☜(ﾟヮﾟ☜)
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
        // toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +'\''+ 
                ", semestre=" + semestre +
                '}';
    }
    
}
