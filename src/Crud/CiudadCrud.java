package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Ciudad;
import Models.ICrudModel;

public class CiudadCrud implements ICrudModel<Ciudad> {

    private HashMap<String, Ciudad> ciudades;

    @Override
    public void Agregar(Ciudad object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            ciudades.put(object.getNombre(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Ciudad Buscar(Ciudad object) throws Exception {
        Ciudad ciudad = new Ciudad();
        try {

            ciudad = ciudades.get(object.getNombre());

            if (ciudad == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return ciudad;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ciudad;
    }

    @Override
    public boolean Editar(Ciudad object) throws Exception {
        try {
            Ciudad ciudad = Buscar(object);
            ciudades.put(object.getNombre(), ciudad);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Ciudad object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase "
                                + this.getClass().getName());

            ciudades.remove(object.getNombre());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Ciudad> ListarTodo() throws Exception {
        ArrayList<Ciudad> ciudadesList = null;
        try {

            ciudadesList = (ArrayList<Ciudad>) ciudades.values();

            if (ciudadesList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return ciudadesList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public boolean validarExistencia(Ciudad object) throws Exception {
        try {
            boolean existeCiudad = ciudades.containsKey(object.getNombre());

            return !existeCiudad ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadCiudades = 0;
        try {

            cantidadCiudades = ciudades.size();

            if (cantidadCiudades == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadCiudades;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadCiudades;
        }
    }

}
