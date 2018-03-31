/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import mormontrail.MormonTrail;

/**
 *
 * @author TheChells
 */
public class MapReport {
    
    private static PrintWriter console = MormonTrail.getOutFile();

    public void display() {

        File mapFile = new File("mapFile.txt");

        try {
            PrintWriter output = new PrintWriter(mapFile);
            output.println("              Map Locations              \n"
                    + "-----------------------------------------\n"
                    + " Place                Distance from Navoo\n"
                    + "\n"
                    + " Garden Grove                128 miles\n"
                    + " Mount Pisgah                153 miles\n"
                    + " Kanesville                  255 miles\n"
                    + " Winter Quarters             265 miles\n"
                    + " Platte River                305 miles\n"
                    + " Fort Kearny                 469 miles\n"
                    + " Chimney Rock                718 miles\n"
                    + " Fort Laramie                788 miles\n"
                    + " Upper Platte River          914 miles\n"
                    + " Independence Rock           965 miles\n"
                    + " Martin's Cove               970 miles\n"
                    + " Green River                1128 miles\n"
                    + " Fort Bridger               1183 miles\n"
                    + " Bear River                 1216 miles\n"
                    + " Salt Lake Valley           1297 miles\n");
            output.close();
            console.println ("report succesfully printed to file mapFile.txt");
        } catch (IOException ex) {
            ErrorView.display ("MapReport", ex.getMessage());
        }

    }
}
