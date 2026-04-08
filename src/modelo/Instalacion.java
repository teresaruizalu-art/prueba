package modelo;


public class Instalacion {
    String codInstalacion;
    String nombre;
    String poblacion;
    String provincia;
    int precio;
    String telefono;
    String detalles;

    public Instalacion(String codInstalacion, String nombre, String poblacion, String procincia, int precio, String telefono, String detalles) {
        this.codInstalacion = codInstalacion;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.provincia = procincia;
        this.precio = precio;
        this.telefono = telefono;
        this.detalles = detalles;
    }

    public String getCodInstalacion() {
        return codInstalacion;
    }

  

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDetalles() {
        return detalles;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
