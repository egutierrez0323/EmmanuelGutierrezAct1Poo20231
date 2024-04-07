package Models;

import java.util.List;

public interface ICrudModel<Generic> {

    public void Agregar(Generic object);

    public Generic Buscar(Generic object);

    public boolean Editar(Generic object);

    public boolean Eliminar(Generic object);

    public List<Generic> ListarTodo();

    public boolean validarExistencia(Generic object);

    public int Contar();

}
