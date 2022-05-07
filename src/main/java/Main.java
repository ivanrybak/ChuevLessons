public class Main {
    public static void main(String[] args) {
// lesson1 Введение в классы и объекты
Bus bus=new Bus();

bus.color="White ice";
bus.showColor();

//lesson2 Ссылочные типы данных. К ссылочным типам данных относятся строки, классы, массивы
//в java существует три области памяти: Stack, Heap, Permanent Generation
// Значения,примитивные переменные, ссылки хранятся в Stack.
// Объекты хранятся в Heap.
//У каждого примитивного типа есть класс оболочка. Ссылочные типы данных похожи на примитивные, но  пишутся с большой буквы:
Byte a;             //все ссылочные типы данных являются классами.(для просмотра инфы о классе нажать ctrl+leftMouse)
Short b;            //разница примитивных типов данных и ссылочных, состоит в том, что обратившись к ссылке,можно обратиться к методам данной переменной
Integer c;            //которых нет у примитивных типов
Long d;
Character i;
Float f;
Double g;
Boolean h;

//lesson3 Арифмитические и логические операции.
        //в классе Operation создали переменные. Создаем объект, вызываем его метод

Operation operation=new Operation();
operation.foo();
        System.out.println("Number Pi= "+Math.PI); //существует множество математических методов. в данном случае выводим число пи


//lesson4 Условные операторы if else
        //в классе ControlOperators создали и задали поля, а также метод,выполняющий некоторое условие. создаем объект,вызываем метод
        ControlOperators ctrlOper=new ControlOperators();
        ctrlOper.foo();


//lesson5 Оператор множественного выбора Switch/case (переключатель/кейсов)
        //в классе OperatorSwitch создали и проинициализировали 4 переменные. Далее создами метод в котором используем Switch/case

OperatorSwitch operatorSwitch=new OperatorSwitch();
        System.out.println("\nLesson5");
operatorSwitch.foo();
operatorSwitch.foo1();


//lesson6 Цикл do while   (делать пока)
LoopControl loopControl=new LoopControl();
        System.out.println("\nLesson6");
loopControl.foo();



//lesson7 Цикл for и for each (для каждого)
        ForLoop forLoop = new ForLoop();
        System.out.println("\nLesson7");
        forLoop.make();
        forLoop.foo();
      //  forLoop.foo1();

//lesson8 Масивы.  Массив это хранилище каких-либо данных(объектов)
        //создали два класса первый конфета(для создания объектов конфет)
        //второй MyArrays, в котором создаем массивы
        MyArrays myArrays=new MyArrays();
        System.out.println("\nLesson8");
        myArrays.foo();


//lesson9 Конструкторы. Конструктор это функция, которая используется при создании объекта.
//т.е. для инициализации полей объекта
        //создали два класса первый для создание объектов (цветок), второй для создания конструкторов
Constructor constructor=new Constructor();
        System.out.println("\nLesson9");
constructor.foo();

//lesson10  Модификаторы доступа  private default protected public
    //применимы как к классам, так и к их состовляющим(полям,методам,конструкторам)

        Modifiers modifiers=new Modifiers();
        String name=modifiers.name;
        modifiers.foo();
        modifiers.foo1();
    //при  обращении к вложенному классу private вклассе main выделяет крассным,т.е.не видит
//        Firstclass


//lesson11 Модификатор static
        //Поля и методы отмеченные модификатором статик относятся к классу, а на к объекту.
//Создали класс StaticVariablesAndMethods, задали ему static поле variable. Далее пробуем создать три объекта, полям котрых задать разные значения
        System.out.println("\nLesson10");
        StaticVariablesAndMethods a1=new StaticVariablesAndMethods();
        StaticVariablesAndMethods a2=new StaticVariablesAndMethods();
        StaticVariablesAndMethods a3=new StaticVariablesAndMethods();

        a1.variable=4;
        a2.variable=5;
        a3.variable=6;

        //если мы создадим 3 разных объекта и попытаемся задать разные значения полю variable,
        //то при выводе в консоль, получим одно и тоже значение переменных всех объектов
        //ввиду того,что модификатор доступа этого поля являкется статик
        System.out.print(a1.variable );
        System.out.print(a2.variable );
        System.out.println(a3.variable );
        //в консоли будет 6 6 6, так как компилятор присваеваетвсем объектам последнее (по очереди) значение переменной variable

        //чтобы обратиться к данному полю (переменной), то нужно обращаться не к объекту а к классу (StaticVariablesAndMethods.variable)
        StaticVariablesAndMethods.variable=3;


 //lesson12 Инкапсуляция
        Encapsulation encapsulation=new Encapsulation();         //создали объект, обратились к его методу,в консоли получили сумму а и б
        System.out.println("\nLesson12");
        encapsulation.setA(8);
        encapsulation.setB(8);

        System.out.println(encapsulation.showResault());
        System.out.println(encapsulation.getA());



        //чтобы можно было изменить значения переменных а и б, можно истользовать методы set(задать) и get(принять)
        //для этого в классе Encapsulation нажимаем alt+ins, выбираем на веладке getter and setter, далее выбираем необходимые переменные

     //   System.out.println(encapsulation.getA()); //здесь мы получаем, а далее выводим значение а в консоли



//lesson13 Класс Enum (перечисление)
 //класс енам позволяет хранить набор констант, как правило это константы объединенные каким-то смыслом(жанры музыки, дни недели,профессии,и т.д.)

        Music mc = Music.CLASSIC; //для того чтобы создать объект, необходимо в классе мэйн написать Music имя=Music.CLASSIC; т.е. без слова new.
        System.out.println("\nLesson13");
        //у класса Music есть методы, такие как values(),который возвращает массив всех перечислений
//создадим for rich,для этого создадим элементы
        for (Music element : Music.values()) {
            System.out.println(element);
            /* в консоли нам выдаст:
             CLASSIC
            ROCK
            POP  */
        }
//также существует ещё один статический метод valueOf, он тоже используется для создания объекта
        Music mc2=Music.valueOf(Music.class,"ROCK"); //название должно совпадать с названием константы перечисления
        System.out.println(mc2);

        //метот самого объекта mc ordinal() Это метод возвращает позицию самого объекта, т.е. порядковый номер согласно перечислению:
        // 0 1 2
        System.out.println(mc2.ordinal()); //в нашем случае выдаст 1

//использование switch case
        switch (mc){
            case CLASSIC:
                System.out.println("Classic");
                break;
            case POP:
                System.out.println("Pop");
                break;
            case ROCK:
                System.out.println("Rock");
                break;
            // в консоли выдаст Classic

        }
        //работа с полями объекта
        mc.getI();
        mc.getName();
      System.out.println(mc.getI()+mc.getName());  //выдаст 0null, так как в скобках ничего нет: mc.getI();  mc.getName();


//обратимся к созданному в классе Music методу foo

        mc.foo();


//lesson14 Наследование-это отношение между классами, при котором характеристики одного класса передаются другому классу
// без необходимости их повторного определения

        //создали два объекта(птицы), у которых есть класс родитель Birds (с полями имя и крылья). при этом у каждого объекта можно
        //вызвать свой метод, а можно вызвать метод класса Birds.

        Ostrich ostrich=new Ostrich();
        Crow crow=new Crow();

        ostrich.setName("ostrich");                       //у страуса доступен метод .walk и .hideHead, а также при наличии геттеров и сеттеров в классе Bird
        // доступны соответствующие поля. для примера задаем поле ИМЯ


        //можно создать страуса другим способом помимо Ostrich ostrich=new Ostrich(); :
        Bird ostrich2=new Bird();
        //этому страусу будут доступны методы класса птица, но методы класса Ostrich (например hideHead) недоступны

// необходимо знать, что все классы в java являются наследниками класса object,
//т.е. например при наборе crow. подсказка выдаст все доступные методы (класса object)
















    }
            }



