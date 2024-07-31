/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aguin
 */
public class Empleado extends Persona {
    private String codigo_empleado, puesto;
    public Empleado (){}
    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    

    
    @Override
    public void agregar (){
    try {
        System.out.println("CODIGO DE EMPLEADO: " + getCodigo_empleado());
        System.out.println("NOMBRE: " + getNombres());
        System.out.println("APELLIDOS: " + getApellidos());
        System.out.println("DIRECCION: " + getDireccion());
        System.out.println("TELEFONO: " + getTelefono());
        System.out.println("PUESTO: " + getPuesto ());
        System.out.println("FECHA DE NACIMIENTO: " + getFecha_nacimiento());
    }
        catch (Exception ex){
            System.out.println("Error: " + ex);
        }
        
        
    }


 
    
    
    
}
