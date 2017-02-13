/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moes;

import java.util.Scanner;

/**
 *
 * 
 * https://hspt.ucfprogrammingteam.org/hsptFiles/problemSet2016.pdf
 * 
 * 
 * @author CCHS
 */
public class Moes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating a scanner for the program
        Scanner in = new Scanner(System.in);
        
        //Defining number of people coming through the door
        int c = in.nextInt();
        
        //Defining List of customers from user
        String[] customers = new String[c];
        for (int i = 0; i < c; i++){
            customers[i] = in.next();
        }
        
        boolean isNew = false;
        for (int i = 0; i < c; i++) {
            for (int x = 0; x < i; x++) {}
        }
    }
    
}
