import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.*;

/**
 * El menu retirar vehiculo permite sacar un carro de la torre del parqueadero.
 * 
 * @author Mateo Gutierrez Gomez 201220019010
 */
public class RetirarVehiculo extends JFrame implements ActionListener{
    private RetirarVehiculo retirarVehiculo;
    private Parqueadero parqueadero;
    private JButton butRetirar;
    private JButton butCancelar;
    /**
     * Dato estatico para el boton Retirar, encargado de sacar el carro de la torre.
     */
    public static final String RETIRAR = "Retirar";
    /**
     * Dato estatico para el boton Cancelar, encargado de cancelar los procesos.
     */
    public static final String CANCELAR = "Cancelar";
    
    private JTextField txtPlaca;
    private JLabel lblPlaca;
    
    private String comando;
    
    /**
     * El constructor se encarga de crear todos los botones y de posicionarlos en la posicion deseada.
     */
    public RetirarVehiculo(){
        
        setSize(250,130);
        setTitle("Menu Retirar Vehiculo");
        setResizable(false);
        setLayout(new GridLayout(5,5));
        setPreferredSize(new Dimension(250,130));
        
        lblPlaca = new JLabel("Ingrese la matricula de su vehiculo");
        
        txtPlaca = new JTextField("");
                
        add(lblPlaca);
        add(txtPlaca);
        
        
        butRetirar = new JButton("Retirar");
        butCancelar = new JButton("Cancelar");
        
        add(butRetirar);
        add(butCancelar);
        
        butRetirar.setActionCommand(RETIRAR);
        butCancelar.setActionCommand(CANCELAR);
        
        butRetirar.addActionListener(this);
        butCancelar.addActionListener(this);
        
    }
    /**
     * Encargado de recibir y hacer las ordenes que hace el usuario al seleccionar un boton.
     */
    public void actionPerformed(ActionEvent event){
        comando=event.getActionCommand();
        
        if(comando.equals(RETIRAR)){
            retirarVehiculo.retirar();
        }else{
            retirarVehiculo.cancelar();
        }
    }
    /**
     * Cancelar es el encargado de suspender los procesos del sistema.
     */
    public void cancelar(){
        txtPlaca.setText("");
    }
    /**
     * Retirar es el encargado de sacar el vehiculo de la torre.
     */
    public void retirar(){
        parqueadero.retirarVehiculo(txtPlaca.getText());
    }
    /**
     * El main es el encargado de iniciar la ejecucion del sistema.
     */
    public static void main(String [] args) {
        RetirarVehiculo retirarVehiculo = new RetirarVehiculo();   
        retirarVehiculo.setVisible(true);
    }
}