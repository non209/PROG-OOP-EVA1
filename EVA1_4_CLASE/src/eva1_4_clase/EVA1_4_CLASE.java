package eva1_4_clase;

public class EVA1_4_CLASE {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.setNombre("Jorge Alejandro");
        perso1.setApellidos("Hernandez Granados");
        perso1.setEdad(18);

        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
    }

}

class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String valor) {
        apellidos = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }
}
