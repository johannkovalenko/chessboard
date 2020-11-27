import javax.swing.*;
import view.MainForm;        

public class app {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                new MainForm();
            }
        };
        
        SwingUtilities.invokeLater(runnable);
    }
}