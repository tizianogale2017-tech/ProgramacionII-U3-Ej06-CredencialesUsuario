package Ejercicio6_credencialesUsuario;

public class Usuario {
    private String nombreUsuario;
    private String email;
    private String password;

    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public boolean validarCredenciales(String passwordIngresada) {
        return password.equals(passwordIngresada);
    }

    public boolean cambiarPassword(String passwordActual, String nuevaPassword) {
        if (!validarCredenciales(passwordActual)) {
            return false;
        }
        if (nuevaPassword.length() < 6 || nuevaPassword.equals(passwordActual)) {
            return false;
        }
        password = nuevaPassword;
        return true;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }
}
