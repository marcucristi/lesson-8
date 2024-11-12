package task2;

public class ClientInvoice {
    public static void main(String[] args) {

        Invoice inv = new Invoice("Phone", "A89", 3, 3894.65);

        System.out.println("Tipul achizitiei: " + inv.getModel());
        System.out.println("Descriptia: " + inv.getDescription());
        System.out.println("Cantitatea: " + inv.getQuantity());
        System.out.println("Pretul pentru o bucata: " + inv.getPrice());
        System.out.println("Suma totala a: " + inv.getAmount());
    }
}
