class Car<T extends Wheels> {  //данной записью мы создали класс машина, в котором параметр Т будет унаследован от класса колеса
    private Body body;    //создали переменные(поля) кузов, и некий неопределённый параметрТ (тип)  колёс.
    private T wheels;

    public Car(Body body, T wheels) {   //создали конструктор
        this.body = body;
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }            //создали геттеры и сеттеры

    public void setBody(Body body) {
        this.body = body;
    }

    public T getWheels() {
        return wheels;
    }

    public void setWheels(T wheels) {
        this.wheels = wheels;
    }
}
