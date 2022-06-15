public class Mi8 extends Helicopter implements TakeOff,Landing{ //ми8 наследник вертолета, а также реализует (implements) интерфейсы взлёт и посадка
    @Override
    public void fly() {               //так как метод флай из абстрактного класса, то мы его переопределяем
        System.out.println("Mi8");

    }

    @Override
    public void VerticalTakeOff() {       //так как метод вертикальный взлет из интерфейса, то мы его переопределяем
        System.out.println("Mi8 VerticalTakeOff");

    }

    @Override
    public void VerticalLanding() {    //так как метод вертикалая посадка из интерфейса, то мы его переопределяем
        System.out.println("Mi8 VerticalLanding");
    }
}
