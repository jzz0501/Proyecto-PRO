import Database.ProyectoConnection;
import Database.DB_Manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Main_DefaultData {

    public static void main(String[] args) throws SQLException, IOException {

        DB_Manager dbManager = new DB_Manager(ProyectoConnection.getConnection());
        BufferedReader br = new BufferedReader(new FileReader("File/DefaultProductData"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            dbManager.insertProduct(split[0],split[1],split[2],split[3],split[4],split[5]);
        }

        br.close();
        dbManager.close();

    }

}
