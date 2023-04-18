public class sem1_work2 {
    public static void main(String[] args) {
        int num=1000;
        for (int i = 1; i < num; i++) {
            boolean has_denominator = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    has_denominator= true;
                    break;
                }
            }
            if (!has_denominator){
                System.out.println(i);
            }
            
        }
        
    }
}
