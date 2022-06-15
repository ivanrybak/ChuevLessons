import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {


   public void foo(){
       //   System.out.println(1/0);
   //   int[]array={1,2,3};            //создали массив с с тремя значениями, далее пытаемся присвоить значение переменной не входящей
   //   array[5]=3;                    // в массив. Тогда при работе метода в консоли выдаст ошибку ArrayIndexOutOfBoundsException

       try {
           System.out.println(1 / 0);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }


 //обработка ошибок при создании потоков  ввода/вывод
    public void foo1() {             //создали метод, в котором создали поток и обработали возможные ошибки с помощью блока try/catch
        // нажав на лампочку перед строкой с потоком выбираем Surround with try/catch
        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }






    public void foo2() throws FileNotFoundException {      //создали метод, в котором создали поток и обработали возможные ошибки с помощью добавления в сигнатуру метода
        FileInputStream fileInputStream1=null;
       try {
        fileInputStream1 = new FileInputStream("");  //создали поток, но его значение необходимо вынести выше try
                                                             //и присвоить null, чтобы потом блок finally мог закрыть поток .close
    } catch (FileNotFoundException e) {
           e.printStackTrace();
       }finally {
           try {
               fileInputStream1.close();        //при записи fileInputStream1.close(); компилятор подсвечивает close(),
                                                //подсказывая необходимость использования блока try/catch при закритии потока
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }


   }







