package day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(){
        super ();
    }
public NotEnoughMoneyException(String msg){
        super(msg);
}
}

