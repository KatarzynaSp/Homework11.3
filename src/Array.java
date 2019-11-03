class Array {

    int[] movingElements(int[] array, int n) {
        if (array != null) {
            if (n >= array.length || n <= 0) {
                return array;
            } else {
                int[] array2 = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                    int j = (i - 1 + n) % array.length;
                    array2[i] = array[j];
                }
                return array2;
            }
        } else return null;
    }
}