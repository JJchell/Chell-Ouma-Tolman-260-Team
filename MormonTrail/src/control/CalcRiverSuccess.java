/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.CalcRiverSuccessException;
/**
 *
 * @author TheChells
 */
public class CalcRiverSuccess {
    
    public static int calcRiverSuccess(int weightOfWagon, int depthOfRiver, 
            int randomNumber, int strenghtOfOxen)
            throws CalcRiverSuccessException{
            if (weightOfWagon > 13 && weightOfWagon < 33 && depthOfRiver > 12 &&
            depthOfRiver < 48 && randomNumber > 1 && randomNumber < 25 &&
            strenghtOfOxen > 1 && strenghtOfOxen < 40) {
            return (weightOfWagon + depthOfRiver + randomNumber) - strenghtOfOxen;
       }
        else
            throw new CalcRiverSuccessException("ERROR: No Calculation Made"); 
    }
    
}
