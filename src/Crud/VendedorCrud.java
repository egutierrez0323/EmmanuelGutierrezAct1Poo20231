package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Vendedor;
import Models.ICrudModel;

public class VendedorCrud implements ICrudModel<Vendedor> {

    private HashMap<String, Vendedor> vendedores;

    @Override
    public void Agregar(Vendedor object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            vendedores.put(object.getNombre(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Vendedor Buscar(Vendedor object) throws Exception {
        Vendedor vendedor = new Vendedor();
        try {

            vendedor = vendedores.get(object.getIdentificacion());

            if (vendedor == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return vendedor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return vendedor;
    }

    @Override
    public boolean Editar(Vendedor object) throws Exception {
        try {
            Vendedor vendedor = Buscar(object);
            vendedores.put(object.getIdentificacion(), vendedor);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Vendedor object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase "
                                + this.getClass().getName());

            vendedores.remove(object.getIdentificacion());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Vendedor> ListarTodo() throws Exception {
        ArrayList<Vendedor> asesoresList = null;
        try {

            asesoresList = (ArrayList<Vendedor>) vendedores.values();

            if (asesoresList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return asesoresList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return asesoresList;
    }

    @Override
    public boolean validarExistencia(Vendedor object) throws Exception {
        try {
            boolean existeVendedor = vendedores.containsKey(object.getIdentificacion());

            return !existeVendedor ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadVendedores = 0;
        try {

            cantidadVendedores = vendedores.size();

            if (cantidadVendedores == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadVendedores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadVendedores;
        }
    }
}
