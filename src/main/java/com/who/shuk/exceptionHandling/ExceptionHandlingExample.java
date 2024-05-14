package com.who.shuk.exceptionHandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        AmountAdder.addAmounts(new Amount("INR",4), new Amount("USD",5));

    }
}
class Amount{
    String currency;
    long amount;
    public Amount(String currency, long amount) {
        this.currency = currency;
        this.amount = amount;
    }
}
class AmountAdder{
    static Amount addAmounts(Amount amount1, Amount amount2){
        if(!amount2.currency.equals(amount1.currency)){
            //throw new RuntimeException("Currencies do not match"); //unchecked - thus no compiler msg to handle the exception
            /*if throw new Exception("Currencies do not match");
            checked - thus compiler gives msg to handle the exception: Unhandled exception: java.lang.Exception
            Also, the calling method(main method) needs to handle the exception
             */
        }
        return new Amount(amount2.currency,amount1.amount+amount2.amount);
    }

}
