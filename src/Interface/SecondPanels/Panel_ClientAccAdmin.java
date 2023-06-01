package Interface.SecondPanels;

import Database.ProyectoConnection;
import Database.DB_Manager;
import GUI.Components.Component;
import GUI.Events.SelectRow.SelectClientAccRow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Vector;

public class Panel_ClientAccAdmin extends JPanel {

    private final JTextField USERNAME_SELECTED = Component.getTextField(420,450,120,50);
    private final JButton BUTTON_SELECT = Component.getButton(540,450,150,50,"CONFIRM SELECT");
    private final DefaultTableModel TABLE_MODEL = new DefaultTableModel();
    private final JTable TABLE = new JTable(TABLE_MODEL);
    private final JScrollPane SCROLL_PANE = new JScrollPane(TABLE);
    private final JTextField USERNAME = Component.getTextField(50,160,100,20);
    private final JTextField PASSWORD = Component.getTextField(200,160,100,20);
    private final JTextField ID_CLIENT = Component.getTextField(125,250,100,20);

    public Panel_ClientAccAdmin() throws SQLException {

        panelSetting();

        setEvents();

        addComponents();

        setTable();
    }

    private void panelSetting() {
        this.setLayout(null);
        this.setBounds(20,75,860,700);
        SCROLL_PANE.setBounds(370,100,400,300);
    }

    private void addComponents() {
        this.add(USERNAME);
        this.add(PASSWORD);
        this.add(ID_CLIENT);
        this.add(SCROLL_PANE);
        this.add(BUTTON_SELECT);
        this.add(USERNAME_SELECTED);
    }

    private void setEvents() {
        this.TABLE.addMouseListener(new SelectClientAccRow(this));
    }

    private void setTable() throws SQLException {

        Vector<String> column = new Vector<>();
        column.addElement("username");
        column.addElement("password");
        column.addElement("id_cliente");

        TABLE_MODEL.setDataVector(new DB_Manager(ProyectoConnection.getConnection()).getClientAccData(),column);
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

    public JTextField getUSERNAME() {
        return USERNAME;
    }

    public JTextField getPASSWORD() {
        return PASSWORD;
    }

    public JTextField getID_CLIENT() {
        return ID_CLIENT;
    }
}
