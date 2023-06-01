package GUI.Events.SelectRow;

import Interface.SecondPanels.Panel_ProductAdmin;
import Interface.ThirdPanels.DeleteProductPanel;
import Interface.ThirdPanels.InsertProductPanel;
import Interface.ThirdPanels.SelectProductPanel;
import Interface.ThirdPanels.UpdateProductPanel;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SelectProductRow extends MouseAdapter {

    private final Panel_ProductAdmin panel;

    public SelectProductRow(Panel_ProductAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        DefaultTableModel model = (DefaultTableModel) this.panel.getTABLE().getModel();
        int selectedRow = this.panel.getTABLE().getSelectedRow();

        if (this.panel.getCURRENT_PANEL() instanceof InsertProductPanel insertProductPanel) {
            insertProductPanel.getCOD_PRODUCT().setText(model.getValueAt(selectedRow,0).toString());
            insertProductPanel.getMODEL().setText(model.getValueAt(selectedRow,1).toString());
            insertProductPanel.getNAME().setText(model.getValueAt(selectedRow,2).toString());
            insertProductPanel.getPRECIO().setText(model.getValueAt(selectedRow,3).toString());
            insertProductPanel.getPERIOD_WARRANTLY().setText(model.getValueAt(selectedRow,4).toString());
            insertProductPanel.getDESCRIPTION().setText(model.getValueAt(selectedRow,5).toString());
        } else if (this.panel.getCURRENT_PANEL() instanceof UpdateProductPanel updateProductPanel) {
            updateProductPanel.getCOD_SELECTED().setText(model.getValueAt(selectedRow,0).toString());
            updateProductPanel.getCOD_PRODUCT().setText(model.getValueAt(selectedRow,0).toString());
            updateProductPanel.getMODEL().setText(model.getValueAt(selectedRow,1).toString());
            updateProductPanel.getNAME().setText(model.getValueAt(selectedRow,2).toString());
            updateProductPanel.getPRECIO().setText(model.getValueAt(selectedRow,3).toString());
            updateProductPanel.getPERIOD_WARRANTLY().setText(model.getValueAt(selectedRow,4).toString());
            updateProductPanel.getDESCRIPTION().setText(model.getValueAt(selectedRow,5).toString());
        } else if (this.panel.getCURRENT_PANEL() instanceof DeleteProductPanel deleteProductPanel) {
            deleteProductPanel.getCOD_SELECTED().setText(model.getValueAt(selectedRow,0).toString());
        } else if (this.panel.getCURRENT_PANEL() instanceof SelectProductPanel selectProductPanel){
            selectProductPanel.getCOD_SELECTED().setText(model.getValueAt(selectedRow,0).toString());
        } else {
            throw new RuntimeException();
        }

    }
}
