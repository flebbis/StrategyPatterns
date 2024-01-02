package StatePattern;

public class Off implements State{
    @Override
    public void powerbutton() {
        System.out.println("turning on phone");
    }

    @Override
    public void fingerPrintScanner() {
        System.out.println("turning on phone and unlocking");
    }
}
