package Ejercicio6_credencialesUsuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("tiziano", "tiziano@mail.com", "clave123");

        System.out.println("Login con clave123: " + (usuario.validarCredenciales("clave123") ? "ACCESO" : "DENEGADO"));
        System.out.println("Login con otra: " + (usuario.validarCredenciales("otra") ? "ACCESO" : "DENEGADO"));

        System.out.println("Cambio con clave actual incorrecta: " + (usuario.cambiarPassword("mala", "nueva456") ? "OK" : "RECHAZADO"));
        System.out.println("Cambio con clave nueva muy corta: " + (usuario.cambiarPassword("clave123", "abc") ? "OK" : "RECHAZADO"));
        System.out.println("Cambio correcto: " + (usuario.cambiarPassword("clave123", "nueva456") ? "OK" : "RECHAZADO"));

        System.out.println("Login con la clave vieja: " + (usuario.validarCredenciales("clave123") ? "ACCESO" : "DENEGADO"));
        System.out.println("Login con la clave nueva: " + (usuario.validarCredenciales("nueva456") ? "ACCESO" : "DENEGADO"));
    }
}
