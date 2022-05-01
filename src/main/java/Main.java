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
