package Interface.SecondPanels;

import Database.ProyectoConnection;
import Database.DB_Manager;
import GUI.Components.Component;
import GUI.Events.Go_ThirdPanel.Go_DeleteProduct;
import GUI.Events.Go_ThirdPanel.Go_InsertProduct;
import GUI.Events.Go_ThirdPanel.Go_SelectProduct;
import GUI.Events.Go_ThirdPanel.Go_UpdateProduct;
import GUI.Events.SelectRow.SelectProductRow;
import Interface.ThirdPanels.InsertProductPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Vector;

public class Panel_ProductAdmin extends JPanel {

    private final JButton BUTTON_INSERT = Component.getButton(530,350,120,40,"insert product");
    private final JButton BUTTON_UPDATE = Component.getButton(650,350,120,40,"update product");
    private final JButton BUTTON_DELETE = Component.getButton(530,390,120,40,"delete product");
    private final JButton BUTTON_SELECT = Component.getButton(650,390,120,40,"select product");
    private final DefaultTableModel TABLE_MODEL = new DefaultTableModel();
    private final JTable TABLE = new JTable(TABLE_MODEL);
    private final JScrollPane SCROLL_PANE = new JScrollPane(TABLE);
    private JPanel CURRENT_PANEL;

    public Panel_ProductAdmin() throws SQLException {

        panelSetting();

        setEvents();

        addComponents();

        setTableData();
    }

    private void setEvents() {
        TABLE.addMouseListener(new SelectProductRow(this));
        BUTTON_DELETE.addMouseListener(new Go_DeleteProduct(this));
        BUTTON_INSERT.addMouseListener(new Go_InsertProduct(this));
        BUTTON_SELECT.addMouseListener(new Go_SelectProduct(this));
        BUTTON_UPDATE.addMouseListener(new Go_UpdateProduct(this));
    }

    private void addComponents() {
        this.add(BUTTON_INSERT);
        this.add(BUTTON_UPDATE);
        this.add(BUTTON_DELETE);
        this.add(BUTTON_SELECT);
        this.add(SCROLL_PANE);
        this.add(CURRENT_PANEL);
    }

    private void panelSetting() {
        this.setLayout(null);
        this.setBounds(0,160,900,540);
        this.CURRENT_PANEL = new InsertProductPanel(this);
        SCROLL_PANE.setBounds(430,0,400,300);
    }

    private void setTableData() throws SQLException {

        Vector<String> column = new Vector<>();
        column.addElement("cod_product");
        column.addElement("model");
        column.addElement("name");
        column.addElement("description");
        column.addElement("precio");
        column.addElement("pedio_warrantly");

        TABLE_MODEL.setDataVector(new DB_Manager(ProyectoConnection.getConnection()).getProductData(),column);
    }

    public DefaultTableModel getTABLE_MODEL() {
        return TABLE_MODEL;
    }

    public JTable getTABLE() {
        return TABLE;
    }

    public JScrollPane getSCROLL_PANE() {
        return SCROLL_PANE;
    }

    public JPanel getCURRENT_PANEL() {
        return CURRENT_PANEL;
    }

    public void setCURRENT_PANEL(JPanel newPanel) {
        this.remove(this.CURRENT_PANEL);
        this.CURRENT_PANEL = newPanel;
        this.add(newPanel);
        this.setVisible(false);
        this.setVisible(true);
    }
}
