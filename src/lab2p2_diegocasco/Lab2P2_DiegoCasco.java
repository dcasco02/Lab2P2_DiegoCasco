/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegocasco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class Lab2P2_DiegoCasco {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas per =new Personas();
        ArrayList jugadores = new ArrayList();
        ArrayList<String> numrandom = new ArrayList();
        int opcion = 60;
        while (opcion != 0) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "0-Salida\n"
                            + "1-Crear Jugadores\n"
                            + "2-Listar Jugardores por posicion\n"
                            + "3-Listar Todo\n"
                            + "4-Jugar"));
            if (opcion == 1) {
                System.out.println("Ingrese el nombre del jugador: ");
                String n = lea.nextLine();
                jugadores.add(new Personas(n,0));
            }
            if (opcion == 2) {
                if (jugadores.size() == 0) {
                    System.out.println("No hay Jugadores");
                }else{
                    System.out.println("Ingrese la posicion que desea ver: ");
                    int p = lea.nextInt(); 
                    System.out.println(jugadores.get(p));
                }
            }if(opcion==3){
                imprimirrecursivo(jugadores, opcion);
            }if(opcion==4){
                int turnos=0;
                for(int i=0;i<4;i++){
                    numrandom.add(String.valueOf(0+r.nextInt(7))); 
                }
                while(turnos!=8){
                    
                }
            }
        }
    }
      public static void imprimirrecursivo (ArrayList jugadores, int i) {
        if (i == jugadores.size()-1) { System.out.println (jugadores.get(i)); }
        else {
            System.out.println(jugadores.get(i));
            imprimirrecursivo(jugadores,i+1);
        }       
    }
    
}
