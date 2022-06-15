public class Wolf extends Animal {
    public void growl(String str) {
        System.out.println("I am Wolf " + str);
    }


    @Override
    public void growl() {
        System.out.println("I not hungry Wolf!");
    }

}
