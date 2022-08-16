/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo3java;

/**
 *
 * @author Ath
 */
public class Persona {
    private String SEXO="hombre";
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;
    private float peso;
    private float altura;

    public Persona (){
        nombre = "";
        edad = 0;
        dni = 0;
        sexo = SEXO;
        peso = 0.0f;
        altura = 0.0f;           
    }
    
    public void setNombre (String nomb){
        nombre = nomb;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public void setEdad (int eda){
        edad = eda;
    }
    
    public int getEdad (){
        return edad;
    }
    
     public void setDni (int dn){
        edad = dn;
    }
    
    public int getDni (){
        return dni;
    }
    
    public void setSexo (String sex){
        sexo = sex;
    }
    
    public String getSexo (){
        return sexo;
    }
    
    public void setPeso (float pes){
        peso = pes;
    }
    
    public float getPeso (){
        return peso;
    }
    
        public void setAltura (float alt){
        altura = alt;
    }
    
    public float getAltura (){
        return altura;
    }
    public int calcularIMC(){
        double imc = peso/altura*altura;
        if (imc<20){
            return -1;
        } 
        else{
            if (imc<25){
                return 0;
            }
            else{
                return 1;
            }
        }
    }
    
    public boolean esMayorDeEdad(){
        if (edad<18){
            return false;
        }
        else{
            return true;
        }
    }
    
    public char comprobarSexo(char sexo){
        if (sexo!='H'||sexo!='M'){
            sexo='H';
        }
    return sexo;
    }
}
