package GUI.Events.LogIn;

import Interface.Windows.Window_LogIn;
import Interface.Windows.Window_Register;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Go_LogIn extends MouseAdapter {

    private final Window_Register window;

    public Go_LogIn(Window_Register window) {
        this.window = window;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        new Window_LogIn();
        this.window.dispose();
    }
}
