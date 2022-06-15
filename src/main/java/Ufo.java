public class Ufo implements TakeOff,Landing{    //создаем дополнительный класс нло, метод которого будет приниимать (например) интерфейс взлет
    public void up(TakeOff takeOff){     //и далее вызываем метод интерфейса .вертикальный взлет
        takeOff.VerticalTakeOff();
            }
        public void down(Landing landing){
        landing.VerticalLanding();
        }


    @Override
    public void VerticalLanding() {
        System.out.println("Ufo VerticalLanding");
    }

    @Override
    public void VerticalTakeOff() {
        System.out.println("Ufo VerticalTakeOff");
    }
}
