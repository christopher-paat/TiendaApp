package Actividad6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grupo grupo = new Grupo();
        grupo.setNombreGrupo("Construccion de software");

        int opcion = 0;
        do {
            System.out.println("1. Asignar Profesor");
            System.out.println("2. Agregar Alumno");
            System.out.println("3. Ver grupo");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:
                    Profesor profesor = new Profesor();
                    System.out.print("Nombre: ");
                    profesor.setNombre(scanner.nextLine());
                    System.out.print("Apellido paterno: ");
                    profesor.setApellidoPaterno(scanner.nextLine());
                    System.out.print("Apellido materno: ");
                    profesor.setApellidoMaterno(scanner.nextLine());
                    System.out.print("Grado academico: ");
                    profesor.setGradoAcademico(scanner.nextLine());
                    System.out.print("Numero de empleado: ");
                    profesor.setNumeroEmpleado(scanner.nextLine());
                    
                    grupo.setProfesor(profesor);
                    System.out.println("Profesor asignado");
                    break;

                case 2:
                    Alumno alumno = new Alumno();
                    System.out.print("Nombre: ");
                    alumno.setNombre(scanner.nextLine());
                    System.out.print("Apellido paterno: ");
                    alumno.setApellidoPaterno(scanner.nextLine());
                    System.out.print("Apellido materno: ");
                    alumno.setApellidoMaterno(scanner.nextLine());
                    System.out.print("Carrera: ");
                    alumno.setCarrera(scanner.nextLine());
                    System.out.print("Numero de cuenta: ");
                    alumno.setNumeroCuenta(scanner.nextLine());
                    
                    grupo.agregarAlumno(alumno);
                    System.out.println("Alumno agregado");
                    break;

                case 3:
                    System.out.println("Materia: " + grupo.getNombreGrupo());
                    
                    Profesor p = grupo.getProfesor();
                    if (p != null) {
                        System.out.println("Profesor: " + p.getGradoAcademico() + " " + p.getNombre() + " " + p.getApellidoPaterno() + " " + p.getApellidoMaterno());
                    } else {
                        System.out.println("Profesor no asignado");
                    }
                    
                    System.out.println("Alumnos: " + grupo.getAlumnos().size());
                    
                    for (int i = 0; i < grupo.getAlumnos().size(); i++) {
                        Alumno a = grupo.getAlumnos().get(i);
                        System.out.println("- " + a.getNombre() + " " + a.getApellidoPaterno() + " " + a.getApellidoMaterno());
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

