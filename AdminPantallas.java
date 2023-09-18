package sequence;

import java.io.IOException;
import javax.swing.JOptionPane;

public class AdminPantallas {
    
    private static MenuInicio menuinicio = new MenuInicio();
    
    public static void AbrirMenuInicio(){
        menuinicio.setVisible(true);
    }
    
    public static void AbrirCrearJugador(){
        try{
            CrearUsuario crearjugador = new CrearUsuario();
            crearjugador.setVisible(true);
            crearjugador.setLocationRelativeTo(null);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void AbrirIniciarSesion(){
        try{
            IniciarSesion iniciarsesion = new IniciarSesion();
            iniciarsesion.setVisible(true);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public static void AbrirMenuPrincipal(){
        try{
            MenuPrincipal menuprincipal = new MenuPrincipal();
            menuprincipal.setVisible(true);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void AbrirSequence(){
        try{
        Sequence sequence = new Sequence();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void AbrirConfiguracion(){
        try{
            Configuracion configuracion = new Configuracion();
            configuracion.setVisible(true);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void AbrirMenuEquipos(){
        try{
            PrePartida prepartida = new PrePartida();
            prepartida.setVisible(true);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void AbrirReportes(){
        try{
            Reportes reportes = new Reportes();
            reportes.setVisible(true);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
