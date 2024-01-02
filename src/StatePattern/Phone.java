package StatePattern;

public class Phone {
    private State state;
    public Phone(){
        state = new Off();
    }


    public void powerButtonClick() {
        state.powerbutton();
    }

    public void fingerPrintScannerClick() {
        state.powerbutton();
    }
    void changeState(State state){
        this.state = state;
    }
}
