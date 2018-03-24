/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author stolman
 */
public class DailyHealthDrawControlException extends Exception{

    public DailyHealthDrawControlException() {
    }

    public DailyHealthDrawControlException(String message) {
        super(message);
    }

    public DailyHealthDrawControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DailyHealthDrawControlException(Throwable cause) {
        super(cause);
    }

    public DailyHealthDrawControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
