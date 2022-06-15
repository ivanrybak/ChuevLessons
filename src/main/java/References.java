//lesson2 class
class References {
    String str = "Моя строка";                    //объявили переменные str и str2 типа стринг (двумя способами).  по факту str и str2-это ссылки на объект
    String str2 = new String("Моя строка");


    public void foo() {
        new String("Моя строка");   //данная строка является самим объектом
    }
}
