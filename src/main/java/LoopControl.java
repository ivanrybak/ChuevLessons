//lesson6 class
class LoopControl {        //циклы while do
    // boolean value = true;
    int a = 5;
    int b = 7;

    public void foo() {
        do {                   //делать действие
            ++this.a;           //прибавляется единица к а
            System.out.println(this.a);
        } while (this.a < this.b);     //пока а меньше б

    }
}
