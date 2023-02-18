package Alumno;

import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;

/**
 * Alumno.java
 * Definición de la clase Alumno
 * @author Luis José Sánchez
 */

public class Alumno {

    /**
     * @return devuelve el nombre de los alumnos
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre asigna el nobre a cada alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve la nota de cada alumno
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the notaMedia to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    /**
     * refactorizamos cambiando el nombre de notaMedia por nota
     * que es la que tiene cada alumno
     */
  private String nombre;
  private double nota = 0.0;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    public static final String PROP_NOMBRE = "nombre";
    public static final String PROP_NOTA = "nota";
  
}