// lesson1 class
 class Bus {                //создали класс автобус с полями,создали в классе мэйн объект и вызвали метод,которые показывает цвет
    public String model;
    public String color;

    public Bus() {
    }

    public void showColor() {
        System.out.println("Lesson1\n"+this.color);
    }
}

//lesson2 class
 class References {
    String str = "Моя строка";                    //объявили переменные str и str2 типа стринг (двумя способами).  по факту str и str2-это ссылки на объект
    String str2 = new String("Моя строка");


     public void foo() {
         new String("Моя строка");   //данная строка является самим объектом
    }
}

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
        } else if (this.b> this.a) {
            System.out.println("False");
        } else {
            System.out.println("AAA");
        }

    }
}

//lesson5 class
class OperatorSwitch {
    final int VALUE = 4;          //чтобы работать с переменными в switch/case, значения этих переменных должны быть константами
    final int FIRSTVALUE = 1;      //для этого пишется слово final, а сама переменная записывается большими буквами
    final int SECONDVALUE = 2;
    final int THIRDVALUE = 3;

    public void foo() {
        switch (2) {            //если число находящееся в switch, совпадает с числом, находяшимся в case
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);      //выполняется блок действий после case2: (2 3 default)
                break;                    //break останавливает дальнейшее выполнение действий.Поэтому его надо ставить после выполнения каждого кейса
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
        }

    }



    public void foo1() {
        switch (VALUE) {
            case VALUE:
                System.out.println("VALUE");
                break;
            case FIRSTVALUE:
                System.out.println(FIRSTVALUE);
                break;
            case SECONDVALUE:
                System.out.println("SECONDVALUE");
                break;
            case THIRDVALUE:
                System.out.println("THIRDVALUE");
                break;
            default:
                System.out.println("default");
        }
    }
}

