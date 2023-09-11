package Exam;

public class ExamTest {
    private void SHOW(){};
    public static void main(String[] args) {
        String a1,a2,a3,a4;
        a1="a";
        a4="a";

        a2=new String("a");
        a3=new String("a");
        if(a1.equals(a2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(a1.compareTo(a3));
        System.out.println(a1==a4);
        String.format("%.4f",Math.PI);
        System.out.println(String.format("%.4f",Math.PI));
    }
}
