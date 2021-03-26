package classes.personas;

import java.util.Objects;

public class Personaje {

    private static int count = 1;
    private int id = 999;
    private Actor actor;
    private String nombrePersonaje;

    public Personaje(){

    }

    public Personaje( Actor actor, String nombrePersonaje) {
        id = id + count;
        count++;
        this.actor = actor;
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id && Objects.equals(actor, personaje.actor) && Objects.equals(nombrePersonaje, personaje.nombrePersonaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actor, nombrePersonaje);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", actor=" + actor +
                ", nombrePersonaje='" + nombrePersonaje + '\'' +
                '}';
    }
}
