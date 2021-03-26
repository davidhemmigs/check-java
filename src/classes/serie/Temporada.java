package classes.serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Temporada {
    private static int count = 1;
    private int id = 0 ;
    private int numero;
    private int anio;
    private boolean iniciada = false;
    private boolean terminada = false;
    private List<Capitulo> listaCapitulos;

    public Temporada(){

    }

    public Temporada(int numero, int anio ) {
        id = id + count;
        count++;
        this.numero = numero;
        this.anio = anio;
        listaCapitulos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getanio() {
        return anio;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada() {
        iniciada = true;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada() {
        terminada = true;
    }

    public List<Capitulo> getListaCapitulos() {
        return listaCapitulos;
    }

    public void setListaCapitulos(List<Capitulo> listaCapitulos) {
        this.listaCapitulos = listaCapitulos;
    }

    public void agregarCapitulos(Capitulo capitulo){
            listaCapitulos.add(capitulo);
    }
    public int capitulosVistos(){
        int auxiliar = 0;
        for(Capitulo capitulo : listaCapitulos){
            if(capitulo.isVisto()){
                auxiliar = auxiliar + 1;
            }
        }
            return auxiliar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temporada temporada = (Temporada) o;
        return id == temporada.id && numero == temporada.numero && anio == temporada.anio && iniciada == temporada.iniciada && terminada == temporada.terminada && Objects.equals(listaCapitulos, temporada.listaCapitulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, anio, iniciada, terminada, listaCapitulos);
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", numero=" + numero +
                ", anio=" + anio +
                ", iniciada=" + iniciada +
                ", terminada=" + terminada +
                ", listaCapitulos=" + listaCapitulos +
                '}';
    }
}
