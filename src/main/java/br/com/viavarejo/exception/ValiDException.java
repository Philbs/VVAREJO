package br.com.viavarejo.exception;

public class ValiDException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 8888197183613580128L;

    public ValiDException() {
        super();
    }

    public ValiDException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ValiDException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValiDException(String message) {
        super(message);
    }

    public ValiDException(Throwable cause) {
        super(cause);
    }
}
