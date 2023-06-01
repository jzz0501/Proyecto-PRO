package GUI.Events.ThirdPanelEvents;

import Database.ProyectoConnection;
import Database.DB_Manager;
import Interface.ThirdPanels.SelectProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class SelectProduct extends MouseAdapter {

    private final SelectProductPanel panel;
    public SelectProduct(SelectProductPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String name_selected = this.panel.getCOD_SELECTED().getText();
        try {
            new DB_Manager(ProyectoConnection.getConnection()).selectProduct(name_selected);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public SelectProductPanel getPanel() {
        return panel;
    }
}
