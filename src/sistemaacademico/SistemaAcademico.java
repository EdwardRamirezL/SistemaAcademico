package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemaAcademico {

    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        
        int op;
        
       do {
            op = mostrarMenu();
            
            switch (op) {

                case 1:
                    registrarEstudiante();
                    break;

                case 2:
                    listarEstudiante();
                    break;

                case 3:
                    buscarEstudiante();
                    break;

                case 4:
                    actualizarEstudiante();
                    break;

                case 5:
                    eliminarEstudiante();
                    break;

                case 6:
                    System.out.println("Registrar asignatura...");
                    break;

                case 7:
                    System.out.println("Listar asignaturas...");
                    break;

                case 8:
                    System.out.println("Buscar asignatura por codigo...");
                    break;

                case 9:
                    System.out.println("Actualizar registro asignatura...");
                    break;

                case 10:
                    System.out.println("Eliminar registro asignatura...");
                    break;

                case 11:
                    System.out.println("Registrar nota...");
                    break;

                case 12:
                    System.out.println("Listar notas...");
                    break;

                case 13:
                    System.out.println("Buscar nota asociada a estudiante...");
                    break;

                case 14:
                    System.out.println("Actualizar nota...");
                    break;

                case 15:
                    System.out.println("Eliminar nota...");
                    break;

                case 16:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 16);
       
    }
    

    public static int mostrarMenu(){

        int opcion;
         
        do{
            System.out.println("\n      SISTEMA ACADEMICO      \n");
            System.out.println(" 1. Registrar estudiante");
            System.out.println(" 2. Listar estudiantes");
            System.out.println(" 3. Buscar estudiante por identificacion");
            System.out.println(" 4. Actualizar registro estudiante");
            System.out.println(" 5. Eliminar registro estudiante");
            System.out.println(" 6. Registrar asignatura");
            System.out.println(" 7. Listar asignaturas");
            System.out.println(" 8. Buscar asignatura por codigo");
            System.out.println(" 9. Actualizar registro asignatura");
            System.out.println("10. Eliminar registro asignatura");
            System.out.println("11. Registrar nota");
            System.out.println("12. Listar notas");
            System.out.println("13. Buscar nota asociada a estudiante");
            System.out.println("14. Actualizar nota");
            System.out.println("15. Eliminar nota");
            System.out.println("16. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); 
            
        }while((opcion < 1) || (opcion > 16));
        
        return opcion;
    }
    
    public static void registrarEstudiante(){
        System.out.println("\n    REGISTRAR ESTUDIANTE    ");

        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Semestre: ");
        int semestre = sc.nextInt();
        sc.nextLine();

        Estudiante nuevo = new Estudiante(codigo, nombre, apellido, edad, semestre);
        estudiantes.add(nuevo);

        System.out.println("Estudiante registrado correctamente.");
    }
    
    public static void listarEstudiante(){
        System.out.println("\n    LISTA DE ESTUDIANTES    ");

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.println(e);
            }
        }
    }
    
    public static void buscarEstudiante(){
        System.out.print("Ingrese codigo del estudiante: ");
        String codigo = sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Estudiante encontrado:");
                System.out.println(e);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
    
    public static void actualizarEstudiante(){
        System.out.print("Ingrese codigo del estudiante a actualizar: ");
        String codigo = sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {

                System.out.print("Nuevo nombre: ");
                e.setNombre(sc.nextLine());

                System.out.print("Nuevo apellido: ");
                e.setApellido(sc.nextLine());

                System.out.print("Nueva edad: ");
                e.setEdad(sc.nextInt());

                System.out.print("Nuevo semestre: ");
                e.setSemestre(sc.nextInt());
                sc.nextLine();

                System.out.println("Estudiante actualizado correctamente.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
   
    public static void eliminarEstudiante(){
        System.out.print("Ingrese codigo del estudiante a eliminar: ");
        String codigo = sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                estudiantes.remove(e);
                System.out.println("Estudiante eliminado correctamente.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
    
    //CRUD de la clase Notas
    
    public static void registrarNota() {

    System.out.println("\n    REGISTRAR NOTA    ");

    System.out.print("Codigo del estudiante: ");
    String codigoEst = sc.nextLine();

    Estudiante estudianteEncontrado = null;

    for (Estudiante e : estudiantes) {
        if (e.getCodigo().equalsIgnoreCase(codigoEst)) {
            estudianteEncontrado = e;
            break;
        }
    }

    if (estudianteEncontrado == null) {
        System.out.println("Estudiante no encontrado.");
        return;
    }

    System.out.print("Codigo de la asignatura: ");
    String codigoAsig = sc.nextLine();

    Asignatura asignaturaEncontrada = null;

    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equalsIgnoreCase(codigoAsig)) {
            asignaturaEncontrada = a;
            break;
        }
    }

    if (asignaturaEncontrada == null) {
        System.out.println("Asignatura no encontrada.");
        return;
    }

    System.out.print("Valor de la nota: ");
    double valor = sc.nextDouble();
    sc.nextLine();

    System.out.print("Periodo: ");
    String periodo = sc.nextLine();

    Nota nueva = new Nota(estudianteEncontrado, asignaturaEncontrada, valor, periodo);
    notas.add(nueva);

    System.out.println("Nota registrada correctamente.");
}
    
    public static void listarNotas() {

    System.out.println("\n    LISTA DE NOTAS    ");

    if (notas.isEmpty()) {
        System.out.println("No hay notas registradas.");
    } else {
        for (Nota n : notas) {
            System.out.println(n);
        }
    }
}
    
    public static void buscarNota() {

    System.out.print("Ingrese codigo del estudiante: ");
    String codigo = sc.nextLine();

    boolean encontrada = false;

    for (Nota n : notas) {
        if (n.getEstudiante().getCodigo().equalsIgnoreCase(codigo)) {
            System.out.println(n);
            encontrada = true;
        }
    }

    if (!encontrada) {
        System.out.println("No se encontraron notas para ese estudiante.");
    }
}
    
    public static void actualizarNota() {

    System.out.println("\n    ACTUALIZAR NOTA    ");

    System.out.print("Codigo del estudiante: ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo de la asignatura: ");
    String codigoAsig = sc.nextLine();

    System.out.print("Periodo: ");
    String periodo = sc.nextLine();

    for (Nota n : notas) {

        if (n.getEstudiante().getCodigo().equalsIgnoreCase(codigoEst) &&
            n.getAsignatura().getCodigo().equalsIgnoreCase(codigoAsig) &&
            n.getPeriodo().equalsIgnoreCase(periodo)) {

            System.out.print("Nuevo valor de la nota: ");
            double nuevoValor = sc.nextDouble();
            sc.nextLine();

            n.setValor(nuevoValor);

            System.out.println("Nota actualizada correctamente.");
            return;
        }
    }

    System.out.println("Nota no encontrada.");
}
    
    public static void eliminarNota() {

    System.out.println("\n    ELIMINAR NOTA    ");

    System.out.print("Codigo del estudiante: ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo de la asignatura: ");
    String codigoAsig = sc.nextLine();

    System.out.print("Periodo: ");
    String periodo = sc.nextLine();

    for (Nota n : notas) {

        if (n.getEstudiante().getCodigo().equalsIgnoreCase(codigoEst) &&
            n.getAsignatura().getCodigo().equalsIgnoreCase(codigoAsig) &&
            n.getPeriodo().equalsIgnoreCase(periodo)) {

            notas.remove(n);
            System.out.println("Nota eliminada correctamente.");
            return;
        }
    }

    System.out.println("Nota no encontrada.");
}
    
    // Metodos de la clase asignatura
    
    public static void registrarAsignatura() {

    System.out.println("=== Registrar Asignatura ===");

    System.out.print("Codigo: ");
    String codigo = sc.nextLine();

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Creditos: ");
    int creditos = Integer.parseInt(sc.nextLine());

    System.out.print("Docente: ");
    String docente = sc.nextLine();

    Asignatura nuevaAsignatura = new Asignatura(codigo, nombre, creditos, docente);
    asignaturas.add(nuevaAsignatura);

    System.out.println("Asignatura registrada correctamente.");
}


}
