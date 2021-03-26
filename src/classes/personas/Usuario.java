package classes.personas;
import classes.serie.Capitulo;
import classes.serie.Serie;
import classes.serie.Temporada;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {

    private List<Serie> listaSeries;

    public Usuario() {
        super();
    }

    public Usuario(int dni, String nombre) {
        super(dni, nombre);
        this.listaSeries = new ArrayList<>();
    }

    public void agregarSerie(Serie serie) throws Exception{
        if(listaSeries.contains(serie)){
            throw new Exception();
        } else {
            listaSeries.add(serie);
        }
    }

    public void verCapitulo(Serie serie) throws Exception{
        int capitulosVistos = 0;
        int auxiliar = 0;
        if(listaSeries.contains(serie)){
            for(Temporada temporada : serie.getListaTemporadas()){
                if(!temporada.isTerminada()){
                    temporada.setIniciada();
                    for(Capitulo capitulo : temporada.getListaCapitulos()){

                        if(!capitulo.isVisto()) {
                            capitulo.setVisto(true);
                            return;
                        } else {
                            capitulosVistos++;
                        }
                        if(capitulosVistos == temporada.getListaCapitulos().size()){
                            temporada.setTerminada();
                        }
                    }
                }
                if(temporada.isTerminada()){
                    auxiliar++;
                }
                if(auxiliar == serie.getListaTemporadas().size()){
                    throw new Exception();
                }
            }
        } else {
            throw new Exception();
        }
    }

    public int cantidadDeCapitulosVistos(){
        int totalCapitulosVistos = 0;
        for(Serie series : listaSeries){
            for(Temporada temporada : series.getListaTemporadas()){
                totalCapitulosVistos = totalCapitulosVistos + temporada.capitulosVistos();
            }
        }

        return totalCapitulosVistos;
    }

    public void continuarViendo() throws Exception{
        int auxiliar = 0;
        for(Serie series : listaSeries){
            for(Temporada temporada : series.getListaTemporadas()){
                if(temporada.isTerminada()){
                    auxiliar = auxiliar + 1;
                    break;
                }
                for(Capitulo capitulo : temporada.getListaCapitulos()){
                    if(!capitulo.isVisto()){
                        System.out.println("serie: " + series.getTitulo() +
                                " temporada: " + temporada.getNumero() +
                                " capitulo: " + capitulo.getNumeroCapitulo() );
                        break;
                    }
                }
            }
        }
        if(listaSeries.size() == auxiliar)
            throw new Exception();
    }


    @Override
    public String toString() {
        return "Usuario{" + " nombre= " + super.getNombre() + " dni= " + super.getDni() +
                "listaSeries=" + listaSeries +
                '}';
    }
}
