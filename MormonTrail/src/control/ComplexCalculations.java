/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author scott
 */
public class ComplexCalculations {
    public static int huntSuccess(int huntingSkill, int wildLife) {
        if (huntingSkill > 0 && huntingSkill < 11 && wildLife > 0 && wildLife < 11) {
            return huntingSkill * wildLife;
        }
        else
            return -1; // returning negative number as indication of invalid arguments
    }
}