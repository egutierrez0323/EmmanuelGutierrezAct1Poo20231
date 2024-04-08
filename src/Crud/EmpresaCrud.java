
package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Empresa;
import Models.ICrudModel;

public class EmpresaCrud implements ICrudModel<Empresa>{

    private HashMap<Integer, Empresa> empresas;

    @Override
    public void Agregar(Empresa object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

                empresas.put(object.getId(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Empresa Buscar(Empresa object) throws Exception {

        try {

            Empresa empresa = empresas.get(object.getId());

            if (empresa == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return empresa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public boolean Editar(Empresa object) throws Exception {
        try {
            Empresa asesor = Buscar(object);
            empresas.put(object.getId(), asesor);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Empresa object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase " + this.getClass().getName());

            empresas.remove(object.getId());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Empresa> ListarTodo() throws Exception {
        ArrayList<Empresa> empresasList = null;
        try {

            empresasList = (ArrayList<Empresa>) empresas.values();

            if (empresasList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return empresasList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public boolean validarExistencia(Empresa object) throws Exception {
        try {
            boolean existeEmpresa = empresas.containsKey(object.getId());

            return !existeEmpresa ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadEmpresas = 0;

        try {
            cantidadEmpresas = empresas.size();
            return cantidadEmpresas;
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }

        return cantidadEmpresas;
    }


}
