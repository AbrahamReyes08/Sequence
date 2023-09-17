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
    
    Color negro = new Color(38,38,38);
    Color celeste = new Color(92,225,230);
    Color verde = new Color(193,255,114);
    Color rojo = new Color(255,87,87);
    Color anaranjado = new Color(255,145,77);
    Color morado = new Color(203,108,230);
    Color azul = new Color(84,106,221);
    Color amarillo = new Color(225,222,89);
    private static int cantjugadores;
    private static boolean compartircolor;
    private static ArrayList<String> equipo1;
    private static ArrayList<String> equipo2;
    private static ArrayList<String> equipo3;
    private static ArrayList<Color> colorequipo1 = new ArrayList();
    private static ArrayList<Color> colorequipo2 = new ArrayList();
    private static ArrayList<Color> colorequipo3 = new ArrayList();

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
    
    public static ArrayList<String> getEquipo3() {
        return equipo3;
    }

    public static void setEquipo3(ArrayList<String> equip3) {
        equipo3 = equip3;
    }
    
    public void setColoresEquipos(ArrayList<String> equipo1, ArrayList<String> equipo2, ArrayList<String> equipo3) throws IOException{
        colorequipo1.clear();
        colorequipo2.clear();
        colorequipo3.clear();
        ArrayList<Color> fake = new ArrayList();
        ArrayList<Color> equipo1disponible = setColorEquipo(fake);
        ArrayList<Color> contrincantesdisponible = setColorEquipo(equipo1disponible);
        if(compartircolor==false || cantjugadores<4){
            for(int i=0;i<equipo1.size();i++){
                if(adminuser.getColorUser(equipo1.get(i))!=null){
                    colorequipo1.add(adminuser.getColorUser(equipo1.get(i)));
                } else{
                    colorequipo1.add(getColor(equipo1disponible));
                }
            }
            
            if(cantjugadores!=3 && cantjugadores!=6){
                for(int i=0;i<equipo2.size();i++){
                    if(adminuser.getColorUser(equipo2.get(i))!=null){
                        colorequipo2.add(adminuser.getColorUser(equipo2.get(i)));
                    } else{
                        colorequipo2.add(getColor(contrincantesdisponible));
                    }
                }
            } else{
                for(int i=0;i<equipo2.size();i++){
                    if(adminuser.getColorUser(equipo2.get(i))!=null){
                        colorequipo2.add(adminuser.getColorUser(equipo2.get(i)));
                    } else{
                        colorequipo2.add(contrincantesdisponible.get(0));
                    }
                }
            
                for(int i=0;i<equipo3.size();i++){
                    if(adminuser.getColorUser(equipo3.get(i))!=null){
                        colorequipo3.add(adminuser.getColorUser(equipo3.get(i)));
                    } else{
                        colorequipo3.add(contrincantesdisponible.get(1));
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
            
            if(cantjugadores!=3 && cantjugadores!=6){
                for(int i=0;i<equipo2.size();i++){
                    colorequipo2.add(contrincantesdisponible.get(0));
                }
            } else{
                for(int i=0;i<equipo2.size();i++){
                    colorequipo2.add(contrincantesdisponible.get(0));
                }
                for(int i=0;i<equipo3.size();i++){
                    colorequipo3.add(contrincantesdisponible.get(1));
                }
            }
        }
    }
    
    private ArrayList<Color> setColorEquipo(ArrayList<Color> equipo1){
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
    
    private Color getColor(ArrayList<Color> colores){
        return colores.get(aleatorio.nextInt(2));
    }
    
    public String getJugador(int equipo, int pos){
        switch(equipo){
            case 1:
                return equipo1.get(pos);
            case 2:
                return equipo2.get(pos);
            case 3:
                return equipo3.get(pos);
        }
        return null;
    }
    
    public String getColorPlayer(String username, int equipo){
        ArrayList<String> equipoverificar=null;
        switch(equipo){
            case 1:
                equipoverificar=equipo1;
                break;
            case 2:
                equipoverificar=equipo2;
                break;
            case 3:
                equipoverificar=equipo3;
                break;
        }
        int index=-1;
        for(int i=0; i<equipoverificar.size();i++){
            if(username.equals(equipoverificar.get(i))){
                index=i;
                break;
            }
        }
        Color color=null;
        switch(equipo){
            case 1:
                color=colorequipo1.get(index);
                break;
            case 2:
                color=colorequipo1.get(index);
                break;
            case 3:
                color=colorequipo1.get(index);
                break;
        }
        if(color.equals(negro))
            return "Negro";
        else if(color.equals(celeste))
            return "Celeste";
        else if(color.equals(verde))
            return "Verde";
        else if(color.equals(rojo))
            return "Rojo";
        else if(color.equals(anaranjado))
            return "Anaranjado";
        else if(color.equals(morado))
            return "Morado";
        else if(color.equals(azul))
            return "Azul";
        else if(color.equals(amarillo))
            return "Amarillo";
        return null;
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
        
        if(cantjugadores==3 || cantjugadores==6){
            
            System.out.println("Equipo 3\n");
            
            for(String personae3: equipo3){
                System.out.println(personae3+"\n");
            }
        
            for(Color personae3: colorequipo3){
                System.out.println(personae3+"\n");
            }
        }
    }
}
