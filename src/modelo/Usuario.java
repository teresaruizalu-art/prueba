package modelo;


public class Usuario {
   String dni;
   String nombre;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    

    @Override
    public String toString() {
        return dni;
    }
   
   
}
