package sequence;

import java.util.Random;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

public class ConfiguracionPartida{
    
    Random aleatorio = new Random();
    AdminUsuarios adminuser = new AdminUsuarios();
    
    public ConfiguracionPartida() throws IOException{
        
    }
    
    private static int cantjugadores;
    private static boolean compartircolor;
    private static ArrayList<String> equipo1;
    private static ArrayList<String> equipo2;
    private static ArrayList<Color> colorequipo1 = new ArrayList();
    private static ArrayList<Color> colorequipo2 = new ArrayList();

    public static int getCantjugadores() {
        return cantjugadores;
    }

    public static void setCantjugadores(int cantjugador) {
        cantjugadores = cantjugador;
    }

    public static boolean getCompartirColor() {
        return compartircolor;
    }

    public static void setCompartirColor(boolean compartir) {
        compartircolor = compartir;
    }
    
    
    public static ArrayList<String> getEquipo1() {
        return equipo1;
    }

    public static void setEquipo1(ArrayList<String> equip1) {
        equipo1 = equip1;
    }

    public static ArrayList<String> getEquipo2() {
        return equipo2;
    }

    public static void setEquipo2(ArrayList<String> equip2) {
        equipo2 = equip2;
    }

    public void setColoresEquipos(ArrayList<String> equipo1, ArrayList<String> equipo2) throws IOException{
        colorequipo1.clear();
        colorequipo2.clear();
        ArrayList<Color> fake = new ArrayList();
        ArrayList<Color> equipo1disponible = setColorEquipo(fake);
        ArrayList<Color> equipo2disponible = setColorEquipo(equipo1disponible);
        if(compartircolor==false || cantjugadores<4){
            for(int i=0;i<equipo1.size();i++){
                if(adminuser.getColorUser(equipo1.get(i))!=null){
                    colorequipo1.add(adminuser.getColorUser(equipo1.get(i)));
                } else{
                    colorequipo1.add(getColor(equipo1disponible));
                }
            }

            for(int i=0;i<equipo2.size();i++){
                if(adminuser.getColorUser(equipo2.get(i))!=null){
                    colorequipo2.add(adminuser.getColorUser(equipo1.get(i)));
                } else{
                    if(cantjugadores!=3){
                        colorequipo2.add(getColor(equipo2disponible));
                    }else{
                        colorequipo2.add(equipo2disponible.get(i));
                    }
                }
            }
        }else{
            if(adminuser.getColorUser(adminuser.getUserlog())!=null){
                for(int i=0; i<equipo1.size();i++){
                    colorequipo1.add(adminuser.getColorUser(adminuser.getUserlog()));
                }
            }else{
                for(int i=0;i<equipo1.size();i++){
                    colorequipo1.add(equipo1disponible.get(0));
                }
            }
            for(int i=0;i<equipo2.size();i++){
                    colorequipo2.add(equipo2disponible.get(0));
            }
        }
    }
    
    public ArrayList<Color> setColorEquipo(ArrayList<Color> equipo1){
        ArrayList<Color> colores = new ArrayList();
        Color color=null;
        while(colores.size()<2){
            int eleccion = aleatorio.nextInt(5);
            switch(eleccion){
                case 0:
                    color = new Color(193,255,114);
                    break;
                case 1:
                    color = new Color(255,87,87);
                    break;
                case 2:
                    color = new Color(225,222,89);
                    break;
                case 3:
                    color = new Color(84,106,221);
                    break;
            }
            for(Color coloresa: colores){
                if(color==null)
                    break;
                if(color.equals(coloresa)){
                    color=null;
                }
            }
            if(color!=null){
                if(!equipo1.isEmpty()){
                    for(Color colore1: equipo1){
                        if(color.equals(colore1)){
                            color=null;
                            break;
                        }
                    }
                }
            }
            if(color!=null){
                colores.add(color);
            }
        }
        return colores;
    }
    
    public Color getColor(ArrayList<Color> colores){
        return colores.get(aleatorio.nextInt(2));
    }
    
    public static void prueba(){
        for(String personae1: equipo1){
            System.out.println(personae1+"\n");
        }
        
        for(Color personae1: colorequipo1){
            System.out.println(personae1+"\n");
        }
        
        System.out.println("Equipo 2\n");
        
        for(String personae2: equipo2){
            System.out.println(personae2+"\n");
        }
        
        for(Color personae2: colorequipo2){
            System.out.println(personae2+"\n");
        }
    }
}
