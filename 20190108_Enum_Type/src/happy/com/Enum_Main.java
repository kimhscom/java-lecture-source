package happy.com;

public class Enum_Main {

	public static void main(String[] args) {
		
		Animals ginipig = Animals.GINIPIG;
		System.out.println(ginipig.getClass());
		System.out.println(ginipig.hashCode());
//		System.out.println(ginipig=="GINIPIG");
		System.out.println(ginipig.equals("GINIPIG"));
		
		switch (ginipig) {
		case GINIPIG:
			
			break;

		default:
			break;
		}
		
//		Animals.valueOf(); // String.valueOf;
		Animals[] a = Animals.values();
		
		/*String srt1 = "DOG";
		String srt2 = "CAT";
		String srt3 = "COW";
		String srt4 = "GINIPIG";
		
		String[] strs = {"DOG","CAT","COW","GINIPIG"};8*/

	}

}
