public class Bird {
    private String name;     // класс птица является супер-классом для класса страус и ворона
    private Wings wings;

    public void walk() {
        System.out.println("Go-go-go!");
    }


    //создаем геттеры и сеттеры, так как поля у нас private. Т.е. для того чтобы можно было их назначить вне класса птица
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }


    //при создании конструктора в классе птица (alt+ins), если мы сразу хотим задавать переменные(поля) ИМЯ иКРЫЛЬЯ
    // тогда во всех классах наследниках необходимо также создавать конструктор и задавать значения полей, при этом
    // при создании конструктора будет ключевое слово super
/*      public Bird(String name, Wings wings) {
       this.name = name;
       this.wings = wings;
   }*/
}
