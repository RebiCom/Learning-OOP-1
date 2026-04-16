package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input)
    {
        String[] elements = input.split(",");
        int maxEven = Integer.MIN_VALUE;//even=par
        int posEven = -1;

        int minOdd = Integer.MAX_VALUE;//odd=impar
        int posOdd = -1;

        for (int i = 0; i < elements.length; i++) {
            int nr = Integer.parseInt(elements[i].trim());
            /*Definitie instructiune noua
            -> " 5 , 10 "
            split împarte în: [" 5 ", " 10 "]
            elements[0] este " 5 "
            .trim() îl face "5"
            Integer.parseInt îl transformă în numărul 5.
             */
            if (nr % 2 == 0) {
                if (nr > maxEven) {
                    maxEven = nr;
                    posEven = i;
                }
            } else {
                if (nr < minOdd) {
                    minOdd = nr;
                    posOdd = i;
                }
            }
        }
        return new int[]{maxEven, posEven, minOdd, posOdd};
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
