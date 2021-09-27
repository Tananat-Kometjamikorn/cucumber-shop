package ku.shop;

public class NotEnoughItemException extends Exception{
    public NotEnoughItemException() {}
    public NotEnoughItemException(String reason) {
        super(reason);
    }
}
