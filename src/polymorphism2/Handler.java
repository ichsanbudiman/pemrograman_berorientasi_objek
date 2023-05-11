package polymorphism2;

public abstract class Handler {
    public boolean canHandle(Transaction transaction){
        if(transaction.equals(Transaction.PAYMENT))return true;
        return false;
    }

    public abstract void action(IPayment payment);
}
