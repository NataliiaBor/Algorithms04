public class MinMaxAve {
//    Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//    и среднее среди всех значений между 2-мя индексами.
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    public static int[] minMaxAve(int[] array, int index1, int index2) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ave = 0;

        if (array != null && index1 < array.length && index2 > index1) {
            for (int i = index1; i < index2 + 1; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]) {
                    max = array[i];
                }
                ave += array[i];
                ave /= (index2 + 1 - index1);
            }

            int[] minMaxAveArray = new int[3];
            minMaxAveArray[0] = min;
            minMaxAveArray[1] = max;
            minMaxAveArray[2] = ave;

            return minMaxAveArray;
        } else if (array != null && index1 < array.length && index1 == index2) {
            int[] minMaxAveArray = {array[index1], array[index1], array[index1]};
            return minMaxAveArray;
        } else {
            return null;
        }
    }
}
