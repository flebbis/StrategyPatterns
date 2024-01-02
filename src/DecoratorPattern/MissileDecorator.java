package DecoratorPattern;

public class MissileDecorator extends Decorator{
    MissileDecorator(iCombatCart wrapped) {
        super(wrapped);
    }
    @Override
    public void fire(){
        System.out.println("SENDING MISSILES");}
}
