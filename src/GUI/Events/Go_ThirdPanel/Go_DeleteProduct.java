package GUI.Events.Go_ThirdPanel;

import Interface.SecondPanels.Panel_ProductAdmin;
import Interface.ThirdPanels.DeleteProductPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Go_DeleteProduct extends MouseAdapter {

    private final Panel_ProductAdmin panel;

    public Go_DeleteProduct(Panel_ProductAdmin panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.panel.setCURRENT_PANEL(new DeleteProductPanel(this.panel));
    }
}
