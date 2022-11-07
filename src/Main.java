public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1,2

        int [] number1 = new int []{1, 2, 3,};
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;
        System.out.print(number1[0]);
        System.out.print(",");
        System.out.print(number1[1]);
        System.out.print(",");
        System.out.print(number1[2]);
        System.out.println();



        double [] doubleNumber = new double[]{1.57 , 7.654 ,9.986};
        doubleNumber[0]=1.57;
        doubleNumber[1]=7.654;
        doubleNumber[2]=9.986;

        System.out.print(doubleNumber[0]);
        System.out.print(",");
        System.out.print(doubleNumber[1]);
        System.out.print(",");
        System.out.print(doubleNumber[2]);
        System.out.println();



        int [] myMassive = new int[]{4 ,5 ,6 ,7};
        myMassive[0]=4;
        myMassive[1]=5;
        myMassive[2]=6;
        myMassive[3]=7;
        System.out.print(myMassive[0]);
        System.out.print(",");
        System.out.print(myMassive[1]);
        System.out.print(",");
        System.out.print(myMassive[2]);
        System.out.print(",");
        System.out.print(myMassive[3]);


        System.out.println();

        // Задача 3

        number1 = new int []{1, 2, 3,};
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;
        System.out.print(number1[2]);
        System.out.print(",");
        System.out.print(number1[1]);
        System.out.print(",");
        System.out.print(number1[0]);
        System.out.println();



        doubleNumber = new double[]{1.57 , 7.654 ,9.986};
        doubleNumber[0]=1.57;
        doubleNumber[1]=7.654;
        doubleNumber[2]=9.986;

        System.out.print(doubleNumber[2]);
        System.out.print(",");
        System.out.print(doubleNumber[1]);
        System.out.print(",");
        System.out.print(doubleNumber[0]);
        System.out.println();



        myMassive = new int[]{4 ,5 ,6 ,7};
        myMassive[0]=4;
        myMassive[1]=5;
        myMassive[2]=6;
        myMassive[3]=7;
        System.out.print(myMassive[3]);
        System.out.print(",");
        System.out.print(myMassive[2]);
        System.out.print(",");
        System.out.print(myMassive[1]);
        System.out.print(",");
        System.out.print(myMassive[0]);

        System.out.println("  ");


        // Задача 4

        number1 = new int []{1, 2, 3,};
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;


        for (int i = 0; i<3; i=i+1) {
            System.out.println(number1[i]+ 1);
        }


    }
}

