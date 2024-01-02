package StrategyPattern;

public class StrategyPatternTvå implements StrategyPattern{
    @Override
    public String printaklass() {
        return "Klass Två";
    }

    @Override
    public void hej() {
        System.out.println("hej från två");
    }
}
