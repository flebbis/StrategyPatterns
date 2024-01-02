package StrategyPattern;

public class StrategyPatternEtt implements StrategyPattern {
    @Override
    public String printaklass() {
        return "Klass Ett";
    }

    @Override
    public void hej() {
        System.out.println("Hej från ett");
    }
}
