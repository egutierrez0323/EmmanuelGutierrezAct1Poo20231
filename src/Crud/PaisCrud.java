package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Pais;
import Models.ICrudModel;

public class PaisCrud implements ICrudModel<Pais> {

    private HashMap<String, Pais> paises;

    @Override
    public void Agregar(Pais object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            paises.put(object.getNombre(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Pais Buscar(Pais object) throws Exception {
        Pais pais = new Pais();
        try {

            pais = paises.get(object.getNombre());

            if (pais == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return pais;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pais;
    }

    @Override
    public boolean Editar(Pais object) throws Exception {
        try {
            Pais pais = Buscar(object);
            paises.put(object.getNombre(), pais);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Pais object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase " + this.getClass().getName());

            paises.remove(object.getNombre());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Pais> ListarTodo() throws Exception {
        ArrayList<Pais> paisesList = null;
        try {

            paisesList = (ArrayList<Pais>) paises.values();

            if (paisesList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return paisesList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return paisesList;
    }

    @Override
    public boolean validarExistencia(Pais object) throws Exception {
        try {
            boolean existePais = paises.containsKey(object.getNombre());

            return !existePais ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadPaises = 0;
        try {

            cantidadPaises = paises.size();

            if (cantidadPaises == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadPaises;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadPaises;
        }
    }
    

}
