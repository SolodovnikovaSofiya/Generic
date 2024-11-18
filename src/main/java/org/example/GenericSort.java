public class GenericSort {

    /**
     * Сортирует массив сравнимых объектов с использованием алгоритма сортировки выбором.
     *
     * @param list Массив объектов, реализующих интерфейс Comparable.
     */
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

            // Переставляет list[i] с list[currentMinIndex] в случае необходимости
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /**
     * Выводит массив на консоль.
     *
     * @param array Массив объектов для вывода.
     */
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Создать массив типа Integer
        Integer[] intArray = {2, 4, 3};
        // Создать массив типа Double
        Double[] doubleArray = {3.4, 1.3, -22.1};
        // Создать массив типа Character
        Character[] charArray = {'a', 'K', 'p'};
        // Создать массив типа String
        String[] stringArray = {"Вера", "Надежда", "Любовь"};

        // Отсортировать массивы
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        // Отобразить отсортированные массивы
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