package StatePatternAndSomeSingleton;

public class Off implements State{
    private Off(){}
    private static Off offInstance;
     public static Off getInstance() {
        if (offInstance == null)
                offInstance = new Off();
        return offInstance;
    }
    @Override
    public State powerbutton() {
        System.out.println("turning on phone");
        return On.getInstance();
    }

    @Override
    public State fingerPrintScanner() {
        System.out.println("turning on phone and unlocking");
        return On.getInstance();
    }
}
