
package Crud;

import java.util.HashMap;
import java.util.List;

import Customs.CustomErrorMessage;
import Dominio.AsesoresSectores;
import Models.ICrudModel;

public class AsesoresSectoresCrud implements ICrudModel<AsesoresSectores> {

    private HashMap<String, AsesoresSectores> asesoresSectores;

    // @Override
    // public void Agregar(AsesoresSectores object) {
    // try {
    // if (validarExistencia(object) )
    // throw new Exception("Error: " +
    // CustomErrorMessage.GetAlreadyExistsErrorMessage());

    // asesoresSectores.put(object., object);

    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // }
    // }

    // @Override
    // public AsesoresSectores Buscar(AsesoresSectores object) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'Buscar'");
    // }

    // @Override
    // public boolean Editar(AsesoresSectores object) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'Editar'");
    // }

    // @Override
    // public boolean Eliminar(AsesoresSectores object) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'Eliminar'");
    // }

    // @Override
    // public List<AsesoresSectores> ListarTodo() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'ListarTodo'");
    // }

    // @Override
    // public boolean validarExistencia(AsesoresSectores object) {
    // try {
    // boolean existeAsesorSector =
    // asesoresSectores.containsKey(object.getIdentificacion());

    // return !existeAsesorSector ? false : true;

    // } catch (Exception e) {
    // System.out.println("Error: " + e.getMessage());
    // }
    // return false;

    // }

    // @Override
    // public int Contar() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'Contar'");
    // }

}
