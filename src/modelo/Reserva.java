package modelo;


public class Reserva {
    String dni;
    String telefono;
    String fecha;
    String codigo;

    public Reserva(String dni, String telefono, String fecha, String codigo) {
        this.dni = dni;
        this.telefono = telefono;
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return dni;
    }
    
}
