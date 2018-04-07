package exemplogui1;
import javax.swing.*;
public class VentanaComponentes_1 {
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1, blimpar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    
    public VentanaComponentes_1(){
        marco = new JFrame(" ventana componentes");
        panel = new JPanel();
        etUsuario = new JLabel("USUARIO");
        etContrasinal = new JLabel("Contrasinal");
        boton1 = new JButton("inxire");
        blimpar = new JButton("limpa");
        jpContrasinal = new JPasswordField(4);
        jtUsuario = new JTextField(10);
        
        
        marco.setSize(600,600);
        panel.add(etUsuario);
        etUsuario.setBounds(250, 300, 300, 150);
        panel.add(jtUsuario);
        jtUsuario.setBounds(50,100,100,50);
        panel.add(etContrasinal);
        etContrasinal.setBounds(100, 50, 50, 100);
        panel.add(jpContrasinal);
        panel.add(boton1);
        panel.add(blimpar);
        marco.add(panel);
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
//        marco.pack();
        marco.setLayout(null);
       
        
    }
}
