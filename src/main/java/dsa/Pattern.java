package dsa;

public class Pattern {

    public static void learnPattern(){

        int i =5;
        int j =4;

        /*
         ****
         ****
         ****
         ****
         ****
        */

//        for (int r = 0; r<i; r++){
//            for (int c = 0; c<j; c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         *
         **
         ***
         ****
         *****
        */

//        for (int r = 0; r<i; r++){
//            for (int c =0; c<=r; c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        1
        12
        123
        1234
        12345
        */

//        for (int r=1; r<=i; r++){
//            for (int c=1; c<=r; c++){
//                System.out.print(c);
//            }
//            System.out.println();
//        }

        /*
        1
        22
        333
        4444
        55555
         */

//        for (int r = 1; r <= i; r++){
//            for (int c =0; c<r; c++){
//                System.out.print(r);
//            }
//            System.out.println();
//        }

        /*
         *****
         ****
         ***
         **
         *
        */

//        for (int r = i; r>0; r--){
//            for (int c = r; c>0; c--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        12345
        1234
        123
        12
        1
        * */

//        for (int r = i; r>0; r--){
//            for (int c = 1; c<=r; c++){
//                System.out.print(c);
//            }
//            System.out.println();
//        }

        /*
             *
            ***
           *****
          *******
         *********
        */

//        for (int r = 1; r<=i; r++){
//            for (int c = 1; c<=i-r; c++){
//                System.out.print(" ");
//            }
//
//            for (int c =1; c<=2*r-1; c++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        /*
         *********
          *******
           *****
            ***
             *
         */

//        for (int r =0; r<i; r++ ){
//            for (int c=0; c<r; c++){
//                System.out.print(" ");
//            }
//
//            for (int c=0; c<2*(i-r)-1; c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
             *
            ***
           *****
          *******
         *********
         *********
          *******
           *****
            ***
             *
         */

//        for (int r = 1; r<=i; r++){
//            for (int c = 1; c<=i-r; c++){
//                System.out.print(" ");
//            }
//
//            for (int c =1; c<=2*r-1; c++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for (int r =0; r<i; r++ ){
//            for (int c=0; c<r; c++){
//                System.out.print(" ");
//            }
//
//            for (int c=0; c<2*(i-r)-1; c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
        */

//        for (int r=1; r<=2*i-1; r++){
//            int star=r;
//            if(r>i) star = i-(r-i);
//            for (int c= 1; c<=star; c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        1
        01
        101
        0101
        10101
        */

//        for (int r =1; r<=i; r++){
//            for (int c=1; c<=r; c++){
//                if((r+c)%2 == 0)System.out.print(1);
//                else System.out.print(0);
//            }
//            System.out.println();
//        }

        /*
        1      1
        12    21
        123  321
        12344321
        */
//        for (int r = 1; r<i; r++){
//            for (int c=1; c<=r; c++){
//                System.out.print(c);
//            }
//            for (int c=1; c<=2*(i-r-1); c++){
//                System.out.print(" ");
//            }
//            for (int c=r; c>0; c--){
//                System.out.print(c);
//            }
//            System.out.println();
//        }


        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
//        {
//            int count=1;
//            for (int r=1; r<=i; r++){
//                for (int c=1; c<=r; c++){
//                    System.out.print(count + " ");
//                    count++;
//                }
//                System.out.println();
//            }
//        }

        /*
        A
        AB
        ABC
        ABCD
        ABCDE
        */
//        for (int r = 1; r<=i; r++){
//            for (char ch = 'A'; ch<'A' +r; ch++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        /*
        ABCDE
        ABCD
        ABC
        AB
        A
        */

//        for (int r=i; r>0; r--){
//            for (char ch = 'A'; ch<'A'+r; ch++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        /*
        A
        BB
        CCC
        DDDD
        EEEEE
        */

//        for (int r = 1; r<=i; r++){
//            for (int c=1; c<=r; c++){
//                System.out.print((char)('A'+r-1));
//            }
//            System.out.println();
//        }

        /*
             A
            ABA
           ABCBA
          ABCDCBA
         ABCDEDCBA
        */
//        for (int r=1; r<=i; r++){
//            for (int c=1; c<=i-r; c++){
//                System.out.print(" ");
//            }
//
//            char ch='A';
//            int breakdown= (2*r+1)/2;
//
//            for (int c=1; c<=2*r-1; c++){
//                System.out.print(ch);
//
//                if (c<breakdown) ch++;
//                else ch--;
//
//            }
//            System.out.println();
//        }

        /*
        E
        ED
        EDC
        EDCB
        EDCBA
        */
//        for (int r=1; r<=i; r++){
//            char ch = (char)('A'+i-1);
//            for (int c=1; c<=r; c++){
//                System.out.print(ch);
//                ch--;
//            }
//            System.out.println();
//        }

        /*
         * * * * *
         *       *
         *       *
         *       *
         * * * * *
         */
//        for (int r = 1; r<=i; r++){
//            for (int c = 1; c<=i; c++){
//                if (r==1 || c==1 || r==i || c==i) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


    }
}
