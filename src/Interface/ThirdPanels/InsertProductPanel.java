package Interface.ThirdPanels;

import GUI.Components.Component;
import GUI.Events.ThirdPanelEvents.InsertProduct;
import Interface.SecondPanels.Panel_ProductAdmin;

import javax.swing.*;

public class InsertProductPanel extends JPanel {

    private final JButton CONFIRM = Component.getButton(125,210,140,40,"CONFIRM INSERT");
    private final JTextField COD_PRODUCT = Component.getTextField(75,50,60,20);
    private final JTextField MODEL = Component.getTextField(225,50,100,20);
    private final JTextField NAME = Component.getTextField(75,90,100,20);
    private final JTextField DESCRIPTION = Component.getTextField(225,90,100,20);
    private final JTextField PRECIO = Component.getTextField(225,130,100,20);
    private final JTextField PERIOD_WARRANTLY = Component.getTextField(75,130,100,20);
    private final Panel_ProductAdmin parentPanel;

    public InsertProductPanel(Panel_ProductAdmin parentPanel) {

        this.parentPanel = parentPanel;

        panelSetting();

        setEvents();

        addComponents();
    }

    private void panelSetting() {
        this.setLayout(null);
        this.setBounds(0,0,450,350);
    }

    private void setEvents() {
        CONFIRM.addMouseListener(new InsertProduct(this));
    }

    private void addComponents() {
        this.add(COD_PRODUCT);
        this.add(MODEL);
        this.add(NAME);
        this.add(PRECIO);
        this.add(PERIOD_WARRANTLY);
        this.add(DESCRIPTION);
        this.add(CONFIRM);
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
