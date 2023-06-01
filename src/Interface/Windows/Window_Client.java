package Interface.Windows;

import Database.ProyectoConnection;
import Database.DB_Manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Vector;

public class Window_Client extends JFrame {

    private final DefaultTableModel TABLE_MODEL = new DefaultTableModel();
    private final JTable TABLE = new JTable(TABLE_MODEL);
    private final JScrollPane SCROLL_PANE = new JScrollPane(TABLE);

    public Window_Client() throws SQLException {

        frameSetting();

        setMenu();

        setTableData();

        this.getContentPane().add(SCROLL_PANE);

        this.setVisible(true);
    }

    private void frameSetting() {
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Client");
        this.SCROLL_PANE.setBounds(80,100,440,290);
    }

    private void setMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu option = new JMenu("Option");

        JMenuItem exit = new JMenuItem("EXIT");
        JMenuItem logout = new JMenuItem("LOG OUT");

        exit.addActionListener(e -> System.exit(0));
        logout.addActionListener(e -> { new Window_LogIn(); Window_Client.this.dispose(); });

        option.add(exit);
        option.add(logout);

        menuBar.add(option);

        this.setJMenuBar(menuBar);
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
}
