package Database;

import CompanySource.Account_Client;

import java.sql.SQLException;
import java.util.ArrayList;

public class Account_Manager {

    private final ArrayList<Account_Client> accounts;

    public Account_Manager() throws SQLException {
        this.accounts = new DB_Manager(ProyectoConnection.getConnection()).getAccounts();
    }

    public Account_Client verify(String username, String password) {
        for (Account_Client acc:accounts) {
            if(acc.getUsername().equals(username)&&acc.getPassword().equals(password)) {
                return acc;
            }
        }
        return null;
    }

    public boolean regist(String username, String password, String name, String dni, String telefono, String fecha_nac, String address, String gmail) throws SQLException {
        DB_Manager dbManager = new DB_Manager(ProyectoConnection.getConnection());
        String id_client = dbManager.getNextIdClient();
        dbManager.insertClient(id_client,name,dni,telefono,fecha_nac,address,gmail);
        dbManager.insertAccClient(username,password,id_client);
        return true;
    }
}
