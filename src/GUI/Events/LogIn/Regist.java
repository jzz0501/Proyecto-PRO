package GUI.Events.LogIn;

import Database.Account_Manager;
import Interface.Windows.Window_Register;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class Regist extends MouseAdapter {

    private final Window_Register window;

    public Regist(Window_Register window) {
        this.window = window;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String username = window.getUSERNAME().getText();
        String password = window.getPASSWORD().getText();
        String name = window.getNAME().getText();
        String dni = window.getDNI().getText();
        String telefono = window.getTELEFONO().getText();
        String fecha_nac = window.getFECHA_NAC().getText();
        String address = window.getADDRESS().getText();
        String gmail = window.getGMAIL().getText();
        try {
            boolean successful = new Account_Manager().regist(username,password,name,dni,telefono,fecha_nac,address,gmail);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
