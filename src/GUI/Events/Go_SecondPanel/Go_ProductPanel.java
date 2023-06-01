package GUI.Events.Go_SecondPanel;

import Interface.SecondPanels.Panel_ProductAdmin;
import Interface.Windows.Window_Admin;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class Go_ProductPanel extends MouseAdapter {

    private final Window_Admin windowAdmin;

    public Go_ProductPanel(Window_Admin windowAdmin) {
        this.windowAdmin = windowAdmin;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            this.windowAdmin.setCurrent_Panel(new Panel_ProductAdmin());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
