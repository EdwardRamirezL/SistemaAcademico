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
    private String programa;
    private int semestre;
    
    // El constructor xd
    public Estudiante(String codigo, String nombre, String programa, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        this.semestre = semestre;
    }

    // Getters (☞ﾟヮﾟ)☞
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrograma() {
        return programa;
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

    public void setPrograma(String programa) {
        this.programa = programa;
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
                ", programa='" + programa + '\'' +
                ", semestre=" + semestre +
                '}';
    }
    
}
