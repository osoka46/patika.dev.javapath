public class Metod {


    static double sum(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
            count++;
        }
        return sum / count;

    }


    static double harmonik(int[] arr) {
        double sum = 0;

        for (int x = 0; x < arr.length; x++) {

            for (double y = 1; y <= arr[x]; y++) {
                sum += 1 / y;
                System.out.println(sum);

            }
            System.out.println("====================");


        }
        System.out.println("harmonik seri: " + sum);

        return arr.length / sum;

    }


}
