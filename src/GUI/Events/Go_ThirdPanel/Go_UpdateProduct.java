package GUI.Events.Go_ThirdPanel;

import Interface.SecondPanels.Panel_ProductAdmin;
import Interface.ThirdPanels.UpdateProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Go_UpdateProduct extends MouseAdapter {

    private Panel_ProductAdmin panel;
    public Go_UpdateProduct(Panel_ProductAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.panel.setCURRENT_PANEL(new UpdateProductPanel(this.panel));
    }
}
