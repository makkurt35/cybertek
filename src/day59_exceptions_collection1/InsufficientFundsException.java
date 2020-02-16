package day59_exceptions_collection1;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(){
        super();
    }

    public InsufficientFundsException(String desc){
        super(desc);
    }

}
