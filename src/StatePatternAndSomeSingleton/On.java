package StatePatternAndSomeSingleton;

public class On implements State{
    private static On onInstance;
    public static On getInstance() {
        if (onInstance == null)
            onInstance = new On();
        return onInstance;
    }

    @Override
    public State powerbutton() {
        System.out.println("tunring off phone");
        return Off.getInstance();
    }

    @Override
    public State fingerPrintScanner() {
        System.out.println("Phone already unlocked");
        return onInstance;
    }
}
