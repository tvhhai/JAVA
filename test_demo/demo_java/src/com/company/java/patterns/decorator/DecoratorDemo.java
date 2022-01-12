package patterns.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        Developer frontendDev = new FrontendDev();

        Developer backendDev = new BackendDev();

        Developer internationalFrontendDev = new InternationalDev(new FrontendDev());

        Developer internationalBackendDev = new InternationalDev(new BackendDev());

        System.out.println("\nFrontendDev skills:");
        frontendDev.mySkills();

        System.out.println("\nBackendDev skills:");
        backendDev.mySkills();


        System.out.println("\nInternational frontend dev skills:");
        internationalFrontendDev.mySkills();

        System.out.println("\nInternational backend dev skills:");
        internationalBackendDev.mySkills();
    }
}