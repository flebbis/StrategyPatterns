package DecoratorPattern;

public class Decorator implements iCombatCart{
    private final iCombatCart wrapped;
    Decorator(iCombatCart wrapped){this.wrapped = wrapped;}


    @Override
    public void gas() {
        wrapped.gas();
    }

    @Override
    public void breaks() {
        wrapped.breaks();
    }

    @Override
    public void fire() {
        wrapped.fire();
    }
}
