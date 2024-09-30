public class duplicate {

    public static boolean hasduplicate(int num[]){
        for(int i=0; i<num.length;i++){
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        System.out.println(hasduplicate(num));
    }
}

// Commit timestamp: 2024-09-30 16:35:00