package sequence;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AdminUsuarios{
    
    static RandomAccessFile usuarios;
    
    public AdminUsuarios() throws IOException{
        File usuario = new File("Users");
        if(!usuario.exists()){
            usuario.mkdirs();
        }
        usuarios = new RandomAccessFile("Users/usuarios.usr", "rw");
    }
    
    public boolean crearUser(String username, String contra, int puntos, Calendar fechacreacion) throws IOException{
        usuarios.seek(usuarios.length());
        if(buscarUser(username)==-1){
            usuarios.writeUTF(username);
            usuarios.writeUTF(contra);
            usuarios.writeInt(puntos);
            usuarios.writeLong(fechacreacion.getTimeInMillis());
            return true;
        }
        return false;
    }
    
    public long buscarUser(String username) throws IOException{
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
        if(buscarUser(username)!=-1){
            usuarios.seek(buscarUser(username));
            ArrayList<Object> usuario = new ArrayList();
            usuario.add(usuarios.readUTF());
            usuario.add(usuarios.readUTF());
            usuario.add(usuarios.readInt());
            usuario.add(new Date(usuarios.readLong()));
            return usuario;
        } else
            return null;
    }
}
