/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DVehiculo;
import java.util.ArrayList;

/**
 *
 * @author JeTf
 */
public class NVehiculo {
    private DVehiculo dvehiculo;
    
    public NVehiculo() {
        this.dvehiculo = new DVehiculo();
    }
    public void agregar(String marca,String modelo,String color, String matricula, int idcliente, String estado){
        this.dvehiculo.setMarca(marca);
        this.dvehiculo.setModelo(modelo);
        this.dvehiculo.setColor(color);
        this.dvehiculo.setMatricula(matricula);
        this.dvehiculo.setIdCliente(idcliente);       
        this.dvehiculo.setEstado(estado);
        this.dvehiculo.agregar();
    }
    public void eliminar(int id){
        this.dvehiculo.setIdVehiculo(id);
        this.dvehiculo.eliminar();
    }
    public ArrayList listar(){
        return this.dvehiculo.listar();
    }
    public void modificar(int id,String marca,String modelo,String color, String matricula, int idcliente, String estado){
        this.dvehiculo.setIdVehiculo(id);
        this.dvehiculo.setMarca(marca);
        this.dvehiculo.setModelo(modelo);
        this.dvehiculo.setColor(color);
        this.dvehiculo.setMatricula(matricula);
        this.dvehiculo.setIdCliente(idcliente);       
        this.dvehiculo.setEstado(estado);
        this.dvehiculo.modificar();
    }
}
