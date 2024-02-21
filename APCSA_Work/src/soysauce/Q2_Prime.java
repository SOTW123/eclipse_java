package soysauce;

public class Q2_Prime {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    System.out.println(isPrime(19));
}
public static boolean isPrime(int number)
{
    for(int i = 2; i < number; i++)
{
    if(number % i == 0)
        {
            return false;
        }
    }
    
    return true;
}
}