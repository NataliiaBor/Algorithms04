public class OddIndices {
//    Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений
//    нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

   public static int[] oddIndices(int[] array) {
       int[] arrayNew = new int[array.length / 2];
       int j = 0;
       for (int i = 1; i < array.length; i += 2) {
         arrayNew[j] = array[i];
          j++;
       }
       return arrayNew;
   }

}
