package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemaAcademico {

    public static void main(String[] args) {
       
        ArrayList<Object> estudiantes, asignaturas, notas = new ArrayList<>();
        
        
       int op = mostrarMenu();
       do {
            switch (op) {

                case 1:
                    System.out.println("Registrar estudiante...");
                    break;

                case 2:
                    System.out.println("Listar estudiantes...");
                    break;

                case 3:
                    System.out.println("Buscar estudiante por identificacion...");
                    break;

                case 4:
                    System.out.println("Actualizar registro estudiante...");
                    break;

                case 5:
                    System.out.println("Eliminar registro estudiante...");
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
        
        Scanner sc = new Scanner(System.in);
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
            
        }while((opcion > 0) || (opcion <= 16));
        
        return opcion;
    }
}
