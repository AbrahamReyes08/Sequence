package sequence;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AdminUsuarios{
    
    /*Formato
    String username
    String contra
    int cantidadpuntos
    long fecha
    */
    static String userlog;
    static RandomAccessFile usuarios;
    static RandomAccessFile colores;
    
    public AdminUsuarios() throws IOException{
        File usuario = new File("Users");
        if(!usuario.exists()){
            usuario.mkdirs();
        }
        colores = new RandomAccessFile("Users/colores.usr", "rw");
        usuarios = new RandomAccessFile("Users/usuarios.usr", "rw");
    }
    
    //Manejo general de usuarios
    
    public boolean CrearUser(String username, String contra, int puntos, Calendar fechacreacion) throws IOException{
        usuarios.seek(usuarios.length());
        if(BuscarUser(username)==-1){
            usuarios.writeUTF(username);
            usuarios.writeUTF(contra);
            usuarios.writeInt(puntos);
            usuarios.writeLong(fechacreacion.getTimeInMillis());
            CrearCarpetaUser(username);
            CrearArchivosUser(username);
            return true;
        }
        return false;
    }
    
    public long BuscarUser(String username) throws IOException{
        usuarios.seek(0);
        while(usuarios.getFilePointer()<usuarios.length()){
            long puntero=usuarios.getFilePointer();
            String nombre=usuarios.readUTF();
            if(!nombre.equals(username)){
                usuarios.readUTF();
                usuarios.readInt();
                usuarios.readLong();
            } else
                return puntero;
        }
        return -1;
    }
    
    public ArrayList<Object> getUsuario(String username) throws IOException{
        if(BuscarUser(username)!=-1){
            usuarios.seek(BuscarUser(username));
            ArrayList<Object> usuario = new ArrayList();
            usuario.add(usuarios.readUTF());
            usuario.add(usuarios.readUTF());
            usuario.add(usuarios.readInt());
            usuario.add(new Date(usuarios.readLong()));
            return usuario;
        } else
            return null;
    }
    
    public ArrayList<String> getTodosUsuarios() throws IOException{
        if(usuarios.length()!=0){
            usuarios.seek(0);
            ArrayList<String> users = new ArrayList();
            while(usuarios.getFilePointer()<usuarios.length()){
                users.add(usuarios.readUTF());
                usuarios.readUTF();
                usuarios.readInt();
                usuarios.readLong();
            }
            return users;
        }
        return null;
    }
    
    //Manejo de colores
    
    public Color getColorUser(String username) throws IOException{
        if(colores.length()!=0){
            colores.seek(0);
            while(colores.getFilePointer()<colores.length()){
                if(username.equals(colores.readUTF()))
                   return new Color(colores.readInt());
                else
                    colores.readInt();
            }
        }
        return null;
    }
    
    public boolean ColorDisponible(Color color) throws IOException{
        if(colores.length()!=0){
            colores.seek(0);
            while(colores.getFilePointer()<colores.length()){
                colores.readUTF();
                if(colores.readInt()==color.getRGB()){
                    return false;
                }
            }
            return true;
        }
        return true;
    }
    
    public void AgregarCambiarColor(String user, Color color) throws IOException {
        if(colores.length()!=0){
            colores.seek(0);
            boolean existe=false;
            while(colores.getFilePointer()<colores.length()){
                if(user.equals(colores.readUTF())){
                    colores.writeInt(color.getRGB());
                    colores.seek(colores.length());
                    existe=true;
                }else
                    colores.readInt();
            }
            if(existe==false){
                colores.seek(colores.length());
                colores.writeUTF(user);
                colores.writeInt(color.getRGB());
            }
        } else{
            colores.writeUTF(user);
            colores.writeInt(color.getRGB());
        }
            
    }
    
    public ArrayList<Object> DatosColor(Color color) throws IOException{
        if(colores.length()!=0){
            colores.seek(0);
            while(colores.getFilePointer()<colores.length()){
                String user = colores.readUTF();
                int colorp = colores.readInt();
                if(colorp==color.getRGB()){
                    ArrayList<Object> datos = new ArrayList();
                    datos.add(user);
                    datos.add(colorp);
                    return datos;
                }
            }
        }
        return null;
    }
    
    //Usuario loggeado
    
    public String getUserlog() {
        return userlog;
    }

    public void setUserlog(String user) {
        userlog = user;
    }
    
    //Archivos personales de cada usuario
    
    public String DirUsuario(String username){
        String direccion = "Users/"+username;
        return direccion;
    }
    
    public void CrearCarpetaUser(String username){
        File archivo =  new File(DirUsuario(username));
        archivo.mkdir();
    }
    
    public void CrearArchivosUser(String username){
        String dirlog = DirUsuario(username)+"/logs.ur";
        try {
            RandomAccessFile logs = new RandomAccessFile(dirlog,"rw");
            String dirconfig = DirUsuario(username)+"/configuracion.ur";
            RandomAccessFile config = new RandomAccessFile(dirconfig,"rw");
            config.seek(0);
            config.writeInt(0);
            config.writeBoolean(false);
        } catch (Exception ex) {
            
        }   
    }
    
    public void CambiarConfig(String username, int cantplayers, boolean compartircolor){
        try {
            RandomAccessFile config = new RandomAccessFile(DirUsuario(username)+"/configuracion.ur","rw");
            config.seek(0);
            config.writeInt(cantplayers);
            config.writeBoolean(compartircolor);
        } catch (Exception e) {
            
        }
    }
    
    public ArrayList<Object> getConfigUser(String username){
        ArrayList<Object> datos = new ArrayList();
        try {
            RandomAccessFile config = new RandomAccessFile(DirUsuario(username)+"/configuracion.ur","rw");
            config.seek(0);
            datos.add(config.readInt());
            datos.add(config.readBoolean());
        } catch (Exception e) {
            
        }
        return datos;
    }
    
    public void AgregarLog(ArrayList<String> equipo1, ArrayList<String> equipo2, ArrayList<String> equipo3, String resultado, Calendar fecha){
        try {
            RandomAccessFile logs = new RandomAccessFile(DirUsuario(equipo1.get(0))+"/logs.ur","rw");
            if(logs.length()!=0){
                logs.seek(logs.length());
            }
            String equipo1txt, equipo2txt, equipo3txt, equipos;
            
            if(equipo2.size()>=2){
                equipo1txt="Equipo de ";
                equipo2txt="Equipo de ";
                equipo3txt="Equipo de ";
            }else{
                equipo1txt="Jugador ";
                equipo2txt="Jugador ";
                equipo3txt="Jugador ";
            }
                
            for(int i=0; i<equipo1.size();i++){
                if(i<equipo1.size()-2)
                    equipo1txt+=equipo1.get(i)+", ";
                else if(i==equipo1.size()-2)
                    equipo1txt+=equipo1.get(i)+" y ";
                else
                    equipo1txt+=equipo1.get(i);
            }
            
            for(int i=0; i<equipo2.size();i++){
                if(i<equipo2.size()-2)
                    equipo2txt+=equipo2.get(i)+", ";
                else if(i==equipo2.size()-2){
                    equipo2txt+=equipo2.get(i)+" y ";
                }
                else
                    equipo2txt+=equipo2.get(i);
            }
            
            if(equipo3!=null){
                for(int i=0; i<equipo3.size();i++){
                    if(i<equipo3.size()-2)
                        equipo3txt+=equipo3.get(i)+", ";
                    else if(i==equipo3.size()-2){
                        equipo3txt+=equipo3.get(i)+" y ";
                    }
                    else
                        equipo3txt+=equipo3.get(i);
                }
            }
            if(equipo3!=null){
                equipos=equipo2txt+" y "+equipo3txt;
            }else
                equipos=equipo2txt;
            String log = fecha+" - "+equipo1txt+" vs "+equipos+" - "+resultado;
            logs.writeUTF(log);
        } catch (Exception ex) {
            
        }
    }
    
    public ArrayList<String> getLogs(String username){
        try{
            RandomAccessFile logs = new RandomAccessFile(DirUsuario(username)+"/logs.ur","rw");
            if(logs.length()!=0){
                ArrayList<String> logsarreglo = new ArrayList();
                logs.seek(0);
                while(logs.getFilePointer()<logs.length()){
                    logsarreglo.add(logs.readUTF());
                }
                return logsarreglo;
            }
        }catch(Exception e){
            
        }
        return null;
    }
}
