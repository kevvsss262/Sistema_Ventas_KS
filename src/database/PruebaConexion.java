
package database;


public class PruebaConexion {
    public static void main(String[] args) {
        conexion con = new conexion();
        con.conectar();
        if (con.cadena!= null) {
            System.out.println("Conectado");
        }else{
            System.out.println("Desconectado");
        }
    }
}
