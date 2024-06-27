
public class App {
	public static void main(String[] args) {
		
		byte byteValue = 17;
		short shortValue = 129;
		int intValue = 10000;
		long longValue = 1000000000;
		
		float floatValue = (float)3238.23;
		double doubleValue = 48348.98;
		
		shortValue = (short)intValue;
		System.out.println(intValue);
		
//		intValue = (int)floatValue;
//		System.out.println(intValue);
		
		floatValue = (float)intValue;
		
		
	}
}
