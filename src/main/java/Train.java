public abstract class Train {  //абстрактный класс-это класс,который содержит общий набор свойств и поведений, присущих одной группе
    //ключевое слово abstract
    private String name;


    //абстрактные классы могут иметь или не иметь абстрактные методы
    public abstract void drive();  //при этом,абстрактные методы не имеют (){тела}
    public void show(){
        System.out.println("wagons");
    }
}
