import java.io.FileNotFoundException;

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
        System.out.println("\nLesson14");

        Ostrich ostrich=new Ostrich();
        Crow crow=new Crow();

        ostrich.setName("ostrich");                       //у страуса доступен метод .walk и .hideHead, а также при наличии геттеров и сеттеров в классе Bird
        // доступны соответствующие поля. для примера задаем поле ИМЯ


        //можно создать страуса другим способом помимо Ostrich ostrich=new Ostrich(); :
        Bird ostrich2=new Bird();
        //этому страусу будут доступны методы класса птица, но методы класса Ostrich (например hideHead) недоступны

// необходимо знать, что все классы в java являются наследниками класса object,
//т.е. например при наборе crow. подсказка выдаст все доступные методы (класса object)



//lesson15 Полиморфизм. Перегрузка и переопределение методов
        //статический полиморфизм это когда есть метод в родительском классе, и такой же метод в классе потомке(но с другим параметром)
        // в нашем случае создан метод рычать(growl) в классе животные, и такой же метод в классах волк и медведь, но при этом,
        //при вызове этого метода будут выполняться разные действия, в соответствии к какому классу он относится.

        System.out.println("\nLesson15");
        Animal bear=new Bear(); //создали объект медведь через родительский класс животное
        bear.growl();           //вызвали метод рычать. он будет относится к классу животное

        Animal wolf=new Wolf(); //создали объект волк через родительский класс животное
        wolf.growl();            //вызвали метод рычать. он будет относится к классу животное

        Bear bear1=new Bear();    //создали второго медведя через класс наследник Bear
        bear1.growl("Rrr");    //вызвали метод рычать(при нажатии bear1. -предлагает либо метод growl(), либо  growl(str))
// growl(str) будет относится к классу Bear. заодно добавили строку "Rrr"


        Wolf wolf1=new Wolf();      //создали второго волка через класс наследник Wolf
        wolf1.growl("rrr");       //вызвали метод рычать(при нажатии wolf1. -предлагает либо метод growl(), либо  growl(str)).
// growl(str) будет относится к классу Wolf. заодно добавили строку "rrr"


        //динамический полиморфизм-это когда происходит переопределение метода.т.е. если и у класса родителя и у класса наследника
        //метод с одним и темже названием. идем в класс медведь. нажимеам alt+ins, выбиваем Override methods,далее метод growl
        // затем убираем строчку со словом super(т.к.это для родительского класса). и пишем свою реализацию( например I hungry)
//тоже самое делаем в классе волк
        Beast beast=new Beast();
        beast.foo(wolf);



//lesson16 Абстрактные классы и методы. абстрактный класс-это класс,который содержит общий набор свойств и поведений, присущих одной группе
       //Создали абстрактный класс поезд, далее создали класс наследник электропоезд.
        //объект класса поезд не может быть создан, а объект класса наследника может
        //если мы создаем в абстрактном классе абстрактный метод, то в наслкднике этот метод необходимо сразу переопределить


/*
Train train=new Train() {
    @Override
    public int hashCode() {
        return super.hashCode();
    }
};
*/

        System.out.println("\nLesson16");

//но мы можем создать объект класса, являющегося наследником класса трейн
                ElectricTrain electricTrain = new ElectricTrain();
                Train electricTrain1 = new ElectricTrain(); //при такой записи функцианал будет ограничен возможностями абстрактного класса трейн
//нам будут недоступны методы класса ElectricTrain, если только они не переопределены
                electricTrain.drive();



//lesson17 Интерфейсы. Интерфейс создается как обычный класс, только вместо поля Class, выбирается interface
        //невозможно создать объект класса интерфейс, так же как и у абстрактного класса.
        //Можно создать метод(функцию интерфейса),а затем пользоваться этой функцией(переопределив её) в любом классе,
        //для этого в названии класса пишется implements. Причем, если мы реализуем в классе несколько интерфейсов, то они пишутся через
        //запятую: public class Mi8 extends Helicopter implements TakeOff,Landing{}

        //пример: создан абстрактный класс воздушный объект; далее его наследники абстрактные вертолет и самолет;
        //далее потомки соответственно ми8 и миг29

        System.out.println("\nLesson17");

        Mig29 mig29=new Mig29();   //создали объекты самолет, вертолет, нло
        Mi8 mi8=new Mi8();
        Ufo ufo=new Ufo();

        mi8.VerticalLanding();  //реализовали методы(VerticalLanding,VerticalTakeOff) интерфейсов(TakeOff и Landing) для объектов mi8 и ufo
        ufo.VerticalTakeOff();



//lesson18 класс String и его методы
        System.out.println("\nLesson18");

        // в пакете javalang есть нестолько классов для работы со строками: String, StringBuilder, StringBuffer
        // данные классы являются final, т.е. от них невозможно наследоваться
        //рассмотрим класс String. объекты которого можно создать двумя способами:
        String str1=new String("Hot Java"); //при нахождении курсора в скобках и нажатии ctrl+P, мы увидим все доступные конструкторы
        // мы запишем литерал, в ковычках
        String str2="Java"; //это второй способ, создали объект и присвоили ему название

        //РАССМОТРИМ МЕТОДЫ ОБЪЕКТА КЛАССА STRING:

        //Метод charAt()
        str1.charAt(0);
        System.out.println("charAt method: "+str1.charAt(0));
