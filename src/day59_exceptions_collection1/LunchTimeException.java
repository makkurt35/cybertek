package day59_exceptions_collection1;

public class LunchTimeException extends Exception{
    public LunchTimeException(){
        super();
    }
    public LunchTimeException(String msg){
        super(msg);
    }
}