//lesson6 class
   class LoopControl {        //циклы while do
   // boolean value = true;
    int a = 5;
    int b = 7;

    public void foo() {
        do {                   //делать действие
            ++this.a;           //прибавляется единица к а
            System.out.println(this.a);
        } while(this.a < this.b);     //пока а меньше б

    }
}
//lesson7 class
class ForLoop {    //цикл for эдентичен циклу while/do, но как-правило цикл for используется, когда известно точное число повторений

    public void make() {
        for (int i = 0; i < 8; i = i + 2) {     //i=0-объявление и инициализация переменной (счетчик), i<0-условие, далее выполняется тело метода, и только потом к i прибавляется число 2
            System.out.println(i);   // только потом в следующем цикле переменная увеличивается на 2
            //в консоль выдаст 0 2 4 6
        }
    }


    int[] array = new int[]{1, 2, 3, 6, -10};  //создали массив, присвоили его переменнным значения


    public void foo() {
        for (int i = 0; i < array.length; i++) {  //массив начинается с нулевого элемента, поэтому i=0, условие пока i<длинны массива, выводим тело. в следующем цикле  i=i+1
            System.out.println(array[i]);
        }
        //ниже пример упрощенной записи этого цикла
        //создали метод, в котором переменная элемент будет поочередно принимать все значения, находящиеся в данном массиве
        for (int element : array) {
            System.out.println(element); //выводим все элементы. в консоль выдаст 1 2 3 6 -10 (в столбик)
        }
    }

}

/*    public void foo1() {
        int[] var1 = this.array;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int element = var1[var3];
            System.out.println(element);

            for(int i = 0; i < this.array.length; ++i) {
                System.out.println(this.array[i]);
            }
        }

    }
}*/

