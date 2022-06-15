public class ElectricTrain extends Train {      //создаем класс наследник.
    @Override                                    //если в классе родителе создать абстрактный метод, то строчка public class ElectricTrain extends Train, будет подчеркнута
    public void drive() {                           // и подскозка выдаст Implement methods. нажав на которое,в нашем классе ElectricTrain  переопределится метод класса трейн
        System.out.println("Drive ElectricTrain");
    }

}
