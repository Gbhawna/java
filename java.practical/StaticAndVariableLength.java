//ques 13

public class StaticAndVariableLength {

    public static int sumOfAnyNumber(int ... arr){     // variable length argument and use of static 
        int sum=0;
        for(int h:arr){
            sum+=h;
        }
        return sum;
    }

    public static void main(String [] args){
        
        int sum1=sumOfAnyNumber(2,3,4);
        int sum2=sumOfAnyNumber(2,34,45,67,98,76,65);
        System.out.println("The sum of 2+3+4 is:"+sum1);
        System.out.println("The sum of 2+34+45+67+98+76+65 is:"+sum2);

    }
    static{         // use of static 
        System.out.println("Hello,everyone");
    }
    
}
