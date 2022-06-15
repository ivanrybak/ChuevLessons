//lesson3 class
class Operation {           //создали переменные разных типов, присвоили им значения
    Integer a = 5;
    Integer b = 7;
    Integer c;
    String str1 = "Hot";
    String str2 = " Java";
    String result;


    public void foo() {        //метод, который выполняет различные операции с переменными
        this.c = this.b % this.a;
        boolean v = this.a <= this.b;
        this.result = this.str1 + this.str2;
        System.out.println("\nLesson3");
        System.out.println(this.c);
        System.out.println(this.result);
        System.out.println(v);
    }
}
