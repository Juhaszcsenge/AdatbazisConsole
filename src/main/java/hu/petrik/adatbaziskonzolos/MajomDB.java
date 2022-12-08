package hu.petrik.adatbaziskonzolos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajomDB {
     private Connection conn;


    public static String DB_DRIVER = "mysql";
    public static String DB_HOST = "localhost";
    public static String DB_PORT = "3306";
    public static String DB_DBNAME = "java";

    public static String DB_USERNAME = "root";
    public static String DB_PASSWORD = "";

     public  MajomDB() throws SQLException {
         String url = String.format("jdbc:%s://%s:%s/%s", DB_DRIVER,DB_HOST,DB_PORT,DB_DBNAME);
         conn = DriverManager.getConnection(url,DB_USERNAME,DB_PASSWORD);
     }

     public List<Majom> majmokListazasa() throws SQLException {
         List<Majom> majmok = new ArrayList<>();
         String sql = "SELECT * FROM  majmok";
         Statement stmt = conn.createStatement();
         ResultSet result = stmt.executeQuery(sql);
         while (result.next()){
             int id = result.getInt("id");
             String fajta = result.getString("fajta");
             int max_iq = result.getInt("max_iq");
             boolean szereti_banant = result.getBoolean("szereti_banant");
             Majom majom = new Majom(id,fajta,max_iq,szereti_banant);
             majmok.add(majom);
         }

         return majmok;

     }

    private static void majomHozzaadasa(){
         ResultSet result = stmt.executeQuery(sql);
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a majom fajtáját");
        String fajtaja = sc.nextLine();
        System.out.println("Adja meg a majom maximális iq szintjét");
        int max_iq = Integer.parseInt((sc.nextLine()));
        System.out.println("Adja meg, hogy szereti-e a a banánt(i/n)");
        boolean szereti_banant = result.getBoolean("szereti_banant");
        Majom majom = new Majom(id,fajta,max_iq,szereti_banant);
        majmok.add(majom);
    }
    return majmok;
}
