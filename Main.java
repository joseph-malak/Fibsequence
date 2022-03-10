   public class Main {

    public static void main(String[] args) {
   
   int fib = 50, first = 0, second = 1;


            for (int i = 1; i <= fib; ++i) {
                System.out.println(first);

                int next = first + second;
                first = second;
                second = next;
                if(first >4000000) {
                    System.out.println(i);
                    break;
                }
            }
 }
