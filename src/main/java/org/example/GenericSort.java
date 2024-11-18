public class GenericSort {
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            // Найти наименьший объект в list[i..list.length-1]
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 3};
        Double[] doubleArray = {3.4, 1.3, -22.1};
        Character[] charArray = {'a', 'K', 'p'};
        String[] stringArray = {"Вера", "Надежда", "Любовь"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.print("Отсортированные объекты типа Integer: ");
        printArray(intArray);
        System.out.print("Отсортированные объекты типа Double: ");
        printArray(doubleArray);
        System.out.print("Отсортированные объекты типа Character: ");
        printArray(charArray);
        System.out.print("Отсортированные объекты типа String: ");
        printArray(stringArray);
    }
}
