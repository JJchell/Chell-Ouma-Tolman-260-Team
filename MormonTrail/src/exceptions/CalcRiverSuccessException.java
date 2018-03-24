/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author TheChells
 */
public class CalcRiverSuccessException extends Exception{

    public CalcRiverSuccessException() {
    }

    public CalcRiverSuccessException(String message) {
        super(message);
    }

    public CalcRiverSuccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcRiverSuccessException(Throwable cause) {
        super(cause);
    }

    public CalcRiverSuccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
