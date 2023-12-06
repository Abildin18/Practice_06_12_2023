public class Main{
    public static void main(String[] args) {
        int c=1;
        while(c<11){
            int d=1;
            while(d<11){
                int e=c*d;
                System.out.println(c+"*"+d+"="+e);
                d++;
            }
            c++;
        }
    }
}