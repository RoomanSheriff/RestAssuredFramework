package GenericLibraries;

import java.util.Random;

public class JavaUtility {
	
	
/**
 * This is used to get Random number
 * @author ROOMAN
 * @return
 *
 */
	public int getRandomNumber()
	{
		Random ran = new Random();
		int random = ran.nextInt(1000);
		return random;
	}
}
