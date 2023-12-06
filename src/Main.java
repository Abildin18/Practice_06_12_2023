public class Main{
    public static void main(String[] args) {
        int firstMult = 1;
        do {
            int secondMult=1;
            do{
               int result=firstMult*secondMult;
                System.out.print(firstMult+"*"+secondMult+"="+result+"  ");
                secondMult++;
            }while(secondMult<11);
            firstMult++;
            System.out.println();
        } while (firstMult < 11);
    }
}