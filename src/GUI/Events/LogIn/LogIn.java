package GUI.Events.LogIn;

import CompanySource.Account_Client;
import Database.Account_Manager;
import Interface.Windows.Window_Client;
import Interface.Windows.Window_LogIn;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class LogIn extends MouseAdapter {

    private final Window_LogIn window;
    public LogIn(Window_LogIn window) {
        this.window = window;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String username = this.window.getUSERNAME().getText();
        String password = this.window.getPASSWORD().getText();
        try {
            Account_Client acc = new Account_Manager().verify(username,password);
            if (acc != null) {
                this.window.dispose();
                new Window_Client();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
