package TemplateMethodPattern;

public abstract class Super {
    public void algorithm(){
        dothis();
        dothat();
        specificThing();
    }
    public void dothis(){
        System.out.println("this");
    }
    public void dothat(){
        System.out.println("that");
    }
    public abstract void specificThing();
}
