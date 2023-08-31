import java.util.Stack;

public class reverseString{



    public static void main(String[] args) {

        reverseString tester = new reverseString();

        String testCase1 = "The Daily Byte";
        String reverse1 = tester.reverse(testCase1);
        System.out.println("STARTING THE TEST CASES \n");
        for(int i = 0; i < 10; i++){
            System.out.print("*");
        }
        System.out.println("\n");

        System.out.println("Reversing a String function \n");
        System.out.println("The input is "+ testCase1+ "\n");

        if(!reverse1.equals("etyB yliaD ehT")){

            System.out.println("FAILED \n");
            System.out.println(" The testCase is "+ testCase1 + " and the output is "+ reverse1+"\n");
        }else{
            System.out.println("SUCCESS \n");
            System.out.println(" The testCase is "+ testCase1 + " and the output is "+ reverse1+"\n");
        }
        
    }

    public String reverse(String str){

        Stack<Character> stack = new Stack<>();
        String ans = "";

        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        for(int i = 0; i < str.length(); i++){
            ans += stack.pop();
        }

        return ans;
    }

}