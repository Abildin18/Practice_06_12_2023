public class Main{
    public static void main(String[] args) {
        int firstMult=1;
        while(firstMult<11){
            int secondMult=1;
            while(secondMult<11){
                int result=firstMult*secondMult;
                System.out.println(firstMult+"*"+secondMult+"="+result);
                secondMult++;
            }
            firstMult++;
        }
    }
}