package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Usuario;
import Models.ICrudModel;

public class UsuarioCrud implements ICrudModel<Usuario> {

    private HashMap<String, Usuario> usuarios;

    @Override
    public void Agregar(Usuario object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            usuarios.put(object.getIdentificacion(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Usuario Buscar(Usuario object) throws Exception {
        Usuario usuario = new Usuario();
        try {

            usuario = usuarios.get(object.getIdentificacion());

            if (usuario == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return usuario;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return usuario;
    }

    @Override
    public boolean Editar(Usuario object) throws Exception  {
        try {
            Usuario usuario = Buscar(object);
            usuarios.put(object.getUsuario(), usuario);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Usuario object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase "
                                + this.getClass().getName());

            usuarios.remove(object.getUsuario());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Usuario> ListarTodo() throws Exception {
        ArrayList<Usuario> usuariosList = null;
        try {

            usuariosList = (ArrayList<Usuario>) usuarios.values();

            if (usuariosList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return usuariosList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return usuariosList;
    }

    @Override
    public boolean validarExistencia(Usuario object) throws Exception {
        try {
            boolean existeUsuario = usuarios.containsKey(object.getIdentificacion());

            return !existeUsuario ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadUsuarios = 0;
        try {

            cantidadUsuarios = usuarios.size();

            if (cantidadUsuarios == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadUsuarios;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadUsuarios;
        }
    }
}
