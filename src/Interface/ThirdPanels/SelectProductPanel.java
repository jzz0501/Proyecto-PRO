package Interface.ThirdPanels;

import GUI.Components.Component;
import GUI.Events.ThirdPanelEvents.SelectProduct;
import Interface.SecondPanels.Panel_ProductAdmin;

import javax.swing.*;

public class SelectProductPanel extends JPanel {

    private final JTextField COD_SELECTED = Component.getTextField(135,160,50,40);
    private final JButton CONFIRM = Component.getButton(185,160,140,40,"CONFIRM SELECT");
    private final Panel_ProductAdmin parentPanel;

    public SelectProductPanel(Panel_ProductAdmin parentPanel) {

        this.parentPanel = parentPanel;

        panelSetting();

        setEvents();

        addComponents();
    }

    private void setEvents() {
        CONFIRM.addMouseListener(new SelectProduct(this));
    }

    private void addComponents() {
        this.add(COD_SELECTED);
        this.add(CONFIRM);
    }

    private void panelSetting() {
        this.setLayout(null);
        this.setBounds(0,0,450,350);
    }

    public JTextField getCOD_SELECTED() {
        return COD_SELECTED;
    }

    public Panel_ProductAdmin getParentPanel() {
        return parentPanel;
    }
}
