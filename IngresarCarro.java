import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * El menu ingresar carro permite adicionar un carro nuevo en la torre del parqueadero.
 * 
 * @author Mateo Gutierrez Gomez  201220019010
 */
public class IngresarCarro extends JFrame implements ActionListener{
    
    private IngresarCarro ingresarCarro;
    private Vehiculo vehiculo;
    private JButton butGuardar;
    private JButton butLimpiar;
    /**
     * Dato estatico para el boton guardar, encargado de salvar los cambios que se realicen.
     */
    public static final String GUARDAR = "Guardar";
    /**
     * Dato estatico para el boton limpiar, encargado de borrar las celdas de texto en el JFrame.
     */
    public static final String LIMPIAR = "Limpiar";
    
    private JTextField txtNombre;
    private JTextField txtIdentificacion;
    private JTextField txtMatricula;
    private JTextField txtTipoDeVehiculo;
    private JTextField txtHoraDeLlegada;
    private JTextField txtHoraDeSalida;
    private JLabel lblNombre;
    private JLabel lblIdentificacion;
    private JLabel lblMatricula;
    private JLabel lblTipoDeVehiculo;
    private JLabel lblHoraDeLlegada;
    private JLabel lblHoraDeSalida;
    
    private String comando;
    
    /**
     * El constructor se encarga de crear todos los botones y de posicionarlos en la posicion deseada.
     */
    public IngresarCarro(){
        
        
        setSize(500,150);
        setTitle("Menu Ingresar Carro");
        setResizable(false);
        setLayout(new GridLayout(7,7));
        setPreferredSize(new Dimension(300,150));
        
        lblNombre = new JLabel("Nombre del cliente");
        lblIdentificacion = new JLabel("Identificacion del cliente");
        lblMatricula = new JLabel("Matricula del vehiculo");
        lblTipoDeVehiculo = new JLabel("Tipo de Vehiculo");
        lblHoraDeLlegada = new JLabel("Hora de llegada");
        lblHoraDeSalida = new JLabel("Posible hora de salida");
        
        txtNombre = new JTextField("");
        txtIdentificacion = new JTextField("");
        txtMatricula = new JTextField("");
        txtTipoDeVehiculo = new JTextField("");
        txtHoraDeLlegada = new JTextField("");
        txtHoraDeSalida = new JTextField("");
                
        add(lblNombre);
        add(txtNombre);
        add(lblIdentificacion);
        add(txtIdentificacion);
        add(lblMatricula);
        add(txtMatricula);
        add(lblTipoDeVehiculo);
        add(txtTipoDeVehiculo);
        add(lblHoraDeLlegada);
        add(txtHoraDeLlegada);
        add(lblHoraDeSalida);
        add(txtHoraDeSalida);
        
        butGuardar = new JButton("Guardar");
        butLimpiar = new JButton("Limpiar");
        
        add(butGuardar);
        add(butLimpiar);
        
        butGuardar.setActionCommand(GUARDAR);
        butLimpiar.setActionCommand(LIMPIAR);
        
        butGuardar.addActionListener(this);
        butLimpiar.addActionListener(this);
        
    }
    /**
     * Encargado de recibir y hacer las ordenes que hace el usuario al seleccionar un boton.
     */
    public void actionPerformed(ActionEvent event){
        comando = event.getActionCommand();
        
        if(comando.equals(GUARDAR)){
            ingresarCarro.guardar();
        }else{
            ingresarCarro.limpiar();
        }
    }
    /**
     * Cambiar es el encargado de borrar los datos de los textFields.
     */
    public void limpiar(){
        txtNombre.setText("");
        txtIdentificacion.setText("");
        txtMatricula.setText("");
        txtTipoDeVehiculo.setText("");
        txtHoraDeLlegada.setText("");
        txtHoraDeSalida.setText("");
    }
    /**
     * Guardar es el encargado de salvar los cambios en los datos del sistema.
     */
    public void guardar(){
        vehiculo = new Vehiculo(txtNombre.getText(), Integer.parseInt(txtIdentificacion.getText()), txtMatricula.getText(), Integer.parseInt(txtTipoDeVehiculo.getText()), Integer.parseInt(txtHoraDeLlegada.getText()), Integer.parseInt(txtHoraDeSalida.getText()));
    }
    /**
     * El main es el encargado de iniciar la ejecucion del sistema.
     */
    public static void main(String [] args) {
        IngresarCarro ingresarCarro = new IngresarCarro();   
        ingresarCarro.setVisible(true);
    }
}