package classes.personas;

import java.util.Objects;

public class Actor extends Persona {

    private String apellido;

    public Actor(){
        super();
    }

    public Actor(int dni, String nombre, String apellido){
        super(dni,nombre);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(apellido, actor.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellido);
    }

    @Override
    public String toString() {
        return "Actor{ " + "nombre= " + super.getNombre() +
                " apellido= '" + apellido + " dni= " + super.getDni()+ '\'' +
                '}';
    }
}
