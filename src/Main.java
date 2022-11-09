public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1,2

        int[] number1 = new int[]{1, 2, 3,};

        System.out.print(number1[0]);
        System.out.print(",");
        System.out.print(number1[1]);
        System.out.print(",");
        System.out.print(number1[2]);
        System.out.println();


        double[] doubleNumber = new double[]{1.57, 7.654, 9.986};

        System.out.print(doubleNumber[0]);
        System.out.print(",");
        System.out.print(doubleNumber[1]);
        System.out.print(",");
        System.out.print(doubleNumber[2]);
        System.out.println();


        int[] myMassive = new int[]{4, 5, 6, 7};

        System.out.print(myMassive[0]);
        System.out.print(",");
        System.out.print(myMassive[1]);
        System.out.print(",");
        System.out.print(myMassive[2]);
        System.out.print(",");
        System.out.print(myMassive[3]);


        System.out.println();

        // Задача 3

        number1 = new int[]{1, 2, 3,};

        System.out.print(number1[2]);
        System.out.print(",");
        System.out.print(number1[1]);
        System.out.print(",");
        System.out.print(number1[0]);
        System.out.println();


        doubleNumber = new double[]{1.57, 7.654, 9.986};


        System.out.print(doubleNumber[2]);
        System.out.print(",");
        System.out.print(doubleNumber[1]);
        System.out.print(",");
        System.out.print(doubleNumber[0]);
        System.out.println();


        myMassive = new int[]{4, 5, 6, 7};

        for (int i = 3; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myMassive[i] + ", ");
            } else {
                System.out.print(myMassive[i]);
            }
        }

            System.out.println();


            // Задача 4

            number1 = new int[]{1, 2, 3,};


            for (int l = 0; l < 3; l = l + 1) {
                System.out.print(number1[l] + 1);
            }


        }

    }


