/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Ouma
 */
public class CalcDayOfRestException extends Exception{
    
    public CalcDayOfRestException() {
    }

    public CalcDayOfRestException(String message) {
        super(message);
    }

    public CalcDayOfRestException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcDayOfRestException(Throwable cause) {
        super(cause);
    }

    public CalcDayOfRestException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

