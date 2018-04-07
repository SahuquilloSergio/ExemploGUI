package exemplogui1;
import javax.swing.*;
public class VentanaComponentes {
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1, blimpar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    
    public VentanaComponentes(){
        marco = new JFrame(" ventana componentes");
        panel = new JPanel();
        etUsuario = new JLabel("Usuario");
        etContrasinal = new JLabel("Contrasinal");
        boton1 = new JButton("inxire");
        blimpar = new JButton("limpa");
        jpContrasinal = new JPasswordField(4);
        jtUsuario = new JTextField(10);
        
        
        marco.setSize(600,600);
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jpContrasinal);
        panel.add(boton1);
        panel.add(blimpar);
        marco.add(panel);
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.pack();
    }
}
