
package javaapplicationtuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class VD42 {
    public static void main(String[] args) {
        try {
            // Tao doi tuong lay dia chi
            URL url = new URL("https://www.google.com");

            // Mo ket noi
            URLConnection uRLConnection = url.openConnection();

            // Doc du lieu ket noi
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(uRLConnection.getInputStream()));

            // Doc tung dong
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close(); // Dong luong
        } catch (Exception e) {
          
        }
    }
}
