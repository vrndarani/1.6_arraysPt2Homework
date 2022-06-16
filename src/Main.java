import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for (int elm:arr){
            sum += elm;
        }
        System.out.println("Monthly total spending is $" + sum);




        int min = arr[0];
        int max = arr[0];
        for (final int elm : arr) {
            if (elm < min) {
                min = elm;
            }
            if (elm>max){
                max = elm;
            }
        }
        System.out.println("Smallest spending total is $" + min);
        System.out.println("Biggest spending total is $" + max);

        System.out.println("The average monthly spending is " + (float)sum/arr.length);


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }



    }







}







