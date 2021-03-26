package classes.serie;

import classes.personas.Personaje;
import interfaces.IAcciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Serie implements IAcciones {

    private int id;
    private String titulo;
    private String genero;
    private int anio;
    private String sinopsis;
    private List<Temporada> listaTemporadas;
    private List<Personaje> listaPersonajes;

    public Serie(){

    }

    public Serie(int id, String titulo, String genero, int anio, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.listaTemporadas = new ArrayList<>();
        this.listaPersonajes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getanio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void setListaTemporadas(List<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }

    public List<Personaje> getListapersonajes() {
        return listaPersonajes;
    }

    public void setListapersonajes(List<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @Override
    public void agregar(Object object) throws Exception {
        if(object instanceof Temporada){
            for(Temporada temporada : listaTemporadas){
                if (temporada == object){
                    throw new Exception();
                }
            }
            listaTemporadas.add((Temporada) object);
        }
        if(object instanceof Personaje){
            for(Personaje personaje : listaPersonajes){
                if (personaje == object){
                    throw new Exception();
                }
            }
            listaPersonajes.add((Personaje) object);
        }
    }

    @Override
    public Object buscar(int numero) {
        if (numero < 1000){
            for(Temporada temporada : listaTemporadas){
                if (temporada.getId() == numero) {
                    return temporada;
                }
            }
        } else {
            for(Personaje personaje : listaPersonajes){
                if(personaje.getId() == numero){
                    return personaje;
                }
            }
        }

        return null;
    }

    @Override
    public void quitar(int numero) throws Exception {
        Object auxiliar;
        if (numero < 1000){
            for(Temporada temporada : listaTemporadas){
                if (temporada.getId() == numero){
                    auxiliar = temporada;
                    listaTemporadas.remove(auxiliar);
                    return;
                }
            }
        } else {
            for(Personaje personaje : listaPersonajes){
                if(personaje.getId() == numero){
                    auxiliar = personaje;
                    listaPersonajes.remove(auxiliar);
                    return;
                }
            }
        }
        throw new Exception();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return id == serie.id && anio == serie.anio && Objects.equals(titulo, serie.titulo) && Objects.equals(genero, serie.genero) && Objects.equals(sinopsis, serie.sinopsis) && Objects.equals(listaTemporadas, serie.listaTemporadas) && Objects.equals(listaPersonajes, serie.listaPersonajes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, genero, anio, sinopsis, listaTemporadas, listaPersonajes);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", sinopsis='" + sinopsis + '\'' +
                ", listaTemporadas=" + listaTemporadas +
                ", listaPersonajes=" + listaPersonajes +
                '}';
    }
}
