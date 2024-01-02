package StrategyPattern;

public class User {
    private StrategyPattern strategyPattern;

    private void setStrategy(StrategyPattern strat){
        this.strategyPattern = strat;
    }
    public void hej()
    {
        strategyPattern.hej();
    }
    public void printaklass()
    {

        System.out.println(strategyPattern.printaklass());
    }

    public static void main(String[] args) {
        User user = new User();
        StrategyPatternEtt stratett = new StrategyPatternEtt();
        StrategyPatternTvå stratt2 = new StrategyPatternTvå();
        user.setStrategy(stratett);
        user.hej();
        user.printaklass();
        user.setStrategy(stratt2);
        user.hej();
        user.printaklass();
    }
}
