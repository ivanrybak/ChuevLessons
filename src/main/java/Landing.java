public interface Landing { //интерфейс "посадка",реализует метод вертикальная посадка
    public void VerticalLanding(); //все методы интерфейса всегда являются абстрактными, и их нужно переопределять, когда их используем
}
//данный интерфейс можно реализовать в любом классе, переопределив его метод в соответствующем классе