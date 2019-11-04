class Array {

    static int[] movingElements(int[] array, int n) {
        if (array == null) {
            return null;
        } else if (n >= array.length || n <= 0) {
            return array;
        } else {
            return slide(array, n);
        }
    }

    static int[] slide(int[] array, int n) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int j = (i - 1 + n) % array.length;
            array2[i] = array[j];
        }
        return array2;
    }
}