//lesson8 classes  2 класса один MyArrays, второй Конфеты

     class Candy {
    }


    class MyArrays {                //массив можно создать двумя способами: с помощью слова new, с помощью прямой инициализации
        int[] array = new int[3];     // тип данных[] имя массива=new тип данных [кол-во объектов в массиве]
        Candy[] box = new Candy[5];    //массив коробка с (объектами) конфетами в кол-ве 5 штук
        int[] array2 = new int[]{10, 3, 7};  //прямая инициализация. массив array2 с тремя числами{10,3,7} (индексы чисел 0 1 2)

        //чтобы создать массив box2 с конфетами с помощью прямой инициализации, необходимо сначала создать объекты(конфеты)
        Candy candyFirst = new Candy();
        Candy candySecond = new Candy();
        Candy candyThird = new Candy();
        Candy[] box2={ candyFirst,candySecond,candyThird}; //создание  с помощью прямой инициализации
        Candy[] box3;   //просто создали массив box3 без инициализации



        public void foo() {
            Candy candy = new Candy();   //создали конфету
            box[0] = candy;               //положили конфету в коробку, под индексом 0
            System.out.println(box[0]);    //вывели конфету под индексом 0 в консоль
            System.out.println(box2[2]);   //вывели в консоль элемент под индексом 2(т.е. третий с нуля 0 1 2) из коробки box2
            //в консоль выдаст ссылку на объекты: Candy@5d624da6
            //Candy@1e67b872


            for (int i = 0; i < array2.length; ++i) { //цикл for используем для вывода в консоль всех элементов массива array2
                System.out.println(array2[i]);
            }

        }

        //многомерных массивов в Java не существует.Но существуют массивы массивов
        public void show() {
            int[][] arrayAr = new int[2][2];   //создание массива с размерностью 2 на 2
            int[][] arrayAr1 = {{1, 2}, {3, 4}};  //данный массив представляет собой следующий вид    1 2   индексы 00 01
            //                                                                                        3 4           10 11
            System.out.println(arrayAr1[0] [1]); //выводим первый элемент нулевого массива. Выдаст: 2
        }

    }
//lesson9 classes

//создаем класс цветок, задаем ему поля: название и цвет
class Flower {
    String name;
    String color;
    public Flower(){}   //создали конструктор "по-умолчанию"

    public Flower(String myName, String myColor) {    //создание конструктора, который принимает в себя параметры(две строки) имя, цвет
        this.name = myName;     //поле находящееся в нашем классе String name; принимает конструктор String myName
        this.color = myColor;   //поле класса String color; принимает конструктор String myColor
    }
}
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
//lesson10 class
//модификаторы доступа

 class Modifiers {    // модификаторы доступа: private default protected public
    //применимы как к классам, так и к их состовляющим(полям,методам,конструкторам)

    // модификатор public
    public String name;             //т.е. создав здесь поле, конструктор,метод - они становятся доступны в любои другом классе, например  Main
    public Modifiers(){};
    public void foo(){};


    //модификатор private
    //данный модификатор не применим к обычному классу, но применим к вложенному классу
    //при  обращении к вложенному классу private в классе main выделяет крассным,т.е.не видит
    //
    private class Firstclass{
        public String color;
    }
    // но мы имеем доступ Firstclass, вне вложенного класса, допустим создадим в общем классе метод foo1

    public void foo1(){
        Firstclass firstclass=new Firstclass();
        firstclass.color="Black";
        System.out.println(firstclass.color);
    }
//тоже самое и с полями: private String name; , конструкторами: private Modifiers(){};  ,  методами: private void foo(){}; - становятся недоступны в других классах

    // модификатор default
    //он не пишется, т.е.является модификатором по-умолчанию. этот класс и значения его объекта доступны только в этом пакете package
    // и мы не сможем создать объект в другом пакете
    class Modifiers1 {
        String name1;
        Modifiers1() {}
        void foo2() {}

    }

    //модификатор protected
    //он применим только вложенным или внутренним классам
    protected class Secondclass{}
    // если у нас есть класс наследник, и в нем есть методы поля конструкторы protected,
    // то эти свойства объекта будут доступны и в других пакетах

}

//lesson11 class
class StaticVariablesAndMethods {
    //модификатор доступа статик. он применим к классам,полям,методам,логическим блокам

    //статик поля. создадим переменную типа инт
    public static int variable;  //поля,как и методы с модификатором статик относятся к классу, а не к объекту
    //т.е.если мы создадим какие либо объекты нашего класса в классе мэйн, то у них у всех будет общее поле variable
    //и чтобы обратиться к данному полю, то нужно обращаться не к объекту а к классу (StaticVariablesAndMethods.variable)

