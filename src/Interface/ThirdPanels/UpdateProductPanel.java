package Interface.ThirdPanels;

import GUI.Components.Component;
import GUI.Events.ThirdPanelEvents.UpdateProduct;
import Interface.SecondPanels.Panel_ProductAdmin;

import javax.swing.*;

public class UpdateProductPanel extends JPanel {

    private final JButton CONFIRM = Component.getButton(125,210,140,40,"CONFIRM UPDATE");
    private final JTextField COD_SELECTED = Component.getTextField(75,20,40,20);
    private final JTextField COD_PRODUCT = Component.getTextField(75,60,40,20);
    private final JTextField MODEL = Component.getTextField(225,60,100,20);
    private final JTextField NAME = Component.getTextField(75,100,100,20);
    private final JTextField DESCRIPTION = Component.getTextField(225,100,100,20);
    private final JTextField PRECIO = Component.getTextField(225,140,100,20);
    private final JTextField PERIOD_WARRANTLY = Component.getTextField(75,140,100,20);
    private final Panel_ProductAdmin parentPanel;
    public UpdateProductPanel(Panel_ProductAdmin parentPanel) {

        this.parentPanel = parentPanel;

        panelSetting(parentPanel);

        setEvents();

        addComponents();
    }

    private void setEvents() {
        CONFIRM.addMouseListener(new UpdateProduct(this));
    }

    private void panelSetting(Panel_ProductAdmin parentPanel) {
        this.setLayout(null);
        this.setBounds(0,0,450,350);
    }

    private void addComponents() {
        this.add(CONFIRM);
        this.add(COD_PRODUCT);
        this.add(MODEL);
        this.add(NAME);
        this.add(PRECIO);
        this.add(PERIOD_WARRANTLY);
        this.add(DESCRIPTION);
        this.add(COD_SELECTED);
    }

    public JTextField getCOD_SELECTED() {
        return COD_SELECTED;
    }

    public JTextField getCOD_PRODUCT() {
        return COD_PRODUCT;
    }

    public JTextField getMODEL() {
        return MODEL;
    }

    public JTextField getNAME() {
        return NAME;
    }

    public JTextField getPRECIO() {
        return PRECIO;
    }

    public JTextField getPERIOD_WARRANTLY() {
        return PERIOD_WARRANTLY;
    }

    public JTextField getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Panel_ProductAdmin getParentPanel() {
        return parentPanel;
    }
}
