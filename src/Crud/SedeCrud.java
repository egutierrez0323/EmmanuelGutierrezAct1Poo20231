package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Sede;
import Models.ICrudModel;

public class SedeCrud implements ICrudModel<Sede> {

    private HashMap<String, Sede> sedes;

    @Override
    public void Agregar(Sede object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            sedes.put(object.getNombre(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Sede Buscar(Sede object) throws Exception {
        Sede sede = new Sede();
        try {

            sede = sedes.get(object.getNombre());

            if (sede == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return sede;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sede;
    }

    @Override
    public boolean Editar(Sede object) throws Exception {
        try {
            Sede asesor = Buscar(object);
            sedes.put(object.getNombre(), asesor);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Sede object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase "
                                + this.getClass().getName());

            sedes.remove(object.getNombre());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Sede> ListarTodo() throws Exception {
        ArrayList<Sede> sedesList = null;
        try {

            sedesList = (ArrayList<Sede>) sedes.values();

            if (sedesList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return sedesList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sedesList;
    }

    @Override
    public boolean validarExistencia(Sede object) throws Exception {
        try {
            boolean existeAsesor = sedes.containsKey(object.getNombre());

            return !existeAsesor ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadSedes = 0;
        try {

            cantidadSedes = sedes.size();

            if (cantidadSedes == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadSedes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadSedes;
        }
    }
}