//данный метод принимает индекс и возвращает символ. т.е. в скобках у нас 0, а под индексом 0 в строке "Hot Java" символ H


        //Метод codePointAt()
        str1.codePointAt(2);
        System.out.println("codePointAt method: " +str1.codePointAt(2));
//данный метод возвращает int и принимает int. Возвращает символ в кодировке Unicode. под индексом 2 в нашей строке "Hot Java"
// буква t . В юникоде соответствует числу 116

        //метод compareTo()
        str1.compareTo(str2);
        System.out.println("compareTo method: "+str1.compareTo(str2));
//данный метод сравнивает одну строку с другой. Если строки одинаковые (в том числе большие и малые буквы), то выдаст число 0, если разные, то другое число.
        //в нашем случае сравниваем строку "Hot Java" с "Java" выдаст -2


        //метод compareToIgnoreCase()
        str1.compareToIgnoreCase(str2);
        System.out.println( "compareToIgnoreCase metod: "+str1.compareToIgnoreCase(str2));
//данный метод аналогичен предыдущему, за исключением того , при сравнении двух строк не учитывает большая или маленькая буква
//соответственно выдаст тоже -2

        //метод concat()
        str1.concat(str2);
        System.out.println("contact method: "+ str1.concat(str2));
        //данный метод прибавляет строку str1 к строке  str2. получим: Hot JavaJava
        // что соответствует записи str1+str2


        //метод equals()
        str1.equals(str2);
        System.out.println( "equals method: "+str1.equals(str2) );
        //данный метод принимает другой объект, возвращает тип boolean. сравнивает строки str1 и str2, если они одинаковые
        //то получаем true,если разные, то False. (При этом заглавные и строчные буквы считаются разные). у нас выдаст:False


        //метод equalsIgnoreCase()
        str1.equalsIgnoreCase(str2);
        System.out.println("equalsIgnoreCase method: "+str1.equalsIgnoreCase(str2)) ;
        //этот метод аналогичен предыдущиму, только при сравнении строк не берёт в счет заглавная или строчная буква
        //выдаст так же false


        //метод hashCode()
        str1.hashCode();
        System.out.println("hashCode method: "+ str1.hashCode());
//данный метод возвращает хэш-код объекта, в нашем случае объект-строка. в консоли получим хешкод строки Hot Java
// -285178283


        //метод indexOf()
        str1.indexOf(97);
        System.out.println("indexOf method: "+ str1.indexOf(97));
        //данный метод возвращает int и принимает ch. Эта переменная в кодировке юникод.Т.е. если данный символ совпадает
        // с символом в строке, то возвращается индекс данного символа в строке. Если в строке отсутствует символ,
        // совпадающий с юникодом, то получим : -1
        // Например в скобках пишем число(97). в юникоде числу 97 соответствует буква a, а в нашей строчке она под индексом 5
        // Hot Java
        // 01234567


        //метод isEmpty
        str1.isEmpty();
        System.out.println("isEmpty method: "+str1.isEmpty() );
//данный метод возвращает true, если длина строки равна нулю - "" . Если нет, то false
// в нашем случае строка не равно нулю. выдаст false


        //метод length()
        str1.length();
        System.out.println("length metod: "+str1.length() );
        //данный метод возвращает число символов в нашей строке. Hot_Java -у нас их 8 (считаются вместе с пробелами)
        //выдаст: 8

        //метод split()
//создаем массив strings,который будет принимать значение str1, и реализовать метод split
        String[]strings=str1.split("J");
        for (String element: strings){     //воспользуемся оператором for для проверки результата
            System.out.println("split method: "+ element);}
        //данный метод принимает какой-то разделитель, и возвращает массив стрингоф
        //в скобках приписали букву (J), значит наша строка разделится на:"до буквы J" и "после буквы J"
        //получим два массива. Первый:Hot_ ,второй:  ava


        //метод substring()
        str1.substring(2,8);
        System.out.println("substring metod: "+str1.substring(2,8) );
        //данный метод извлекает из нашей строчки подстрочку, длиной конечный индекс минус начальный
        //в нашем случае получаем подстрочку от индекса 2 до индекса 8: t_Java


        //метод toCharArray()
        str1.toCharArray();
        char[]charArray=str1.toCharArray();
        System.out.println("toCharArray metod: ");
        for (char elements:charArray) {
            System.out.println(elements);
        }
