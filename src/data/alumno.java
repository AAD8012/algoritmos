package data;

public class alumno {
    int numero_de_cuenta;
    String nombre;
    String mail;
    double calificaciones;

    public alumno() {
    }

    public alumno(int numero_de_cuenta, String nombre, String mail, double calificaciones) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.nombre = nombre;
        this.mail = mail;
        this.calificaciones = calificaciones;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
}
