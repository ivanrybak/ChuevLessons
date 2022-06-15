//создаем класс цветок, задаем ему поля: название и цвет
class Flower {
    String name;
    String color;

    public Flower() {
    }   //создали конструктор "по-умолчанию"

    public Flower(String myName, String myColor) {    //создание конструктора, который принимает в себя параметры(две строки) имя, цвет
        this.name = myName;     //поле находящееся в нашем классе String name; принимает конструктор String myName
        this.color = myColor;   //поле класса String color; принимает конструктор String myColor
    }
}
