package DecoratorPattern;

public class BasicCart implements iCombatCart{
    public void gas(){
        System.out.println("slowly gassing");
    }
    public void fire(){
        System.out.println("shooting mere peas");
    }
    public void breaks()
    {
        System.out.println("IM BREAKING IN THIS SHIT");
    }
}
