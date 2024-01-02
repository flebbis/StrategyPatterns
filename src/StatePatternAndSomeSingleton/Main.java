package StatePatternAndSomeSingleton;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.fingerPrintScannerClick();
        phone.powerButtonClick();
        phone.fingerPrintScannerClick();
        phone.fingerPrintScannerClick();

    }
}
