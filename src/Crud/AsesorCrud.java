
package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.Asesor;
import Models.ICrudModel;

public class AsesorCrud implements ICrudModel<Asesor> {

    private HashMap<String, Asesor> asesores;

    @Override
    public void Agregar(Asesor object) {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            asesores.put(object.getIdentificacion(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Asesor Buscar(Asesor object) {
        Asesor asesor = new Asesor();
        try {

            asesor = asesores.get(object.getIdentificacion());

            if (asesor == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return asesor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return asesor;
    }

    @Override
    public boolean Editar(Asesor object) {

        try {
            Asesor asesor = Buscar(object);
            asesores.put(object.getIdentificacion(), asesor);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Asesor object) {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase " + this.getClass().getName());

            asesores.remove(object.getIdentificacion());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Asesor> ListarTodo() {
        ArrayList<Asesor> asesoresList = null;
        try {

            asesoresList = (ArrayList<Asesor>) asesores.values();

            if (asesoresList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return asesoresList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return asesoresList;
    }

    @Override
    public boolean validarExistencia(Asesor object) {

        try {
            boolean existeAsesor = asesores.containsKey(object.getIdentificacion());

            return !existeAsesor ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;

    }

    @Override
    public int Contar() {
        int cantidadAsesores = 0;
        try {

            cantidadAsesores = asesores.size();

            if (cantidadAsesores == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadAsesores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadAsesores;
        }
    }

}
