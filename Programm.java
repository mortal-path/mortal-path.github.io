public class Programm {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

//        Вводим переменную temp, куда записыванием значение переменной a
        int temp = a;   //temp == 5
//        Присваиваем переменной a значением переменной b
        a = b;  //a == 10
//        Присваиваем переменной и значение temp, куда ранее записали изначальное значение a
        b = temp;   //b == 5
        //карл у клары украл кораллы

        System.out.println("Значение а: " + a + ". Значение b: " + b);
        System.out.println("карлд украл кораллы");
    }
}