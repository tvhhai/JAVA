package patterns.decorator;

public class InternationalDev extends DevDecorator {

    public InternationalDev(Developer decoratedDev) {
        super(decoratedDev);
    }

    @Override
    public void mySkills() {
        upgradedDev.mySkills();
        speakEnglish(upgradedDev);
    }

    private void speakEnglish(Developer decoratedDev){
        System.out.println("\tSpeaking English with clients");
    }
}