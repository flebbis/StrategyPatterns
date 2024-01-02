package StatePatternAndSomeSingleton;

public class Phone {
    private State state;
    public Phone(){
        state = Off.getInstance();
    }


    public void powerButtonClick() {
        changeState(state.powerbutton());
    }

    public void fingerPrintScannerClick() {
        changeState(state.fingerPrintScanner());
    }
    void changeState(State state){
        this.state = state;
    }
}
