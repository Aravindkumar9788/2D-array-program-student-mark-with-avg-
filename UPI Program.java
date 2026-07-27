abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void receipt() {
        System.out.println("Receipt generated");
        System.out.println("Amount paid: $" + amount);
    }

    void showPaymentStatus() {
        System.out.println("Payment successful");
    }
}

class UpiPayment extends Payment {
    private String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
    }
}

class CardPayment extends Payment {
    private String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing Card payment...");
        System.out.println("Card Number: **** **** **** "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UpiPayment(550.75, "deepan");
        Payment p2 = new CardPayment(1250.50, "1234567812345678");

        p1.pay();
        p1.receipt();
        p1.showPaymentStatus();

        System.out.println();

        p2.pay();
        p2.receipt();
        p2.showPaymentStatus();
    }
}
