public class Dup {
        public static void main(String[] args) throws Exception {
            int[] arr = { 5, 6, 6, 5, 7, 6, 5, 6};
            int[] result = new int[10];
            int Res_index = 0, count = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean isDup = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDup = true;
                        break;
                    }
                }
                if (!isDup) {//is distinct
                    result[Res_index++] = arr[i];//result=5,6,7
                }
            }
            for (int i = 0; i < Res_index; i++) {
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
