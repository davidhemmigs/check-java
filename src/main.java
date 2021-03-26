import classes.personas.Actor;
import classes.personas.Personaje;
import classes.personas.Usuario;
import classes.serie.Capitulo;
import classes.serie.Serie;
import classes.serie.Temporada;

public class main {
    public static void main(String[] args){

        // instancia de capitulos

        Capitulo capitulo1 = new Capitulo(1,"regreso",20.1f, false);
        Capitulo capitulo2 = new Capitulo(2,"nuevas caras",20.5f,false);
        Capitulo capitulo01 = new Capitulo(1,"recuerdos",19.9f,false);
        Capitulo capitulo02 = new Capitulo(2,"luz de luna",23.0f,false);
        Capitulo capitulo001 = new Capitulo(1,"sombras",22.6f,false);
        Capitulo capitulo002 = new Capitulo(2, "heroe",23.2f,false);

        // instancia de temporadas

        Temporada temporada1 = new Temporada(1,2002);
        Temporada temporada2 = new Temporada(2,2008);
        Temporada temporada3 = new Temporada(1,2009);

        // instancia de series

        Serie serie1 = new Serie(1,"naruto","anime",2002,"ninja");
        Serie serie2 = new Serie(2,"naruto shippuden", "anime", 2008, "ninja");

        //instacia  actores

        Actor actor1 = new Actor(46053372,"juan","perez");
        Actor actor2 = new Actor(47938823,"maria","perez");

        // instancia personajes

        Personaje personaje1 = new Personaje(actor1, "maquiavelo");
        Personaje personaje2 = new Personaje(actor2, "hercules");

        // instacia usuario

        Usuario usuario1 = new Usuario(12233445, "david");
        Usuario usuario2 = new Usuario(98877665,"pablo");

        temporada1.agregarCapitulos(capitulo1);
        temporada1.agregarCapitulos(capitulo2);
        temporada2.agregarCapitulos(capitulo001);
        temporada2.agregarCapitulos(capitulo002);
        temporada3.agregarCapitulos(capitulo01);
        temporada3.agregarCapitulos(capitulo02);

        try{
            serie1.agregar(temporada1);
            serie1.agregar(temporada2);
            serie2.agregar(temporada3);
            serie1.agregar(personaje1);
            serie1.agregar(personaje2);


        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            usuario1.agregarSerie(serie1);
            usuario1.agregarSerie(serie2);
            // no se pueden agregar repetidos;
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            usuario1.verCapitulo(serie1);

            usuario1.verCapitulo(serie2);


            usuario1.continuarViendo();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(usuario1);
        System.out.println(temporada1.capitulosVistos());
        System.out.println(usuario1.cantidadDeCapitulosVistos());

        System.out.println(serie1.buscar(1));
        try {
            serie1.quitar(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(serie1.buscar(1));


    }
}
