// lesson1 class
class Bus {                //создали класс автобус с полями,создали в классе мэйн объект и вызвали метод,которые показывает цвет
    public String model;
    public String color;

    public Bus() {
    }

    public void showColor() {
        System.out.println("Lesson1\n" + this.color);
    }
}
