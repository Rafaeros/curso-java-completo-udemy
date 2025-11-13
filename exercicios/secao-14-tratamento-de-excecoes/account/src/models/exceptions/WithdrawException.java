package models.exceptions;

import java.io.Serial;

public class WithdrawException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public WithdrawException(String message) {
        super(message);
    }
    
}
