public class Main{
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                int m = i*j;
                System.out.print(j+"*"+i+"="+m+" ");
            }
            System.out.println();
        }
    }
}