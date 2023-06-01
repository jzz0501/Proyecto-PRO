package GUI.Events.ThirdPanelEvents;

import Database.ProyectoConnection;
import Database.DB_Manager;
import Interface.ThirdPanels.DeleteProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class DeleteProduct extends MouseAdapter {

    private final DeleteProductPanel panel;
    public DeleteProduct(DeleteProductPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String cod = this.panel.getCOD_SELECTED().getText();
        try {
            new DB_Manager(ProyectoConnection.getConnection()).deleteProduct(cod);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public DeleteProductPanel getPanel() {
        return panel;
    }
}
