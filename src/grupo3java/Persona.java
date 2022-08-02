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
       public Persona (String nom, int ed, String se){
        nombre = nom;
        edad = ed;
        dni = 0;
        sexo = se;
        peso = 0.0f;
        altura = 0.0f;           
    }
    
          public Persona (String nom, int ed, int dn, String se, float pe, float alt){
        nombre = nom;
        edad = ed;
        dni = dn;
        sexo = se;
        peso = pe;
        altura = alt;           
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
    
}
