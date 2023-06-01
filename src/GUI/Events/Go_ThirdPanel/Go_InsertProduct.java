package GUI.Events.Go_ThirdPanel;

import Interface.SecondPanels.Panel_ProductAdmin;
import Interface.ThirdPanels.InsertProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Go_InsertProduct extends MouseAdapter {

    private final Panel_ProductAdmin panel;

    public Go_InsertProduct(Panel_ProductAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.panel.setCURRENT_PANEL(new InsertProductPanel(this.panel));
    }
}
