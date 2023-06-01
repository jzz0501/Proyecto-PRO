package GUI.Events.Go_SecondPanel;

import Interface.SecondPanels.Panel_ClientAccAdmin;
import Interface.Windows.Window_Admin;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class Go_ClientAccPanel extends MouseAdapter {

    private final Window_Admin windowAdmin;

    public Go_ClientAccPanel(Window_Admin windowAdmin) {
        this.windowAdmin = windowAdmin;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            this.windowAdmin.setCurrent_Panel(new Panel_ClientAccAdmin());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
