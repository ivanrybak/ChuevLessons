class Constructor {

    public void foo() {
        Flower flower = new Flower();    //создали цветок с помощью конструктора "по-умолчанию"
        flower.name = "Ромашка";         //задали цветку название
        flower.color = "Белая";           //задали цветку цвет
        Flower flower2 = new Flower("Роза", "красная");      //создали flower2 и сразу передали в конструктор имя и цвет
        Flower flower3 = new Flower("Тюльпан", "Желтый");    //создали flower3 и сразу передали в конструктор имя и цвет
        System.out.println(flower.name + " " + flower.color);               //выводим в консоль значения объектов (имя и цвет)
        System.out.println(flower2.name + " " + flower2.color);
        System.out.println(flower3.name + " " + flower3.color);
    }
}
