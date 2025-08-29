package Lec_5_Bitwise;

public class Operator {

    public static void main(String[] args) {

      /*  int a,b=1;
        a = 10;
        ++a;
        System.out.println(a);//11
        System.out.println(b);//1
        System.out.println(++b);//2
       */

    /*    int a = 1;
        int b = 2;

        if(a-- > 0 || ++b > 2){  //if first condition check then true second condition not check then that's why value of b is not changed.
            System.out.println("Stage1-Inside If ");
        }else{
            System.out.println("Stage2-Inside else");
        }
        System.out.println(a + " "+ b);

     */
    /*    int number = 3;
        System.out.println(25 * (++number));

        int a = 1;
        int b = a++;
        int c = ++a;

        System.out.println(b); //1
        System.out.println(c); //3
     */

        //fibonacii Series

   /*     int firstValue = 0;
        int secondValue = 1;
        System.out.print(firstValue + " ");
        System.out.print(secondValue + " ");
        for (int i = 0; i <= 10; i++) {
            int nextValue = firstValue + secondValue;
            System.out.print(nextValue + " ");
            firstValue = secondValue;
            secondValue = nextValue;
        }
    */

        //prime Number check
    /*    int value = 11;
        boolean isPrime = false;
        for (int i = 2; i <= value / 2; i++) {   //2<=3

            if (value % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (isPrime) {
            System.out.println(value + " this value is not prime");
        } else {
            System.out.println(value + " this value is prime");
        }
     */
    }
}
