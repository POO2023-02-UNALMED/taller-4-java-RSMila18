package classroom;

public class Persona {

    public long cedula;
    public String nombre;
    public static int totalPersonas;
    public static long countID;

    static {
        totalPersonas = 0;
        countID = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
        countID++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
        countID++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
        countID++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 0;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }
    
    public void setCedula(long id) {
    	this.cedula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
