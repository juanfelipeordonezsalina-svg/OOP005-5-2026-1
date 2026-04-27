
package practicagui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class AplicacionNotasGUI extends JFrame {
    private static final Color COLOR_FONDO= new Color(245,248,252);
    private static final Color COLOR_TITULO= new Color(20,70,140);
    private static final Color COLOR_BOTON_AZUL= new Color(30,100,180);
    private static final Color COLOR_BOTON_VERDE= new Color(40,140,90);
    private static final Color COLOR_BOTON_ROJO= new Color(180,60,60);
    private static final Color COLOR_BOTON_GRIS= new Color(90,100,110);





    public AplicacionNotasGUI(){
        configurarVentana();
    }
    private void configurarVentana(){
        setTitle("Registro de estudiantes");
        setSize(1100, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
        new AplicacionNotasGUI().setVisible(true);
    });
    }
    
}
