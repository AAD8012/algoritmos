
import data.*;

import org.json.JSONArray;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        arbol arbol=new arbol();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        System.out.println("inorden");
       arbol.dispararInorden();
        System.out.println("");
        System.out.println("postorden");
        arbol.dispararPostorden();
        System.out.println("");
        System.out.println("preorden");
        arbol.dispararPreorden();
//        conexion conexiondb = new conexion();
//        conexiondb.conexion(5
//        );
//        try {
//            URL url = new URL("http://localhost:9095/rest/users/all");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//            int responseCode = conn.getResponseCode();
//            if (responseCode != 200) {
//                throw new RuntimeException("Ocurrio un error " + responseCode);
//
//            } else {
//                StringBuilder informationString = new StringBuilder();
//                Scanner scanner = new Scanner(url.openStream());
//                while (scanner.hasNext()) {
//                    informationString.append(scanner.nextLine());
//                }
//                scanner.close();
//                System.out.println(informationString);
//
//                JSONArray jsonArray = new JSONArray(informationString.toString());
//
//                jsonArray.forEach(System.out::println);
////                System.out.println(jsonArray.getJSONObject(0).getString("mail"));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}


















































































































































































































