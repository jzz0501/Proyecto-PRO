package GUI.Events.SelectRow;

import Interface.SecondPanels.Panel_ClientAccAdmin;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SelectClientAccRow extends MouseAdapter {

    private final Panel_ClientAccAdmin panel;

    public SelectClientAccRow(Panel_ClientAccAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        DefaultTableModel model = (DefaultTableModel) this.panel.getTABLE().getModel();
        int selectedRow = this.panel.getTABLE().getSelectedRow();

        this.panel.getUSERNAME().setText(model.getValueAt(selectedRow,0).toString());
        this.panel.getPASSWORD().setText(model.getValueAt(selectedRow,1).toString());
        this.panel.getID_CLIENT().setText(model.getValueAt(selectedRow,2).toString());
    }
}
