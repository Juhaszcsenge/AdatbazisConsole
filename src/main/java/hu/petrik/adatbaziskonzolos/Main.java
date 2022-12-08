package hu.petrik.adatbaziskonzolos;

import jdk.internal.misc.Unsafe;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static MajomDB db;
    public  static void main(String[] args){
        try{
            db = new MajomDB();
            majmokListazasa();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }








    public static void majmokListazasa() throws  SQLException{
        List<Majom> majmok = db.majmokListazasa();
        majmok.forEach(System.out::println);

    }
}
