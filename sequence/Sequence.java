/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequence;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Sequence implements ActionListener{
    private String[][] tablero=new String [10][10];
    private String[][] deck=new String [2][3];
    
    ArrayList<String> CM = new ArrayList<>();
    ArrayList<String> CU = new ArrayList<>();    
    ArrayList<String> mazo1 = new ArrayList<>();
    ArrayList<String> mazo2 = new ArrayList<>();
    ArrayList<String> mazo3 = new ArrayList<>();
    ArrayList<String> mazo4 = new ArrayList<>();

    Random random = new Random();
    Tablero tab= new Tablero();
    
    private int segundos;
    private String posicionActual;
    private String posicionAntigua;
    private String posicionNueva;
    private boolean quiereDescartar=false;
    private String turno="Jugador1";
    private int num=0;
    private int cartasRobadas=0;
    
    public Sequence() {
        inicializarTablero();
        tab.setVisible(true);
        añadirActionEvents();
        añadirFichasTablero();
        Tablero.NombreMazoTurno.setText(turno);
    }
    
    private void inicializarTablero() {
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                tablero [i][j]="";
            }
        }
        for (int w=0; w<2; w++){
            for (int z=0; z<3;z++) {
                deck [w][z]="";
            }
        }
        fichasMazo();
        asignarCartas(mazo1);
        asignarCartas(mazo2);
        asignarCartas(mazo3);
        asignarCartas(mazo4);
        CambiarMazoEnPantalla(mazo1);
        iniciarCronometro();
        CU.add("parteTrasera");
        Tablero.instrucDiscart.setVisible(false);
    }
    
    private void añadirActionEvents() {
        Tablero.jButton1.addActionListener(this); 
        Tablero.jButton2.addActionListener(this); 
        Tablero.jButton3.addActionListener(this); 
        Tablero.jButton4.addActionListener(this); 
        Tablero.jButton5.addActionListener(this); 
        Tablero.jButton6.addActionListener(this); 
        Tablero.jButton7.addActionListener(this); 
        Tablero.jButton8.addActionListener(this); 
        Tablero.jButton9.addActionListener(this); 
        Tablero.jButton10.addActionListener(this); 
        Tablero.jButton11.addActionListener(this); 
        Tablero.jButton12.addActionListener(this); 
        Tablero.jButton13.addActionListener(this); 
        Tablero.jButton14.addActionListener(this); 
        Tablero.jButton15.addActionListener(this); 
        Tablero.jButton16.addActionListener(this); 
        Tablero.jButton17.addActionListener(this); 
        Tablero.jButton18.addActionListener(this); 
        Tablero.jButton19.addActionListener(this); 
        Tablero.jButton20.addActionListener(this); 
        Tablero.jButton21.addActionListener(this); 
        Tablero.jButton22.addActionListener(this); 
        Tablero.jButton23.addActionListener(this); 
        Tablero.jButton24.addActionListener(this); 
        Tablero.jButton25.addActionListener(this); 
        Tablero.jButton26.addActionListener(this); 
        Tablero.jButton27.addActionListener(this); 
        Tablero.jButton28.addActionListener(this); 
        Tablero.jButton29.addActionListener(this); 
        Tablero.jButton30.addActionListener(this); 
        Tablero.jButton31.addActionListener(this); 
        Tablero.jButton32.addActionListener(this); 
        Tablero.jButton33.addActionListener(this); 
        Tablero.jButton34.addActionListener(this); 
        Tablero.jButton35.addActionListener(this); 
        Tablero.jButton36.addActionListener(this); 
        Tablero.jButton37.addActionListener(this); 
        Tablero.jButton38.addActionListener(this); 
        Tablero.jButton39.addActionListener(this); 
        Tablero.jButton40.addActionListener(this); 
        Tablero.jButton41.addActionListener(this); 
        Tablero.jButton42.addActionListener(this); 
        Tablero.jButton43.addActionListener(this); 
        Tablero.jButton44.addActionListener(this); 
        Tablero.jButton45.addActionListener(this); 
        Tablero.jButton46.addActionListener(this); 
        Tablero.jButton47.addActionListener(this); 
        Tablero.jButton48.addActionListener(this); 
        Tablero.jButton49.addActionListener(this); 
        Tablero.jButton50.addActionListener(this); 
        Tablero.jButton51.addActionListener(this); 
        Tablero.jButton52.addActionListener(this); 
        Tablero.jButton53.addActionListener(this); 
        Tablero.jButton54.addActionListener(this); 
        Tablero.jButton55.addActionListener(this); 
        Tablero.jButton56.addActionListener(this); 
        Tablero.jButton57.addActionListener(this); 
        Tablero.jButton58.addActionListener(this); 
        Tablero.jButton59.addActionListener(this); 
        Tablero.jButton60.addActionListener(this); 
        Tablero.jButton61.addActionListener(this); 
        Tablero.jButton62.addActionListener(this); 
        Tablero.jButton63.addActionListener(this); 
        Tablero.jButton64.addActionListener(this); 
        Tablero.jButton65.addActionListener(this); 
        Tablero.jButton66.addActionListener(this); 
        Tablero.jButton67.addActionListener(this); 
        Tablero.jButton68.addActionListener(this); 
        Tablero.jButton69.addActionListener(this); 
        Tablero.jButton70.addActionListener(this); 
        Tablero.jButton71.addActionListener(this); 
        Tablero.jButton72.addActionListener(this); 
        Tablero.jButton73.addActionListener(this); 
        Tablero.jButton74.addActionListener(this); 
        Tablero.jButton75.addActionListener(this); 
        Tablero.jButton76.addActionListener(this); 
        Tablero.jButton77.addActionListener(this); 
        Tablero.jButton78.addActionListener(this); 
        Tablero.jButton79.addActionListener(this); 
        Tablero.jButton80.addActionListener(this); 
        Tablero.jButton81.addActionListener(this); 
        Tablero.jButton82.addActionListener(this); 
        Tablero.jButton83.addActionListener(this); 
        Tablero.jButton84.addActionListener(this); 
        Tablero.jButton85.addActionListener(this); 
        Tablero.jButton86.addActionListener(this); 
        Tablero.jButton87.addActionListener(this); 
        Tablero.jButton88.addActionListener(this); 
        Tablero.jButton89.addActionListener(this); 
        Tablero.jButton90.addActionListener(this); 
        Tablero.jButton91.addActionListener(this); 
        Tablero.jButton92.addActionListener(this); 
        Tablero.jButton93.addActionListener(this); 
        Tablero.jButton94.addActionListener(this); 
        Tablero.jButton95.addActionListener(this); 
        Tablero.jButton96.addActionListener(this); 
        Tablero.jButton97.addActionListener(this); 
        Tablero.jButton98.addActionListener(this); 
        Tablero.jButton99.addActionListener(this); 
        Tablero.jButton100.addActionListener(this);
        Tablero.jButton102.addActionListener(this); 
        Tablero.jButton103.addActionListener(this); 
        Tablero.jButton104.addActionListener(this); 
        Tablero.jButton105.addActionListener(this); 
        Tablero.jButton106.addActionListener(this); 
        Tablero.jButton107.addActionListener(this); 
        Tablero.Mazo.addActionListener(this);
    }
    
    private void añadirFichasTablero(){
        ponerImagenString(0,0,"00","Esquinas","Esquinas.png");
        ponerImagenString(0,1,"01","2Picas","2Picas.png");
        ponerImagenString(0,2,"02","3Picas","3Picas.png");
        ponerImagenString(0,3,"03","4Picas","4Picas.png");
        ponerImagenString(0,4,"04","5Picas","5Picas.png");
        ponerImagenString(0,5,"05","6Picas","6Picas.png");
        ponerImagenString(0,6,"06","7Picas","7Picas.png");
        ponerImagenString(0,7,"07","8Picas","8Picas.png");
        ponerImagenString(0,8,"08","9Picas","9Picas.png");
        ponerImagenString(0,9,"09","Esquinas","Esquinas.png");
        ponerImagenString(1,0,"10","6Trebol","6Trebol.png");
        ponerImagenString(1,1,"11","5Trebol","5Trebol.png");
        ponerImagenString(1,2,"12","4Trebol","4Trebol.png");
        ponerImagenString(1,3,"13","3Trebol","3Trebol.png");
        ponerImagenString(1,4,"14","2Trebol","2Trebol.png");
        ponerImagenString(1,5,"15","AsCorazon","AsCorazon.png");
        ponerImagenString(1,6,"16","KCorazon","KCorazon.png");
        ponerImagenString(1,7,"17","QCorazon","QCorazon.png");
        ponerImagenString(1,8,"18","10Corazon","10Corazon.png");
        ponerImagenString(1,9,"19","10Picas","10Picas.png");
        ponerImagenString(2,0,"20","7Trebol","7Trebol.png");
        ponerImagenString(2,1,"21","AsPicas","AsPicas.png");
        ponerImagenString(2,2,"22","2Diamantes","2Diamantes.png");
        ponerImagenString(2,3,"23","3Diamantes","3Diamantes.png");
        ponerImagenString(2,4,"24","4Diamantes","4Diamantes.png");
        ponerImagenString(2,5,"25","5Diamantes","5Diamantes.png");
        ponerImagenString(2,6,"26","6Diamantes","6Diamantes.png");
        ponerImagenString(2,7,"27","7Diamantes","7Diamantes.png");
        ponerImagenString(2,8,"28","9Diamantes","9Diamantes.png");
        ponerImagenString(2,9,"29","QPicas","QPicas.png");
        ponerImagenString(3,0,"30","8Trebol","8Trebol.png");
        ponerImagenString(3,1,"31","KPicas","KPicas.png");
        ponerImagenString(3,2,"32","6Trebol","6Trebol.png");
        ponerImagenString(3,3,"33","5Trebol","5Trebol.png");
        ponerImagenString(3,4,"34","4Trebol","4Trebol.png");
        ponerImagenString(3,5,"35","3Trebol","3Trebol.png");
        ponerImagenString(3,6,"36","2Trebol","2Trebol.png");
        ponerImagenString(3,7,"37","8Diamantes","8Diamantes.png");
        ponerImagenString(3,8,"38","8Corazon","8Corazon.png");
        ponerImagenString(3,9,"39","KPicas","KPicas.png");
        ponerImagenString(4,0,"40","9Trebol","9Trebol.png");
        ponerImagenString(4,1,"41","QPicas","QPicas.png");
        ponerImagenString(4,2,"42","7Trebol","7Trebol.png");
        ponerImagenString(4,3,"43","6Corazon","6Corazon.png");
        ponerImagenString(4,4,"44","5Corazon","5Corazon.png");
        ponerImagenString(4,5,"45","4Corazon","4Corazon.png");
        ponerImagenString(4,6,"46","AsCorazon","AsCorazon.png");
        ponerImagenString(4,7,"47","9Diamantes","9Diamantes.png");
        ponerImagenString(4,8,"48","7Corazon","7Corazon.png");
        ponerImagenString(4,9,"49","AsPicas","AsPicas.png");
        ponerImagenString(5,0,"50","10Trebol","10Trebol.png");
        ponerImagenString(5,1,"51","10Picas","10Picas.png");
        ponerImagenString(5,2,"52","8Trebol","8Trebol.png");
        ponerImagenString(5,3,"53","7Corazon","7Corazon.png");
        ponerImagenString(5,4,"54","2Corazon","2Corazon.png");
        ponerImagenString(5,5,"55","3Corazon","3Corazon.png");
        ponerImagenString(5,6,"56","KCorazon","KCorazon.png");
        ponerImagenString(5,7,"57","10Diamantes","10Diamantes.png");
        ponerImagenString(5,8,"58","6Corazon","6Corazon.png");
        ponerImagenString(5,9,"59","2Diamantes","2Diamantes.png");
        ponerImagenString(6,0,"60","QTrebol","QTrebol.png");
        ponerImagenString(6,1,"61","9Picas","9Picas.png");
        ponerImagenString(6,2,"62","9Trebol","9Trebol.png");
        ponerImagenString(6,3,"63","8Corazon","8Corazon.png");
        ponerImagenString(6,4,"64","9Corazon","9Corazon.png");
        ponerImagenString(6,5,"65","10Corazon","10Corazon.png");
        ponerImagenString(6,6,"66","QCorazon","QCorazon.png");
        ponerImagenString(6,7,"67","QDiamantes","QDiamantes.png");
        ponerImagenString(6,8,"68","5Corazon","5Corazon.png");
        ponerImagenString(6,9,"69","3Diamantes","3Diamantes.png");
        ponerImagenString(7,0,"70","KTrebol","KTrebol.png");
        ponerImagenString(7,1,"71","8Picas","8Picas.png");
        ponerImagenString(7,2,"72","10Trebol","10Trebol.png");
        ponerImagenString(7,3,"73","QTrebol","QTrebol.png");
        ponerImagenString(7,4,"74","KTrebol","KTrebol.png");
        ponerImagenString(7,5,"75","AsTrebol","AsTrebol.png");
        ponerImagenString(7,6,"76","AsDiamantes","AsDiamantes.png");
        ponerImagenString(7,7,"77","KDiamantes","KDiamantes.png");
        ponerImagenString(7,8,"78","4Corazon","4Corazon.png");
        ponerImagenString(7,9,"79","4Diamantes","4Diamantes.png");
        ponerImagenString(8,0,"80","AsTrebol","AsTrebol.png");
        ponerImagenString(8,1,"81","7Picas","7Picas.png");
        ponerImagenString(8,2,"82","6Picas","6Picas.png");
        ponerImagenString(8,3,"83","5Picas","5Picas.png");
        ponerImagenString(8,4,"84","4Picas","4Picas.png");
        ponerImagenString(8,5,"85","3Picas","3Picas.png");
        ponerImagenString(8,6,"86","2Picas","2Picas.png");
        ponerImagenString(8,7,"87","2Corazon","2Corazon.png");
        ponerImagenString(8,8,"88","3Corazon","3Corazon.png");
        ponerImagenString(8,9,"89","5Diamantes","5Diamantes.png");
        ponerImagenString(9,0,"90","Esquinas","Esquinas.png");
        ponerImagenString(9,1,"91","AsDiamantes","AsDiamantes.png");
        ponerImagenString(9,2,"92","KDiamantes","KDiamantes.png");
        ponerImagenString(9,3,"93","QDiamantes","QDiamantes.png");
        ponerImagenString(9,4,"94","10Diamantes","10Diamantes.png");
        ponerImagenString(9,5,"95","9Diamantes","9Diamantes.png");
        ponerImagenString(9,6,"96","8Diamantes","8Diamantes.png");
        ponerImagenString(9,7,"97","7Diamantes","7Diamantes.png");
        ponerImagenString(9,8,"98","6Diamantes","6Diamantes.png");
        ponerImagenString(9,9,"99","Esquinas","Esquinas.png");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
            posicionActual = getBotonPosicionString(ae.getSource());
            
                if(posicionActual.equals("discart") && cartasRobadas==0) {
                    Tablero.instrucDiscart.setVisible(true);
                    quiereDescartar=true;
                } else if(cartasRobadas==1 && posicionActual.equals("discart")) {
                    JOptionPane.showMessageDialog(null, "Solo puedes descartar una carta por turno.", "Error", JOptionPane.INFORMATION_MESSAGE);
                } 
                
                if(quiereDescartar) {
                    if (isCurrentPieceDeck(posicionActual)) {
                        posicionAntigua=posicionActual;
                            if(turno.equals("Jugador1")) {
                                agarrarNuevaCartaDeMazo(mazo1, posicionAntigua);
                            } else if(turno.equals("Jugador2")) {
                                agarrarNuevaCartaDeMazo(mazo2, posicionAntigua);
                            } else if(turno.equals("Jugador3")) {
                                agarrarNuevaCartaDeMazo(mazo3, posicionAntigua);
                            } else if(turno.equals("Jugador4")) {
                                agarrarNuevaCartaDeMazo(mazo4, posicionAntigua);
                            }
                            cartasRobadas=1;
                            posicionAntigua=null;
                            quiereDescartar=false;
                            Tablero.instrucDiscart.setVisible(false);
                    }
                }
            
            if (isCurrentPieceDeck(posicionActual) ) {
                System.out.println("si es de deck");
                posicionAntigua = posicionActual;
                dimeLaCasillaD(posicionAntigua);
            } else if (isCurrentPieceTab(posicionActual)) {
                posicionNueva = getBotonPosicionString(ae.getSource());
                dimeLaCasilla(posicionNueva);
                System.out.println("ES de tab");
                if (posicionAntigua!=null && ponerFichaDisponible(posicionAntigua,posicionNueva) ){
                    if(turno.equals("Jugador1")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j1"+CU.get(num) , "ficha1.png");
                        ponerNuevaCarta(mazo1, posicionAntigua);
                    } else if(turno.equals("Jugador2")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j2" +CU.get(num), "ficha2.png");
                        ponerNuevaCarta(mazo2, posicionAntigua);
                    } else if(turno.equals("Jugador3")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j3"+CU.get(num) , "ficha3.png");
                        ponerNuevaCarta(mazo1, posicionAntigua);
                    } else if(turno.equals("Jugador4")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j4" +CU.get(num), "ficha4.png");
                        ponerNuevaCarta(mazo1, posicionAntigua);
                    } 
                    cartasRobadas=0;
                    System.out.println("se puso");
                    cambiarTurno();
                    iniciarCronometro();
                 } else if(posicionAntigua!=null && sePuedeUtilizarJack(posicionAntigua)) {
                            if(turno.equals("Jugador1")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j1"+CU.get(num) , "ficha1.png");
                        ponerNuevaCarta(mazo1, posicionAntigua);
                    } else if(turno.equals("Jugador2")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j2" +CU.get(num), "ficha2.png");
                        ponerNuevaCarta(mazo2, posicionAntigua);
                    } else if(turno.equals("Jugador3")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j3"+CU.get(num) , "ficha3.png");
                        ponerNuevaCarta(mazo1, posicionAntigua);
                    } else if(turno.equals("Jugador4")) {
                        num=num+1;
                        guardarFichaUtilizada(posicionNueva, num);
                        ponerFicha(posicionNueva,"j4" +CU.get(num), "ficha4.png");
                        ponerNuevaCarta(mazo1, posicionAntigua);
                    } 
                    cartasRobadas=0;
                    System.out.println("se puso");
                    cambiarTurno();
                    iniciarCronometro();
                    }else {
                    System.out.println("no es posible ");
                }
            }
    }
    
    private void dimeLaCasilla(String posicion) {
        int x = Character.getNumericValue(posicion.charAt(1));
        int y = Character.getNumericValue(posicion.charAt(0));
        System.out.println(tablero[y][x]);
    }
    
    private String dimeLaCasillaD(String posicion) {
        int y = Character.getNumericValue(posicionAntigua.charAt(1));
        int x;
        if (y>3) {
            x=1;
            y=y-4;
        } else {
            y=y-1;
            x=0;
        }
        System.out.println(deck[x][y]);
        return deck[x][y];
    }
    
    private boolean isCurrentPieceDeck(String posicion) {
        
        char letra=posicion.charAt(0);
        if (letra=='C' && letra!='d') {
            System.out.println("Sui es de desck");
            return true;
        }
        return false;
    }
    
    private boolean isCurrentPieceTab(String posicion) {
        char letra=posicion.charAt(0);
        if (letra!='C' && letra!='d' && letra!='b') {
            System.out.println("es de tab");
            return true;
        }
        return false;
    }
    
    private boolean ponerFichaDisponible(String PosAntigua, String posNueva) {
        int x = Character.getNumericValue(posicionAntigua.charAt(1));
        int y;
        if (x>3) {
            y=1;
            x=x-4;
        } else {
            x=x-1;
            y=0;
        }
        
        int x2 = Character.getNumericValue(posicionNueva.charAt(1));
        int y2 = Character.getNumericValue(posicionNueva.charAt(0));
        
                if(deck[y][x].equals(tablero[y2][x2])){
            System.out.println("si es posible");
            
            deck[y][x].equals("");
            boton(PosAntigua).setIcon(null);
            return true;
        }
        return false;
    }
    
    private boolean sePuedeUtilizarJack(String posAntigua) {
        int x = Character.getNumericValue(posAntigua.charAt(1));
        int y;
        if (x>3) {
            y=1;
            x=x-4;
        } else {
            x=x-1;
            y=0;
        }
        
        char letra=deck[y][x].charAt(0);
        if(letra=='J'){
            System.out.println("SI es posible");
            
            deck[y][x].equals("");
            boton(posAntigua).setIcon(null);
            return true;
        }
        return false;
    }
    
    private void guardarFichaUtilizada(String posNueva, int num) {
        int x2 = Character.getNumericValue(posicionNueva.charAt(1));
        int y2 = Character.getNumericValue(posicionNueva.charAt(0));
        
        CU.add(tablero[y2][x2]);
        Tablero.CardUsed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/"+CU.get(num)+".png")));
    }
    
    private void ponerNuevaCarta(ArrayList nombreMazo,String posAntigua) {
        int x = Character.getNumericValue(posicionAntigua.charAt(1));
        int y;
        if (x>3) {
            y=1;
            x=x-4;
        } else {
            x=x-1;
            y=0;
        }
        int index = random.nextInt(CM.size());
        nombreMazo.remove(deck[y][x]);
        nombreMazo.add(CM.get(index));
        deck[y][x].equals(CM.get(index));
        boton(posAntigua).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+CM.get(index)+".png")));
        CM.remove(index);
    }
    
    private void agarrarNuevaCartaDeMazo(ArrayList nombreMazo, String posAntigua) {
        int x = Character.getNumericValue(posicionAntigua.charAt(1));
        int y;
        if (x>3) {
            y=1;
            x=x-4;
        } else {
            x=x-1;
            y=0;
        }
        int index = random.nextInt(CM.size());
        for (int i=0; i<nombreMazo.size(); i++) {
            if (nombreMazo.get(i).equals(deck[y][x])) {
                nombreMazo.set(i, CM.get(index));
            }
        }
        String nuevaCarta=CM.get(index);
        deck[y][x]=nuevaCarta;

        
        boton(posAntigua).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+CM.get(index)+".png")));
        CM.remove(index);
         for(Object carta: nombreMazo) {
             System.out.println(carta);
         }
    }
    
    private void cambiarTurno(){
        if(turno.equals("Jugador1")){
            CambiarMazoEnPantalla(mazo2);
            turno="Jugador2";
            Tablero.NombreMazoTurno.setText(turno);
                    posicionNueva = null;
                    posicionAntigua = null;
                    posicionActual = null;            
        } else if (turno.equals("Jugador2")) {
            turno="Jugador3";
            CambiarMazoEnPantalla(mazo3);
            Tablero.NombreMazoTurno.setText(turno);
                    posicionNueva = null;
                    posicionAntigua = null;
                    posicionActual=null;
        } else if (turno.equals("Jugador3")){
            turno="Jugador4";
            CambiarMazoEnPantalla(mazo4);
            Tablero.NombreMazoTurno.setText(turno);
                    posicionNueva = null;
                    posicionAntigua = null;
                    posicionActual=null;            
        } else if (turno.equals("Jugador4")) {
            turno="Jugador1";
            CambiarMazoEnPantalla(mazo1);
            Tablero.NombreMazoTurno.setText(turno);
                    posicionNueva = null;
                    posicionAntigua = null;
                    posicionActual=null;
        }
    }
    
    private void asignarCartas(ArrayList nombre) {
        int w = 0;
        int z = 0;
        for (int i = 0; i != 6; i++) {
                    int index = random.nextInt(CM.size());
                    nombre.add(CM.get(index));
                    CM.remove(index);
                    
                    z++; 
                    if (z >= 3) {
                        z = 0;
                        w++;
                    }
            }
    }

    private void CambiarMazoEnPantalla(ArrayList nombre) {
        int n=0;
        for (int i = 0; i <2; i++) {
                for (int j = 0; j <3; j++) {
                    ponerImagenStringDeck(i,j,"C"+(n+1),nombre.get(n).toString(),nombre.get(n).toString()+".png");
                    
                    n=n+1;
                }  
            }
    }
    
    private void iniciarCronometro() {
        Timer timer;
        timer = new Timer();
        segundos = 0;

        TimerTask task = new TimerTask() {
            public void run() {
                segundos++;
                int minutos = segundos / 60;
                int segundosRestantes = segundos % 60;
                String formatoTiempo = String.format("%02d:%02d", minutos, segundosRestantes);
                Tablero.tiempoLabel.setText(formatoTiempo);
                if(minutos ==2){
                    cambiarTurno();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
            
    public String getBotonPosicionString(Object boton) {
    if (boton == Tablero.jButton1) {
        return "00";
    } else if (boton == Tablero.jButton2) {
        return "01";
    } else if (boton == Tablero.jButton3) {
        return "02";
    } else if (boton == Tablero.jButton4) {
        return "03";
    } else if (boton == Tablero.jButton5) {
        return "04";
    } else if (boton == Tablero.jButton6) {
        return "05";
    } else if (boton == Tablero.jButton7) {
        return "06";
    } else if (boton == Tablero.jButton8) {
        return "07";
    } else if (boton == Tablero.jButton9) {
        return "08";
    } else if (boton == Tablero.jButton10) {
        return "09";
    } else if (boton == Tablero.jButton11) {
        return "10";
    } else if (boton == Tablero.jButton12) {
        return "11";
    } else if (boton == Tablero.jButton13) {
        return "12";
    } else if (boton == Tablero.jButton14) {
        return "13";
    } else if (boton == Tablero.jButton15) {
        return "14";
    } else if (boton == Tablero.jButton16) {
        return "15";
    } else if (boton == Tablero.jButton17) {
        return "16";
    } else if (boton == Tablero.jButton18) {
        return "17";
    } else if (boton == Tablero.jButton19) {
        return "18";
    } else if (boton == Tablero.jButton20) {
        return "19";
    } else if (boton == Tablero.jButton21) {
        return "20";
    } else if (boton == Tablero.jButton22) {
        return "21";
    } else if (boton == Tablero.jButton23) {
        return "22";
    } else if (boton == Tablero.jButton24) {
        return "23";
    } else if (boton == Tablero.jButton25) {
        return "24";
    } else if (boton == Tablero.jButton26) {
        return "25";
    } else if (boton == Tablero.jButton27) {
        return "26";
    } else if (boton == Tablero.jButton28) {
        return "27";
    } else if (boton == Tablero.jButton29) {
        return "28";
    } else if (boton == Tablero.jButton30) {
        return "29";
    } else if (boton == Tablero.jButton31) {
        return "30";
    } else if (boton == Tablero.jButton32) {
        return "31";
    } else if (boton == Tablero.jButton33) {
        return "32";
    } else if (boton == Tablero.jButton34) {
        return "33";
    } else if (boton == Tablero.jButton35) {
        return "34";
    } else if (boton == Tablero.jButton36) {
        return "35";
    } else if (boton == Tablero.jButton37) {
        return "36";
    } else if (boton == Tablero.jButton38) {
        return "37";
    } else if (boton == Tablero.jButton39) {
        return "38";
    } else if (boton == Tablero.jButton40) {
        return "39";
    } else if (boton == Tablero.jButton41) {
        return "40";
    } else if (boton == Tablero.jButton42) {
        return "41";
    } else if (boton == Tablero.jButton43) {
        return "42";
    } else if (boton == Tablero.jButton44) {
        return "43";
    } else if (boton == Tablero.jButton45) {
        return "44";
    } else if (boton == Tablero.jButton46) {
        return "45";
    } else if (boton == Tablero.jButton47) {
        return "46";
    } else if (boton == Tablero.jButton48) {
        return "47";
    } else if (boton == Tablero.jButton49) {
        return "48";
    } else if (boton == Tablero.jButton50) {
        return "49";
    } else if (boton == Tablero.jButton51) {
        return "50";
    } else if (boton == Tablero.jButton52) {
        return "51";
    } else if (boton == Tablero.jButton53) {
        return "52";
    } else if (boton == Tablero.jButton54) {
        return "53";
    } else if (boton == Tablero.jButton55) {
        return "54";
    } else if (boton == Tablero.jButton56) {
        return "55";
    } else if (boton == Tablero.jButton57) {
        return "56";
    } else if (boton == Tablero.jButton58) {
        return "57";
    } else if (boton == Tablero.jButton59) {
        return "58";
    } else if (boton == Tablero.jButton60) {
        return "59";
    } else if (boton == Tablero.jButton61) {
        return "60";
    } else if (boton == Tablero.jButton62) {
        return "61";
    } else if (boton == Tablero.jButton63) {
        return "62";
    } else if (boton == Tablero.jButton64) {
        return "63";
    } else if (boton == Tablero.jButton65) {
        return "64";
    } else if (boton == Tablero.jButton66) {
        return "65";
    } else if (boton == Tablero.jButton67) {
        return "66";
    } else if (boton == Tablero.jButton68) {
        return "67";
    } else if (boton == Tablero.jButton69) {
        return "68";
    } else if (boton == Tablero.jButton70) {
        return "69";
    } else if (boton == Tablero.jButton71) {
        return "70";
    } else if (boton == Tablero.jButton72) {
        return "71";
    } else if (boton == Tablero.jButton73) {
        return "72";
    } else if (boton == Tablero.jButton74) {
        return "73";
    } else if (boton == Tablero.jButton75) {
        return "74";
    } else if (boton == Tablero.jButton76) {
        return "75";
    } else if (boton == Tablero.jButton77) {
        return "76";
    } else if (boton == Tablero.jButton78) {
        return "77";
    } else if (boton == Tablero.jButton79) {
        return "78";
    } else if (boton == Tablero.jButton80) {
        return "79";
    } else if (boton == Tablero.jButton81) {
        return "80";
    } else if (boton == Tablero.jButton82) {
        return "81";
    } else if (boton == Tablero.jButton83) {
        return "82";
    } else if (boton == Tablero.jButton84) {
        return "83";
    } else if (boton == Tablero.jButton85) {
        return "84";
    } else if (boton == Tablero.jButton86) {
        return "85";
    } else if (boton == Tablero.jButton87) {
        return "86";
    } else if (boton == Tablero.jButton88) {
        return "87";
    } else if (boton == Tablero.jButton89) {
        return "88";
    } else if (boton == Tablero.jButton90) {
        return "89";
    } else if (boton == Tablero.jButton91) {
        return "90";
    } else if (boton == Tablero.jButton92) {
        return "91";
    } else if (boton == Tablero.jButton93) {
        return "92";
    } else if (boton == Tablero.jButton94) {
        return "93";
    } else if (boton == Tablero.jButton95) {
        return "94";
    } else if (boton == Tablero.jButton96) {
        return "95";
    } else if (boton == Tablero.jButton97) {
        return "96";
    } else if (boton == Tablero.jButton98) {
        return "97";
    } else if (boton == Tablero.jButton99) {
        return "98";
    } else if (boton == Tablero.jButton100) {
        return "99";
    }else if (boton == Tablero.jButton102) {
        return "C1";
    } else if (boton == Tablero.jButton103) {
        return "C2";
    } else if (boton == Tablero.jButton104) {
        return "C3";
    } else if (boton == Tablero.jButton105) {
        return "C4";
    } else if (boton == Tablero.jButton106) {
        return "C5";
    } else if (boton == Tablero.jButton107) {
        return "C6";
    } else if (boton == Tablero.Mazo) {
        return "discart";
    }
    return null;
}
    
    private JButton boton(String posicion) {
        if (posicion.equals("00")) {
            return Tablero.jButton1;
        }else if(posicion.equals("01")) {
            return Tablero.jButton2;
        }else if (posicion.equals("02")) {
            return Tablero.jButton3;
        } else if (posicion.equals("03")) {
            return Tablero.jButton4;
        } else if (posicion.equals("04")) {
            return Tablero.jButton5;
        } else if (posicion.equals("05")) {
            return Tablero.jButton6;
        } else if (posicion.equals("06")) {
            return Tablero.jButton7;
        } else if (posicion.equals("07")) {
            return Tablero.jButton8;
        } else if (posicion.equals("08")) {
            return Tablero.jButton9;
        } else if (posicion.equals("09")) {
            return Tablero.jButton10;
        } else if (posicion.equals("10")) {
            return Tablero.jButton11;
        } else if (posicion.equals("11")) {
            return Tablero.jButton12;
        } else if (posicion.equals("12")) {
            return Tablero.jButton13;
        } else if (posicion.equals("13")) {
            return Tablero.jButton14;
        } else if (posicion.equals("14")) {
            return Tablero.jButton15;
        } else if (posicion.equals("15")) {
            return Tablero.jButton16;
        } else if (posicion.equals("16")) {
            return Tablero.jButton17;
        } else if (posicion.equals("17")) {
            return Tablero.jButton18;
        } else if (posicion.equals("18")) {
            return Tablero.jButton19;
        } else if (posicion.equals("19")) {
            return Tablero.jButton20;
        } else if (posicion.equals("20")) {
            return Tablero.jButton21;
        } else if (posicion.equals("21")) {
            return Tablero.jButton22;
        } else if (posicion.equals("22")) {
            return Tablero.jButton23;
        } else if (posicion.equals("23")) {
            return Tablero.jButton24;
        } else if (posicion.equals("24")) {
            return Tablero.jButton25;
        } else if (posicion.equals("25")) {
            return Tablero.jButton26;
        } else if (posicion.equals("26")) {
            return Tablero.jButton27;
        } else if (posicion.equals("27")) {
            return Tablero.jButton28;
        } else if (posicion.equals("28")) {
            return Tablero.jButton29;
        } else if (posicion.equals("29")) {
            return Tablero.jButton30;
        } else if (posicion.equals("30")) {
            return Tablero.jButton31;
        } else if (posicion.equals("31")) {
            return Tablero.jButton32;
        } else if (posicion.equals("32")) {
            return Tablero.jButton33;
        } else if (posicion.equals("33")) {
            return Tablero.jButton34;
        } else if (posicion.equals("34")) {
            return Tablero.jButton35;
        } else if (posicion.equals("35")) {
            return Tablero.jButton36;
        } else if (posicion.equals("36")) {
            return Tablero.jButton37;
        } else if (posicion.equals("37")) {
            return Tablero.jButton38;
        } else if (posicion.equals("38")) {
            return Tablero.jButton39;
        } else if (posicion.equals("39")) {
            return Tablero.jButton40;
        } else if (posicion.equals("40")) {
            return Tablero.jButton41;
        } else if (posicion.equals("41")) {
            return Tablero.jButton42;
        } else if (posicion.equals("42")) {
            return Tablero.jButton43;
        } else if (posicion.equals("43")) {
            return Tablero.jButton44;
        } else if (posicion.equals("44")) {
            return Tablero.jButton45;
        } else if (posicion.equals("45")) {
            return Tablero.jButton46;
        } else if (posicion.equals("46")) {
            return Tablero.jButton47;
        } else if (posicion.equals("47")) {
            return Tablero.jButton48;
        } else if (posicion.equals("48")) {
            return Tablero.jButton49;
        } else if (posicion.equals("49")) {
            return Tablero.jButton50;
        } else if (posicion.equals("50")) {
            return Tablero.jButton51;
        } else if (posicion.equals("51")) {
            return Tablero.jButton52;
        } else if (posicion.equals("52")) {
            return Tablero.jButton53;
        } else if (posicion.equals("53")) {
            return Tablero.jButton54;
        } else if (posicion.equals("54")) {
            return Tablero.jButton55;
        } else if (posicion.equals("55")) {
            return Tablero.jButton56;
        } else if (posicion.equals("56")) {
            return Tablero.jButton57;
        } else if (posicion.equals("57")) {
            return Tablero.jButton58;
        } else if (posicion.equals("58")) {
            return Tablero.jButton59;
        } else if (posicion.equals("59")) {
            return Tablero.jButton60;
        } else if (posicion.equals("60")) {
            return Tablero.jButton61;
        } else if (posicion.equals("61")) {
            return Tablero.jButton62;
        } else if (posicion.equals("62")) {
            return Tablero.jButton63;
        } else if (posicion.equals("63")) {
            return Tablero.jButton64;
        } else if (posicion.equals("64")) {
            return Tablero.jButton65;
        } else if (posicion.equals("65")) {
            return Tablero.jButton66;
        } else if (posicion.equals("66")) {
            return Tablero.jButton67;
        } else if (posicion.equals("67")) {
            return Tablero.jButton68;
        } else if (posicion.equals("68")) {
            return Tablero.jButton69;
        } else if (posicion.equals("69")) {
            return Tablero.jButton70;
        } else if (posicion.equals("70")) {
            return Tablero.jButton71;
        } else if (posicion.equals("71")) {
            return Tablero.jButton72;
        } else if (posicion.equals("72")) {
            return Tablero.jButton73;
        } else if (posicion.equals("73")) {
            return Tablero.jButton74;
        } else if (posicion.equals("74")) {
            return Tablero.jButton75;
        } else if (posicion.equals("75")) {
            return Tablero.jButton76;
        } else if (posicion.equals("76")) {
            return Tablero.jButton77;
        } else if (posicion.equals("77")) {
            return Tablero.jButton78;
        } else if (posicion.equals("78")) {
            return Tablero.jButton79;
        } else if (posicion.equals("79")) {
            return Tablero.jButton80;
        } else if (posicion.equals("80")) {
            return Tablero.jButton81;
        } else if (posicion.equals("81")) {
            return Tablero.jButton82;
        } else if (posicion.equals("82")) {
            return Tablero.jButton83;
        } else if (posicion.equals("83")) {
            return Tablero.jButton84;
        } else if (posicion.equals("84")) {
            return Tablero.jButton85;
        } else if (posicion.equals("85")) {
            return Tablero.jButton86;
        } else if (posicion.equals("86")) {
            return Tablero.jButton87;
        } else if (posicion.equals("87")) {
            return Tablero.jButton88;
        } else if (posicion.equals("88")) {
            return Tablero.jButton89;
        } else if (posicion.equals("89")) {
            return Tablero.jButton90;
        } else if (posicion.equals("90")) {
            return Tablero.jButton91;
        } else if (posicion.equals("91")) {
            return Tablero.jButton92;
        } else if (posicion.equals("92")) {
            return Tablero.jButton93;
        } else if (posicion.equals("93")) {
            return Tablero.jButton94;
        } else if (posicion.equals("94")) {
            return Tablero.jButton95;
        } else if (posicion.equals("95")) {
            return Tablero.jButton96;
        } else if (posicion.equals("96")) {
            return Tablero.jButton97;
        } else if (posicion.equals("97")) {
            return Tablero.jButton98;
        } else if (posicion.equals("98")) {
            return Tablero.jButton99;
        } else if (posicion.equals("99")) {
            return Tablero.jButton100;
        } else if (posicion.equals("C1")) {
            return Tablero.jButton102;
        } else if (posicion.equals("C2")) {
            return Tablero.jButton103;
        } else if (posicion.equals("C3")) {
            return Tablero.jButton104;
        } else if (posicion.equals("C4")) {
            return Tablero.jButton105;
        } else if (posicion.equals("C5")) {
            return Tablero.jButton106;
        } else if (posicion.equals("C6")) {
            return Tablero.jButton107;
        } else if (posicion.equals("discart")) {
            return Tablero.Mazo;
        }
        return null;
    }
    
    private void ponerImagenString(int x, int y, String posicion, String nombre, String nombrePNG){
        tablero[x][y]=nombre;
        boton(posicion).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+nombrePNG)));
    }
    
    private void ponerFicha(String posicionNueva, String nombre, String nombrePNG){
        int x = Character.getNumericValue(posicionNueva.charAt(1));
        int y = Character.getNumericValue(posicionNueva.charAt(0));
        tablero[x][y]=nombre;
        boton(posicionNueva).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+nombrePNG)));
    }
    
    private void ponerImagenStringDeck(int x, int y, String posicion, String nombre, String nombrePNG){
        deck[x][y]=nombre;
        boton(posicion).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+nombrePNG)));
    }
    
    public void fichasMazo(){
        for(int i=0;i<2;i++) {
        CM.add("2Corazon");
        CM.add("2Diamantes");
        CM.add("2Picas");
        CM.add("2Trebol");
        CM.add("3Corazon");
        CM.add("3Diamantes");
        CM.add("3Picas");
        CM.add("3Trebol");
        CM.add("4Corazon");
        CM.add("4Diamantes");
        CM.add("4Picas");
        CM.add("4Trebol");
        CM.add("5Corazon");
        CM.add("5Diamantes");
        CM.add("5Picas");
        CM.add("5Trebol");
        CM.add("6Corazon");
        CM.add("6Diamantes");
        CM.add("6Picas");
        CM.add("6Trebol");
        CM.add("7Corazon");
        CM.add("7Diamantes");
        CM.add("7Picas");
        CM.add("7Trebol");
        CM.add("8Corazon");
        CM.add("8Diamantes");
        CM.add("8Picas");
        CM.add("8Trebol");
        CM.add("9Corazon");
        CM.add("9Diamantes");
        CM.add("9Picas");
        CM.add("9Trebol");
        CM.add("10Corazon");
        CM.add("10Diamantes");
        CM.add("10Picas");
        CM.add("10Trebol");
        CM.add("AsCorazon");
        CM.add("AsDiamantes");
        CM.add("AsPicas");
        CM.add("AsTrebol");
        CM.add("JCorazon");
        CM.add("JDiamantes");
        CM.add("JPicas");
        CM.add("JTrebol");
        CM.add("KCorazon");
        CM.add("KDiamantes");
        CM.add("KPicas");
        CM.add("KTrebol");
        CM.add("QCorazon");
        CM.add("QDiamantes");
        CM.add("QPicas");
        CM.add("QTrebol");
        }
    }
}
