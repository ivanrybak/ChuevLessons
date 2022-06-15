//lesson4 class
class ControlOperators {     //создали класс, создали переменные, присвоили им значения
    int a = 5;
    int b = 7;
    boolean value = false;

    public void foo() {
        System.out.println("\nLesson4");
        if (this.value) {                    //используем оператор сравнения переменных
            System.out.println("True");
            if (this.a < this.b) {
                System.out.println("Yes");
            }
        } else if (this.b > this.a) {
            System.out.println("False");
        } else {
            System.out.println("AAA");
        }

    }
}
