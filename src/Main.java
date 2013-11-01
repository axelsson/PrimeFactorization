import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<BigInteger> numbersToFactorize= new ArrayList<BigInteger>();
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextBigInteger()){
			numbersToFactorize.add(sc.nextBigInteger());
		}
		sc.close();

	}

}
