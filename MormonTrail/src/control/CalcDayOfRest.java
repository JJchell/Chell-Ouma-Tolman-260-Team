/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import exceptions.CalcDayOfRestException;

/**
 *
 * @author Ouma
 */
public class CalcDayOfRest {
      /**
    * This formula calculates how many days of rest based on current stamina
    * Stamina must be a positive number, greater than or equal to 0 and less than or equal to 10  
    * Output Number days rest needed based on current stamina 
    * @param stamina
    * @return 
     * @throws exceptions.CalcDayOfRestException 
    */
    public static int calcDayofRest (int stamina)
        throws CalcDayOfRestException{
        if (stamina >=0 && stamina <4)
            return 3;
        else if (stamina >= 4 && stamina <7)
            return 2;
        else if (stamina >= 7 && stamina <10)
            return 1;
        else if (stamina == 10)
            return 0;
        else
            throw new CalcDayOfRestException ("ERROR: Invalid Arguments");
    }
}
