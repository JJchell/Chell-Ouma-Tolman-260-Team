/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import mormontrail.MormonTrail;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ouma
 */
public class CharacterList{

    private static PrintWriter console = MormonTrail.getOutFile();

    public void display() {

        File characterFile = new File("characterFile.txt");

        try {
            PrintWriter output = new PrintWriter(characterFile);
            output.println("---------List of Characters--------\n"
                    + "-----------------------------------------\n"
                    + " Name                Level of Coolness\n"
                    + "\n"
                    + " Main Character              5\n"
                    + " James                       10\n"
                    + " Shelly                      10\n"
                    + " Scott                       10\n");
            output.close();
            console.println ("Report printed to characterFile.txt");
        } catch (IOException ex) {
            ErrorView.display ("CharacterList", ex.getMessage());
        }
    }
}
