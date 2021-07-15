public class Dup {
        public static void main(String[] args) throws Exception {
            int[] arr = { 5, 6, 6, 5, 7, 6, 5, 6};
            int[] result = new int[10];
            int counter = 0, count = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean isDistinct = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDistinct = true;
                        break;
                    }
                }
                if (!isDistinct) {
                    result[counter++] = arr[i];
                }
            }
            for (int i = 0; i < counter; i++) {
                count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (result[i] == arr[j]) {
                        count++;
                    }
    
                }
                //System.out.println(result[i] + " = " + count);
                if(count%2!=0)
                {
                    System.out.println(result[i]);
                }
            }
        }
    
}
