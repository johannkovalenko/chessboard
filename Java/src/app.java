import javax.swing.*;
import view.*;

public class app {

    public static void main(String[] args) {

        Runnable form = new Form();
        form.run();        
        //SwingUtilities.invokeLater(form);
    }
}