/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import View.Menu;
import java.util.Scanner;


public class CopyFile extends Menu<String> {

    static String[] mc = {"Copy file", "Exit"};
    private Algorithm al;

    public CopyFile() {
        super("===== COPY FILE PROGRAM =====", mc);
        al = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                al.readFileConfig();
                break;
            case 2: 
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Please input another choice");
        }
    }
}
