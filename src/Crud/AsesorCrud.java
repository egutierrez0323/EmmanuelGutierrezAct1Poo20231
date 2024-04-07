
package Crud;

import java.util.HashMap;
import java.util.List;

import javax.naming.NameNotFoundException;

import Customs.CustomErrorMessage;
import Dominio.Asesor;
import Models.ICrudModel;

public class AsesorCrud implements ICrudModel<Asesor> {

    private HashMap<String, Asesor> asesores;

    @Override
    public void Agregar(Asesor object) {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsError());

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
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundError());

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
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            asesores.remove(object.getIdentificacion());



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Asesor> ListarTodo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ListarTodo'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Contar'");
    }

}
