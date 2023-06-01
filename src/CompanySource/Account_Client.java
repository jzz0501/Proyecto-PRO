package CompanySource;

public class Account_Client {

    private String username;
    private String password;
    private Client client;

    /**
     * Constructor sin parametro de Account_Client
     */
    public Account_Client() {
    }

    /**
     * Constructor con parametro de Account_Client
     * @param username username que va a poner
     * @param password password que va a poner
     * @param client referencia de objeto cliente que va a poner
     */
    public Account_Client(String username, String password, Client client) {
        this.username = username;
        this.password = password;
        this.client = client;
    }

    /**
     * Metodo para obtener username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo para poner el valor de username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Metodo para obtener password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo para poner el valor de password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo para obtener el referencia de objeto cliente
     * @return referencia de objeto cliente
     */
    public Client getClient() {
        return client;
    }

    /**
     * Metodo para poner una referencia de objeto cliente
     * @param client referencia de objeto cliente que va a poner
     */
    public void setClient(Client client) {
        this.client = client;
    }
}
