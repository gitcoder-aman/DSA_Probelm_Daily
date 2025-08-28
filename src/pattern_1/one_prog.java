package pattern_1;

public class one_prog {

    public static void main(String[] args) {

//        int n = 6;
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print(n-j+1);
//            }
//            System.out.println();
//        }

   /*     int count = 1;
       for(int i = 1; i <= 5; i++){
           for(int j=1;j <= 5; j++){
               System.out.print(count);
               count++;
           }
           System.out.println();
       }*/

        /* *
         **
         ***
         ****
         *****
         */
   /*     for(int i = 0; i < 5; i++){
            for(int j= 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
      /* 1
         23
         456
         78910
         */
  /*      int count = 1;
        for(int i = 1; i <= 5; i++){
            for(int j= 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }*/

    /*   1
         23
         345
         4567
         56789*/

    /*    int row  = 1;
        while(row <= 5){

            int column = 0;
            while(column < row) {
                System.out.print(row+column);
                column++;
            }
            System.out.println();
            row++;
        }*/

        /*
        1
        21
        321
        4321
        54321
         */
   /*     int row = 1;
        while(row <= 5){

            int col = 1;
            while(col <= row){
                System.out.print(row-col+1);
                col++;
            }
            System.out.println();
            row++;
        } */

        /*
        AAA
        BBB
        CCC
         */

     /*   int row  = 1;
        char ch = 'A';
        while(row <= 5){

            int col = 1;
            while(col <= 5){
                System.out.print(ch);
                col++;
            }
            System.out.println();
            ch++;
            row++;
        }*/

        /*
        ABC
        ABC
        ABC
         */
     /*   int row = 1;
        while(row <= 5){

            int col = 0;
            while (col < 5){
                char ch = (char) ('A' + col);
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }*/

        /*
        ABC
        BCD
        CDE
         */

     /*   int row = 0;
        while (row < 5) {

            int col = 0;
            while (col < 5) {

                char ch = (char) ('A' + row + col);
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }*/

        /*
        A
        BC
        CDE
        DEFG
         */

  /*    int row = 0;
        while (row < 5){

            int col = 0;
            while(col <= row){
                char ch = (char) ('A'+row+col);
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }*/

        /*
        D
        CD
        BCD
        ABCD
         */
      /*  int row = 1;
        while(row <= 4){

            int col = 0;
            char ch = (char) ('A'+4-row);
            while(col < row){
                System.out.print(ch);
                ch++;
                col++;
            }
            System.out.println();
            row++;
        }*/

        /*
        *
       **
      ***
     ****
    *****
         */
     /*   int row = 1;
        while(row <= 10){

            int col = 0;
            while(col < 10){

                if(col < 10-row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                col++;
            }
            System.out.println();

            row++;
        }*/

        /*
        *****
        ****
        ***
        **
        *
         */
     /*   int row = 0;
        while(row < 5){

            int col = 0;
            while(col < 5){

                if(col < 5-row) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }*/

     /*   int row = 1;
        while(row <= 4){

            int col = 1;
            while(col <= 4){

                if(col < row){
                    System.out.print(" ");
                }else {
                    System.out.print(row);
                }
                    col++;
            }
            System.out.println();
            row++;
        }*/
    /*    int row = 1;
        while(row <= 5){

            int col = 1;
            while (col <= 5){
                if(col > 5-row){
                    System.out.print(row);
                }else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }*/
     /*  int row = 0;
        while(row < 5){

            int col = 1;
            int count = row+1;
            while(col <= 5){
                if(col > row){
                    System.out.print(count);
                    count++;
                }else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }*/

     /*   int row = 0;
        int count = 1;
        while(row < 4){

            int col = 1;
            while (col <=4){

                if(col < 4-row){
                    System.out.print(" ");
                }else{
                    System.out.print(count);
                    count++;
                }
                col++;
            }
            System.out.println();
            row++;
        }*/

        int row = 1;
        while(row <= 5){

            int col = 0;
            while(col <= 5){
                if(col >= row) {
                    System.out.print(row);
                } else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
