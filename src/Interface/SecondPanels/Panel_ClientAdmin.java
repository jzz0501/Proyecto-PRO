package Interface.SecondPanels;

import Database.ProyectoConnection;
import Database.DB_Manager;
import GUI.Components.Component;
import GUI.Events.SelectRow.SelectClientRow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Vector;

public class Panel_ClientAdmin extends JPanel {

    private final JTextField DNI_SELECTED = Component.getTextField(420,450,120,50);
    private final JButton BUTTON_SELECT = Component.getButton(540,450,150,50,"CONFIRM SELECT");
    private final DefaultTableModel TABLE_MODEL = new DefaultTableModel();
    private final JTable TABLE = new JTable(TABLE_MODEL);
    private final JScrollPane SCROLL_PANE = new JScrollPane(TABLE);
    private final JTextField ID_CLIENT = Component.getTextField(125,160,100,20);
    private final JTextField NAME = Component.getTextField(50,210,100,20);
    private final JTextField DNI = Component.getTextField(200,210,100,20);
    private final JTextField TELEFONO = Component.getTextField(50,260,100,20);
    private final JTextField FECHA_NAC = Component.getTextField(200,260,100,20);
    private final JTextField GMAIL = Component.getTextField(125,310,100,20);
    private final JTextField ADDRESS = Component.getTextField(125,360,100,20);

    public Panel_ClientAdmin() throws SQLException {

        panelSetting();

        setEvents();

        addComponents();

        setTable();
    }

    private void setEvents() {
        this.TABLE.addMouseListener(new SelectClientRow(this));
    }

    private void panelSetting() {
        this.setLayout(null);
        this.setBounds(20,75,860,700);
        SCROLL_PANE.setBounds(370,100,400,300);
    }

    private void addComponents() {
        this.add(ID_CLIENT);
        this.add(NAME);
        this.add(DNI);
        this.add(TELEFONO);
        this.add(FECHA_NAC);
        this.add(GMAIL);
        this.add(ADDRESS);
        this.add(SCROLL_PANE);
        this.add(BUTTON_SELECT);
        this.add(DNI_SELECTED);
    }

    private void setTable() throws SQLException {

        Vector<String> column = new Vector<>();
        column.addElement("id_client");
        column.addElement("name");
        column.addElement("dni");
        column.addElement("telefono");
        column.addElement("fecha_nac");
        column.addElement("address");
        column.addElement("gmail");

        TABLE_MODEL.setDataVector(new DB_Manager(ProyectoConnection.getConnection()).getClientData(),column);
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

    public JTextField getID_CLIENT() {
        return ID_CLIENT;
    }

    public JTextField getNAME() {
        return NAME;
    }

    public JTextField getDNI() {
        return DNI;
    }

    public JTextField getTELEFONO() {
        return TELEFONO;
    }

    public JTextField getFECHA_NAC() {
        return FECHA_NAC;
    }

    public JTextField getGMAIL() {
        return GMAIL;
    }

    public JTextField getADDRESS() {
        return ADDRESS;
    }
}
