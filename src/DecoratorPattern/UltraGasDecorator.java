package DecoratorPattern;

public class UltraGasDecorator extends Decorator{
    UltraGasDecorator(iCombatCart wrapped) {
        super(wrapped);
    }
    @Override
    public void gas(){
        System.out.println("WE GASSSIN BOYS");}
}