// данный метот разбирает строку на символы. Т.е. строку Hot Java разбираем посимвольно и заносим эти символы в массив
//затем каждый элемент char выводим в консоли. получим
/* H
   o
   t

   J
   a
   v
   a    */


        //метод toLowerCase()
        str1.toLowerCase();
        System.out.println("toLowerCase method: "+str1.toLowerCase() );
        //данный метод приводит нашу строку к строчным буквам. Получим: hot java

        //метод toUpperCase()
        str1.toUpperCase();
        System.out.println("toUpperCase method: "+ str1.toUpperCase() );
        //данный метод приводит нашу строку к заглавным  буквам. Получим: HOT JAVA

        //метод trim
        str1.trim();
        System.out.println("trim method: "+str1.trim() );
        //данный метод обрезает пробелы в начале и конце строки. в нашем случае их нет. выдаст Hot Java


        //МЕТОДЫ СТАТИЧЕСКОГО КЛАССА

        //метод valueOf()
        String.valueOf(65);
        System.out.println(" valueOf method: "+String.valueOf(65));
        //данный метод преобразует число в строку. т.е. в консоли выдаст 65 -уже тип строка
//что равнозначно записи String str1="65";

        //метод copyValueOf
        // String.copyValueOf();

        char[]array= {'H', 'o', 't',' ', 'J','a','v','a'};   //сохдали массив типа char, присвоили ему значения символов
        System.out.println("copyValueOf method: "+ String.copyValueOf(array));
//данный метод преобразует массив в строку. Получили  Hot Java



//lesson18 классы StringBuilder и StringBuffer

//с помощью методов и конструкторов, объекты данных классов можно преобразовать друг в друга
        //*Отличие стрингбилдера от стрингбафера, в том что билдер работает быстрее,но он менее потокобезопасен, чем бафер

//доступные конструкторы объекта класса StringBuilder( ctrl+P ) :  capacity (объём символов в буфере),  String str(создание строки),  charsequence seq (последовательность символов)

        //приведение объекта к строке:
        StringBuilder stringBuilder=new StringBuilder("Java"); // с помощью конструктора
        //              stringBuilder.toString("Java");                      // с помощью метода


        //задать объём доступного количества сиволов в буфере

        StringBuilder stringBuilder1=new StringBuilder(10);    //с помощью конструктора
        stringBuilder1.ensureCapacity(16);           //с помощью метода ensureCapacity()
        stringBuilder1.setLength(20);                                 //с помощью метода setLength()
        System.out.println(stringBuilder1.capacity());

        // append()  метод присвоения(прибавления) объекту какого-либо строкового значения:
        stringBuilder.append(" Hot");   //было   Java, а получили Java Hot. При этом в дальнейшем объект stringBuilder становится Java Hot


        //сложить две строки мы можем с использованием метода concat класса String ,например
        String str=new String("JAVA");
        str.concat("HOT");
        System.out.println(str.concat(" HOT"));  //  получим JAVA HOT
        System.out.println(str);                 //  объект str так и остаётся JAVA



        //insert() метод вставки символа в указанную позицию
        stringBuilder.insert(3,"S"); //после 3 символа поставили букву "S"
        System.out.println(stringBuilder);     //   Получили: "JavSa Hot"


        //delete() метод удаления символа(/символов) из строки
        stringBuilder.delete(1,6);  //либо один порядковый символ, либо удалить частьстроки (как у нас) с 1 по 6 символ
        System.out.println(stringBuilder);  //получим вместо JavSa Hot - JHot


        //reverse() метод перемены строки наоборот (в обратную сторону)
        stringBuilder.reverse();
        System.out.println(stringBuilder);    //получим из JHot- toHJ



//lesson19 Параметризация. Пример: необходимо создать 3 машины, у которых есть кузов и есть колеса. Но кузов будет один
        //а колеса у всех разные (Для разного покрытия)
        System.out.println("\nLesson19");

        Body body=new Body();                                //создали объект кузов
        WinterWheels winterWheels=new WinterWheels();        //создали объекты: зимние,летние,грязевые колеса
        SummerWheels summerWheels=new SummerWheels();
        DirtWheels dirtWheels=new DirtWheels();

        Car<WinterWheels>car=new Car<>(body,winterWheels);        //создали три машины, у которых в <> задаем необходимый параметр(тип) WinterWheels
        Car<SummerWheels>car1=new Car<>(body,summerWheels);       // этот тип передается в класс колеса, далее указываем поля в конструкторе
        Car<DirtWheels>car2=new Car<>(body,dirtWheels);          //с учетом заданного типа колес (body,winterWheels)

        car.getWheels().DrivingOnSnow();                 //задаем машинам геттеры колес, далее реализуем метод для каждого типа колес
        car1.getWheels().DrivingOnAsphalt();
        car2.getWheels().DrivingOnOffroad();



 //lesson20 Ошибки, исключения. Блоки Try/catch
        test test=new test();    //создали объект класса тест, вызвали его метод.А в методе прописано вывести 1/0
        //  test.foo();               // тогда в консоли выдаст ошибку by zero( данная ошибка относится к классу RunTimeException,
        //а значит ответственность за обработку ошибок данного класса лежит на программисте


        //   test.foo1();



     /*   try {              //вызвав метод test.foo2(); компилятор подсвечивает ошибку, так как в самом методе мы исключали ошибки
            test.foo2();         //с помощью выноса в сигнатуру метода, то и при вызове метода .foo2(), необходима обработка блоком try/catch
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/




    }
}




