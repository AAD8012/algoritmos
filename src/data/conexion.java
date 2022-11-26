package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    public void conexion(int numero_de_registros) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/proyecto_algoritmos", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
            String query1 = "TRUNCATE TABLE alumnos";
            stmt.executeUpdate(query1);
            System.out.println("se insertaran " + numero_de_registros + " registros");
            System.out.println("Inicio de la insercion de datos");

            for (int i = 1; i <= numero_de_registros; i++) {
                String query = "INSERT INTO alumnos(numero_de_cuenta,nombre,mail,calificaciones) VALUES('" + i + "','prueba " + i + "','prueba" + i + "@gmail.com','" + i + "')";
                stmt.executeUpdate(query);
            }
            System.out.println("Finalizacion de la insercion de datos");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}