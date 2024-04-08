package Models;

import java.util.List;

public interface ICrudModel<Generic> {

    public void Agregar(Generic object) throws Exception;

    public Generic Buscar(Generic object) throws Exception;

    public boolean Editar(Generic object) throws Exception;

    public boolean Eliminar(Generic object) throws Exception;

    public List<Generic> ListarTodo() throws Exception;

    public boolean validarExistencia(Generic object) throws Exception;

    public int Contar() throws Exception;

}
