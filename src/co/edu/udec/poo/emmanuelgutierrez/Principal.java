/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udec.poo.emmanuelgutierrez;

import java.sql.Date;

import Crud.AsesorCrud;
import Crud.CiudadCrud;
import Crud.EmpresaCrud;
import Crud.PaisCrud;
import Crud.SectorDelMercadoCrud;
import Crud.SedeCrud;
import Crud.UsuarioCrud;
import Crud.VendedorCrud;
import Dominio.Asesor;
import Dominio.Ciudad;
import Dominio.Empresa;
import Dominio.Pais;
import Dominio.SectorDelMercado;
import Dominio.Sede;
import Dominio.Usuario;
import Dominio.Vendedor;

/**
 *
 * @author Edwin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear dos objetos vacíos de la clase Asesor
        Asesor asesor1 = new Asesor();
        Asesor asesor2 = new Asesor();

        // Ingresar valores a cada objeto utilizando los setters
        asesor1.setIdentificacion("1");
        asesor1.setNombre("Juan");
        asesor1.setDireccion("Calle A");
        asesor1.setUsuario("usuario1");
        asesor1.setClave("clave1");
        asesor1.setPerfil("perfil1");
        asesor1.setTitulacion("Licenciado en Economía");
        asesor1.setFechaInicioTrabajo(new Date(0));

        asesor2.setIdentificacion("2");
        asesor2.setNombre("María");
        asesor2.setDireccion("Calle B");
        asesor2.setUsuario("usuario2");
        asesor2.setClave("clave2");
        asesor2.setPerfil("perfil2");
        asesor2.setTitulacion("Ingeniero en Informática");
        asesor2.setFechaInicioTrabajo(new Date(0));

        Sede sede1 = new Sede();
        Sede sede2 = new Sede();
        Ciudad ciudad1 = new Ciudad();
        Ciudad ciudad2 = new Ciudad();

        sede1.setNombre("Sede 1");
        sede1.setEmpresa(new Empresa());
        sede1.setCiudad(new Ciudad());
        sede1.setPais(new Pais());

        sede2.setNombre("Sede 2");
        sede2.setEmpresa(new Empresa());
        sede2.setCiudad(ciudad1);
        sede2.setPais(new Pais());

        ciudad1.setNombre("Ciudad A");
        ciudad1.setIdCiudad(1);
        ciudad1.setSede(sede1);

        ciudad2.setNombre("Ciudad B");
        ciudad2.setIdCiudad(2);
        ciudad2.setSede(sede2);

        Empresa empresa1 = new Empresa();
        Empresa empresa2 = new Empresa();

        // Ingresar valores a empresa1 utilizando setters
        empresa1.setNombre("Empresa 1");
        empresa1.setFechaIncorporacion(new Date(0));
        empresa1.setFacturacionAnual(1000000.0); // Ejemplo de facturación anual
        empresa1.setNumeroVendedores(50); // Ejemplo de número de vendedores

        // Crear una sede y un vendedor para asociar con empresa1

        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();

        empresa1.setSede(sede1); // Asociar la sede con empresa1
        empresa1.getVendedores().add(vendedor1); // Agregar el vendedor a la lista de vendedores de empresa1

        // Ingresar valores a empresa2 utilizando setters
        empresa2.setNombre("Empresa 2");
        empresa2.setFechaIncorporacion(new Date(0));
        empresa2.setFacturacionAnual(2000000.0);
        empresa2.setNumeroVendedores(100);

        empresa2.setSede(sede2);
        empresa2.getVendedores().add(vendedor2);

        vendedor1.setIdentificacion("1");
        vendedor1.setNombre("Juan");
        vendedor1.setDireccion("Calle A");
        vendedor1.setUsuario("usuario1");
        vendedor1.setClave("clave1");
        vendedor1.setPerfil("perfil1");
        vendedor1.setFechaReclutamiento(new Date(0));
        vendedor1.setId_lider(123); // Supongamos que el ID del líder es 123

        vendedor2.setIdentificacion("2");
        vendedor2.setNombre("María");
        vendedor2.setDireccion("Calle B");
        vendedor2.setUsuario("usuario2");
        vendedor2.setClave("clave2");
        vendedor2.setPerfil("perfil2");
        vendedor2.setFechaReclutamiento(new Date(0));
        vendedor2.setId_lider(123);

        Pais pais1 = new Pais();
        Pais pais2 = new Pais();

        // Ingresar valores al primer objeto utilizando los setters
        pais1.setNombre("España");
        pais1.setProductoInternoBruto(1.4e12); // Producto Interno Bruto en euros
        pais1.setPoblacion(47000000); // Población de España
        pais1.setCapital("Madrid");

        // Ingresar valores al segundo objeto utilizando los setters
        pais2.setNombre("Francia");
        pais2.setProductoInternoBruto(2.8e12); // Producto Interno Bruto en euros
        pais2.setPoblacion(67000000); // Población de Francia
        pais2.setCapital("París");
        // Crear una sede para el segundo país

        SectorDelMercado sector1 = new SectorDelMercado();
        SectorDelMercado sector2 = new SectorDelMercado();

        // Ingresar valores a cada objeto utilizando los setters
        sector1.setNombre("Tecnología");
        sector1.setDescripcion("Productos y servicios relacionados con la tecnología.");

        sector2.setNombre("Alimentación");
        sector2.setDescripcion("Productos alimenticios y bebidas.");

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        // Ingresar valores a usuario1 utilizando los setters
        usuario1.setIdentificacion("001");
        usuario1.setNombre("Juan");
        usuario1.setDireccion("Calle A");
        usuario1.setUsuario("usuario1");
        usuario1.setClave("clave1");
        usuario1.setPerfil("perfil1");

        // Ingresar valores a usuario2 utilizando los setters
        usuario2.setIdentificacion("002");
        usuario2.setNombre("María");
        usuario2.setDireccion("Calle B");
        usuario2.setUsuario("usuario2");
        usuario2.setClave("clave2");
        usuario2.setPerfil("perfil2");

        try {

            AsesorCrud crudAsesor = new AsesorCrud();
            crudAsesor.Agregar(asesor1);
            crudAsesor.Agregar(asesor2);

            CiudadCrud crudCiudad = new CiudadCrud();
            crudCiudad.Agregar(ciudad1);
            crudCiudad.Agregar(ciudad2);

            EmpresaCrud crudEmpresa = new EmpresaCrud();
            crudEmpresa.Agregar(empresa1);
            crudEmpresa.Agregar(empresa2);

            PaisCrud crudPais = new PaisCrud();
            crudPais.Agregar(pais1);
            crudPais.Agregar(pais2);

            SectorDelMercadoCrud crudSectorDelMercado = new SectorDelMercadoCrud();
            crudSectorDelMercado.Agregar(sector1);
            crudSectorDelMercado.Agregar(sector2);

            SedeCrud crudSede = new SedeCrud();
            crudSede.Agregar(sede1);
            crudSede.Agregar(sede2);

            UsuarioCrud crudUsuario = new UsuarioCrud();
            crudUsuario.Agregar(usuario1);
            crudUsuario.Agregar(usuario2);

            VendedorCrud crudVendedor = new VendedorCrud();
            crudVendedor.Agregar(vendedor1);
            crudVendedor.Agregar(vendedor2);

            int conteoAsesores = crudAsesor.Contar();
            int conteoCiudad = crudCiudad.Contar();
            int conteoEmpresa = crudEmpresa.Contar();
            int conteoPais = crudPais.Contar();
            int conteoSede = crudSede.Contar();
            int conteoUsuario = crudUsuario.Contar();
            int conteoVendedor = crudVendedor.Contar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
