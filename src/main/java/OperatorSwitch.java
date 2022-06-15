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
