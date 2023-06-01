package GUI.Events.SelectRow;

import Interface.SecondPanels.Panel_ClientAdmin;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SelectClientRow extends MouseAdapter {

    private final Panel_ClientAdmin panel;

    public SelectClientRow(Panel_ClientAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        DefaultTableModel model = (DefaultTableModel) this.panel.getTABLE().getModel();
        int selectedRow = this.panel.getTABLE().getSelectedRow();

        this.panel.getID_CLIENT().setText(model.getValueAt(selectedRow,0).toString());
        this.panel.getNAME().setText(model.getValueAt(selectedRow,1).toString());
        this.panel.getDNI().setText(model.getValueAt(selectedRow,2).toString());
        this.panel.getTELEFONO().setText(model.getValueAt(selectedRow,3).toString());
        this.panel.getFECHA_NAC().setText(model.getValueAt(selectedRow,4).toString());
        this.panel.getGMAIL().setText(model.getValueAt(selectedRow,5).toString());
        this.panel.getADDRESS().setText(model.getValueAt(selectedRow,6).toString());
    }
}
