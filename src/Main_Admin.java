import Interface.Windows.Window_Admin;

import java.sql.SQLException;

public class Main_Admin {

    /**
     * Entrada de programa de administrador
     * @param args
     * @throws SQLException El constructor de Window_Admin() esta lanzado SQLException, el llamador tiene que lanzar excepcion en despues de nombre de metodo
     */
    public static void main(String[] args) throws SQLException {
        new Window_Admin();
    }
}