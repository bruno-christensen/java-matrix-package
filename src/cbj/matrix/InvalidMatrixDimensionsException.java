package cbj.matrix;

public class InvalidMatrixDimensionsException extends Exception {
    public InvalidMatrixDimensionsException() {
        super();
    }

    public InvalidMatrixDimensionsException(String message) {
        super(message);
    }

    public InvalidMatrixDimensionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMatrixDimensionsException(Throwable cause) {
        super(cause);
    }

    public InvalidMatrixDimensionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
