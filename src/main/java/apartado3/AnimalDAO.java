package apartado3;

import java.sql.*;
import java.util.ArrayList;

public class AnimalDAO {
    // conexion
    public static Connection conexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganaderia990", "root", "Tarde2022");
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
        return con;
    }

    // existe
    public static boolean existe(int crotal) {
        Connection con = conexion();
        Boolean rBoolean = false;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT crotal FROM Animal WHERE crotal = ?;");
            ps.setInt(1, crotal);
            ResultSet rs = ps.executeQuery();
            rBoolean = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rBoolean;
    }

    // create
    public static void create(Animal animal) {
        Connection con = conexion();
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Animal VALUES (?, ?, ?);");
            ps.setInt(1, animal.getCrotal());
            ps.setInt(2, animal.getEdad());
            ps.setInt(3, animal.getProduccion());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // read
    public static Animal read(int crotal) {
        Connection con = conexion();
        Animal animal = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Animal WHERE crotal = ?;");
            ps.setInt(1, crotal);
            ResultSet rs = ps.executeQuery();
            rs.next();
            animal = new Animal(rs.getInt("crotal"), rs.getInt("edad"), rs.getInt("produccion"));
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return animal;
    }

    // update
    public static void update(Animal animal) {
        Connection con = conexion();
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE Animales SET edad = ?, produccion = ? WHERE crotal = ?;");
            ps.setInt(1, animal.getEdad());
            ps.setInt(2, animal.getProduccion());
            ps.setInt(3, animal.getCrotal());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // delete
    public static void delete(int crotal) {
        Connection con = conexion();
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM Animal WHERE crotal = ?;");
            ps.setInt(1, crotal);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // arrayCompleto
    public static ArrayList<Animal> arrayCompleto() {
        Connection con = conexion();
        ArrayList<Animal> listAnimales = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Animal;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listAnimales.add(new Animal(rs.getInt("crotal"), rs.getInt("edad"), rs.getInt("produccion")));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listAnimales;
    }
}
