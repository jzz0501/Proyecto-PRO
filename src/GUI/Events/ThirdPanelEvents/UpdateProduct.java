package GUI.Events.ThirdPanelEvents;

import Database.ProyectoConnection;
import Database.DB_Manager;
import Interface.ThirdPanels.UpdateProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class UpdateProduct extends MouseAdapter {

    private final UpdateProductPanel panel;
    public UpdateProduct(UpdateProductPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String cod_selected = panel.getCOD_SELECTED().getText();
        String cod_product = panel.getCOD_PRODUCT().getText();
        String model = panel.getMODEL().getText();
        String name = panel.getNAME().getText();
        String description = panel.getDESCRIPTION().getText();
        String precio = panel.getPRECIO().getText();
        String period_warrantly = panel.getPERIOD_WARRANTLY().getText();
        try {
            boolean successful = new DB_Manager(ProyectoConnection.getConnection()).updateProduct(cod_selected,cod_product,model,name,description,precio,period_warrantly);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public UpdateProductPanel getPanel() {
        return panel;
    }
}
