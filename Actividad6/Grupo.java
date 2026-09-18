package Actividad6;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombreGrupo;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Grupo() {
        this.alumnos = new ArrayList<>();
    }

    public Grupo(String nombreGrupo, Profesor profesor, List<Alumno> alumnos) {
        this.nombreGrupo = nombreGrupo;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
}
