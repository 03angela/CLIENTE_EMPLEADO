/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aguin
 */
public class Cliente extends Persona{
    private String nit;
    public Cliente (){}
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar (){
    try {
    System.out.println ("NIT: " + getNit());
    System.out.println ("NOMBRES: " + getNombres());
    System.out.println("APELLIDOS: " + getApellidos());
    System.out.println("DIRECCION: " + getDireccion ());
    System.out.println("TELEFONO: " + getTelefono ());
    System.out.println("FECHA DE NACIMIENTO: " + getFecha_nacimiento ());
    }
        catch (Exception ex){
            System.out.println("Error: " + ex);
        }
    
    }
    
   
    
}