    //статик методы. создадим переменную, затем создадим метод статик. и попробуем данную переменную в этом методе вывести
    public int variable1;

    public static void foo() {
        //  System.out.println(variable1.foo);  компилятор не дает этого сделать, так как
        //  в статическом методе мы не можем использовать поля(variable1), относящиеся к объекту
        // но мы можем бращаться к статическим полям(variable), так как они являются переменными класса, а не объекта
    }
    //еще в статических методах нельзя работать с обычными методами.

    public void show() {
        System.out.println("Something");
    }
  /*  public static void foo1() {
        show();                //не дает обратиться к методу шоу
    }*/

    // Но в нестатическом методе, мы можем использовать(обращаться) к статическому методу
    public void went() {
        foo();
    }

    //статические блоки. пишутся {}, и используются для инициализации полей. в них так же могут находиться и методы
    static {
        variable=foo1();
    }
    public static int foo1(){
        return 1;
    }
}

//lesson12 class

    class Encapsulation {
    //Инкапсуляция это принцип объединяющий данные и код, манипулирующий этими данными,а так же
    //защищающий данные от прямого доступа и неправильного использования
    private int a,b;         //создали 2 приватные переменные (можно присвоить им значения)
    public int showResault(){    //создали меод который будет показывать результат суммы a+b
        return a+b;
    }
    //чтобы можно было изменить значения переменных а и б непосредственно в классе мэйн, можно истользовать методы set(задать) и get(принять)
    //для этого в классе Encapsulation нажимаем alt+ins, выбираем на веладке getter and setter, далее выбираем необходимые переменные

    //при этом автоматически создаются методы, позволяющие менять значения переменных в классе мэйн, обратившись к этим методам

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

//lesson13 class

   enum Music {
    //класс енам позволяет хранить набор констант, как правило это константы объединенные каким-то смыслом(жанры музыки, дни недели,профессии,и т.д.)
    CLASSIC,ROCK,POP; //запишем несколько констант(пишутся с большой буквы),ВСЕ ОНИ ЯВЛЯЮТСЯ ОТДЕЛЬНЫМИ ОБЪЕКТАМИ.
    //для того чтобы создать объект, необходимо в классе мэйн написать Music имя=Music.CLASSIC; т.е. без слова new.

    //данный класс обладает некоторыми особенностями. создадим переменые
    private int i;
    private String name;
    // если создать конструктор alt+ins, то тогда необходимо инициализировать их у объекта, т.е. вместо CLASSIC,ROCK,POP; прописывать:
/*
    CLASSIC(5,"classic"),ROCK(3,"rock"),POP(7,"pop");

    Music(int i, String name) {
        this.i = i;
        this.name = name;
        */
//чтобы работать непосредственно с полями объекта в классе мэйн, необходимо использовать геттеры и сеттеры
    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    //класс enum может так же иметь и обычные методы, например создадим метод foo
    public void foo(){
        System.out.println("It's true!");
        //так же мы можем работать непосредственно с перечисленными объектами. Например
        System.out.println(Music.CLASSIC.getI());  //показать какой порядковый номет объекта. У нас CLASSIC под номером 0

    }
}


//lesson14  classes

//создаем класс птица, в котором задаем общие поля,характерные для всех птиц. имя и крылья

class Wings {   //создали класс крылья, для создания  крыльев (полей) у в классе птицы
}
 class Ostrich extends Bird { //класс страус приобрел все поля и методы класса птица(ключевое слово extends)

    //так же добавим к данному классу страус собственные методы (прятать голову)
    public void hideHead() {
        System.out.println("I ostrich and I scared!");
    }

    // при создании конструктора в классе птица(возможность сразу назначать значение полей), в классе-наследнике
    //тоже необходимо создаватьть конструктор
    // при создании конструктора будет ключевое слово super Пример
  /*   public Ostrich (String name, Wings wings){
     super (name,wings)
}*/
}
 class Crow extends Bird{
    public void fly(){
        System.out.println("I crow and I fly!");
    }

}

