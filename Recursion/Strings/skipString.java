public class skipString{
	public static void main(String[] args){
		String str = "bcvapplecabdf";
		System.out.println(skipWord(str));
		System.out.println(skipWord1(str));
	}

	public static String skipWord(String str){
		if(str.isEmpty()){
			return "";
		}

		if(str.startsWith("apple")){
			return skipWord(str.substring(5));
		}
		return str.charAt(0)+skipWord(str.substring(1));
	}

	public static String skipWord1(String str){
		if(str.isEmpty()){
			return "";
		}

		if(!str.startsWith("apple")){
			return skipWord1(str.substring(1));
		}
		return str;
	}
}