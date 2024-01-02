package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        iCombatCart cc = new MissileDecorator(new UltraGasDecorator(new BasicCart()));
        cc.fire();
        cc.gas();
        cc.breaks();
        //decorator
    }
}
