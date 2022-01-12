package patterns.decorator;

public abstract class DevDecorator implements Developer {
    protected Developer upgradedDev;

    public DevDecorator(Developer decoratedDev){
        this.upgradedDev = decoratedDev;
    }

    public void mySkills(){
        upgradedDev.mySkills();
    }
}