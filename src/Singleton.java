public class Singleton {
    private static String nombre;
    private static Integer edad;

    static Singleton dato=new Singleton(nombre, edad);

    private Singleton() {
    }

    private Singleton(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int i) {
        this.edad = edad;
    }
    public static Singleton getInstance(){
        return dato;
    }
}
