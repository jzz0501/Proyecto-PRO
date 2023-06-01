package Database;

import CompanySource.Account_Client;
import CompanySource.Client;
import CompanySource.Product;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Vector;

public class DB_Manager {

    public final Connection connection;

    public DB_Manager(Connection connection) throws SQLException {
        this.connection = connection;
    }

    public Vector<Vector<String>> getProductData() throws SQLException {

        Vector<Vector<String>> data = new Vector<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select*from Product");

        while (resultSet.next()) {
            Vector<String> row = new Vector<>();
            row.addElement(resultSet.getString("cod_product"));
            row.addElement(resultSet.getString("modelo"));
            row.addElement(resultSet.getString("name"));
            row.addElement(resultSet.getString("description"));
            row.addElement(resultSet.getString("precio"));
            row.addElement(resultSet.getString("period_warrantly"));
            data.addElement(row);
        }
        return data;
    }

    public Vector<Vector<String>> getClientData() throws SQLException {

        Vector<Vector<String>> data = new Vector<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select*from Client");

        while (resultSet.next()) {
            Vector<String> row = new Vector<>();
            row.addElement(resultSet.getString("id_client"));
            row.addElement(resultSet.getString("name"));
            row.addElement(resultSet.getString("dni"));
            row.addElement(resultSet.getString("telefono"));
            row.addElement(resultSet.getString("fecha_nac"));
            row.addElement(resultSet.getString("address"));
            row.addElement(resultSet.getString("gmail"));
            data.addElement(row);
        }
        return data;
    }

    public Vector<Vector<String>> getClientAccData() throws SQLException {

        Vector<Vector<String>> data = new Vector<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select*from Account_Client");

        while (resultSet.next()) {
            Vector<String> row = new Vector<>();
            row.addElement(resultSet.getString("username"));
            row.addElement(resultSet.getString("password"));
            row.addElement(resultSet.getString("id_client"));
            data.addElement(row);
        }
        return data;
    }

    public boolean insertProduct(String cod_product, String model, String name, String description, String precio, String period_warrantly) throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.executeUpdate("insert into Product values ('" + cod_product + "','" + model + "','" + name + "','" + description + "','" + precio + "','" + period_warrantly + "')");
        statement.close();
        return true;
    }

    public boolean insertClient(String id_client, String name, String dni, String telefono, String fecha_nac, String address, String gmail) throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.executeUpdate("insert into Client values ('" + id_client + "','" + name + "','" + dni + "','" + telefono + "','" + fecha_nac + "','" + address + "','" + gmail + "')");
        statement.close();
        return true;
    }

    public boolean insertAccClient(String username, String password, String id_client) throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.executeUpdate("insert into Account_Client values ('" + username + "','" + password + "','" + id_client + "')");
        statement.close();
        return true;
    }

    public boolean updateProduct(String cod_product, String model, String name, String description, String precio, String period_warrantly, String cod_selected) throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.executeUpdate("update Product set cod_product = " + cod_product + ',' +
                                                        "modelo = " + model + ',' +
                                                        "name = " + name + ',' +
                                                        "description = " + description + ',' +
                                                        "precio = " + precio + ',' +
                                                        "period_warrantly = " + period_warrantly +
                                                        "where cod_product = " + cod_selected
        );
        statement.close();
        return true;
    }

    public boolean deleteProduct(String cod_product) throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.executeUpdate("delete from Product where cod_product = " + cod_product);
        statement.close();
        return true;
    }

    public ArrayList<Product> selectProduct(String name_selected) throws SQLException {
        ArrayList<Product> products = new ArrayList<>();
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select*from Product where name = " + name_selected);
        while(resultSet.next()) {
            int cod_product = Integer.parseInt(resultSet.getString("cod_product"));
            String model = resultSet.getString("model");
            String name = resultSet.getString("name");
            String description = resultSet.getString("description");
            float precio = Float.parseFloat(resultSet.getString("precio"));
            int period_warrantly = Integer.parseInt(resultSet.getString("period_warrantly"));

            products.add(new Product(cod_product,model,name,description,precio,period_warrantly));
        }
        statement.close();
        return products;
    }

    public String getNextIdClient() throws SQLException {
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(c.id_client) as id from Client c");
        resultSet.next();
        if (resultSet.getString("id") != null){
            int nextId = Integer.parseInt(resultSet.getString("id")) + 1;
            return String.valueOf(nextId);
        } else {
            return "1";
        }
    }

    public ArrayList<Account_Client> getAccounts() throws SQLException {

        ArrayList<Account_Client> accounts = new ArrayList<>();
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select*from Account_Client");
        while(resultSet.next()) {

            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            int id_client = Integer.parseInt(resultSet.getString("id_client"));

            Statement statement2 = this.connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery("select*from Client where id_client = " + id_client);
            resultSet2.next();
            String name = resultSet2.getString("name");
            String dni = resultSet2.getString("dni");
            int telefono = Integer.parseInt(resultSet2.getString("telefono"));
            String fecha_nac = resultSet2.getString("fecha_nac");
            String address = resultSet2.getString("address");
            String gmail = resultSet2.getString("gmail");

            Client client = new Client(id_client,name,dni,telefono,fecha_nac,address,gmail);
            accounts.add(new Account_Client(username,password,client));
        }
        return accounts;
    }

    public void close() throws SQLException {
        this.connection.close();
    }
}
