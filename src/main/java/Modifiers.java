class Modifiers {    // модификаторы доступа: private default protected public
    //применимы как к классам, так и к их состовляющим(полям,методам,конструкторам)

    // модификатор public
    public String name;             //т.е. создав здесь поле, конструктор,метод - они становятся доступны в любои другом классе, например  Main

    public Modifiers() {
    }

    ;

    public void foo() {
    }

    ;


    //модификатор private
    //данный модификатор не применим к обычному классу, но применим к вложенному классу
    //при  обращении к вложенному классу private в классе main выделяет крассным,т.е.не видит
    //
    private class Firstclass {
        public String color;
    }
    // но мы имеем доступ Firstclass, вне вложенного класса, допустим создадим в общем классе метод foo1

    public void foo1() {
        Firstclass firstclass = new Firstclass();
        firstclass.color = "Black";
        System.out.println(firstclass.color);
    }
//тоже самое и с полями: private String name; , конструкторами: private Modifiers(){};  ,  методами: private void foo(){}; - становятся недоступны в других классах

    // модификатор default
    //он не пишется, т.е.является модификатором по-умолчанию. этот класс и значения его объекта доступны только в этом пакете package
    // и мы не сможем создать объект в другом пакете
    class Modifiers1 {
        String name1;

        Modifiers1() {
        }

        void foo2() {
        }

    }

    //модификатор protected
    //он применим только вложенным или внутренним классам
    protected class Secondclass {
    }
    // если у нас есть класс наследник, и в нем есть методы поля конструкторы protected,
    // то эти свойства объекта будут доступны и в других пакетах

}
