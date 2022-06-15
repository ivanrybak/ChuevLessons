public class Bear extends Animal {

    public void growl(String str) {
        System.out.println("I am Bear " + str);

    }

    @Override
    public void growl() {
        System.out.println("I hungry Bear!");
    }

}
