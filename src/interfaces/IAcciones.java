package interfaces;

public interface IAcciones {

    void agregar(Object object ) throws Exception;
    Object buscar(int numero);
    void quitar(int numero) throws Exception;
}
