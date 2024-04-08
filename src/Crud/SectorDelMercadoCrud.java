package Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.SectorDelMercado;
import Models.ICrudModel;

public class SectorDelMercadoCrud implements ICrudModel<SectorDelMercado> {
    private HashMap<String, SectorDelMercado> sectoresDelMercado;

    @Override
    public void Agregar(SectorDelMercado object) throws Exception {
        try {
            if (validarExistencia(object))
                throw new Exception("Error: " + CustomErrorMessage.GetAlreadyExistsErrorMessage());

            sectoresDelMercado.put(object.getNombre(), object);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public SectorDelMercado Buscar(SectorDelMercado object) throws Exception {
        SectorDelMercado sectorDelMercado = new SectorDelMercado();
        try {

            sectorDelMercado = sectoresDelMercado.get(object.getNombre());

            if (sectorDelMercado == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return sectorDelMercado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sectorDelMercado;
    }

    @Override
    public boolean Editar(SectorDelMercado object) throws Exception {
        try {
            SectorDelMercado asesor = Buscar(object);
            sectoresDelMercado.put(object.getNombre(), asesor);
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(SectorDelMercado object) throws Exception {
        try {
            if (!validarExistencia(object))
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En la clase "
                                + this.getClass().getName());

            sectoresDelMercado.remove(object.getNombre());

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<SectorDelMercado> ListarTodo() throws Exception {
        ArrayList<SectorDelMercado> asesoresList = null;
        try {

            asesoresList = (ArrayList<SectorDelMercado>) sectoresDelMercado.values();

            if (asesoresList == null)
                throw new Exception("Error: " + CustomErrorMessage.GetNotFoundErrorMessage());

            return asesoresList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return asesoresList;
    }

    @Override
    public boolean validarExistencia(SectorDelMercado object) throws Exception {
        try {
            boolean existeSectorDelMercado = sectoresDelMercado.containsKey(object.getNombre());

            return !existeSectorDelMercado ? false : true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public int Contar() throws Exception {
        int cantidadSectoresDelMercado = 0;
        try {

            cantidadSectoresDelMercado = sectoresDelMercado.size();

            if (cantidadSectoresDelMercado == 0)
                throw new Exception(
                        "Error: " + CustomErrorMessage.GetNotFoundErrorMessage() + ". En " + this.getClass().getName());

            return cantidadSectoresDelMercado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cantidadSectoresDelMercado;
        }
    }

}
