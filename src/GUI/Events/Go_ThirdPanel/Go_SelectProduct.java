package GUI.Events.Go_ThirdPanel;

import Interface.SecondPanels.Panel_ProductAdmin;
import Interface.ThirdPanels.SelectProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Go_SelectProduct extends MouseAdapter {

    private Panel_ProductAdmin panel;
    public Go_SelectProduct(Panel_ProductAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.panel.setCURRENT_PANEL(new SelectProductPanel(this.panel));
    }
}
