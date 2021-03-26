package classes.serie;

import java.util.Objects;

public class Capitulo {

    private int numeroCapitulo;
    private String titulo;
    private float duracion;
    private boolean visto = false;

    public Capitulo(){

    }

    public Capitulo(int numeroCapitulo, String titulo, float duracion, boolean visto) {
        this.numeroCapitulo = numeroCapitulo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.visto = visto;
    }

    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capitulo capitulo = (Capitulo) o;
        return numeroCapitulo == capitulo.numeroCapitulo && Float.compare(capitulo.duracion, duracion) == 0 && visto == capitulo.visto && Objects.equals(titulo, capitulo.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCapitulo, titulo, duracion, visto);
    }

    @Override
    public String toString() {
        return "Capitulo{" +
                "numeroCapitulo=" + numeroCapitulo +
                ", titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }
}
