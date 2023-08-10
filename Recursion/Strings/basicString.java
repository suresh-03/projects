public class basicString{
	public static void main(String[] args){
		String name = "bccaaabaac";
		findString2("",name);
		System.out.println(findString3(name));
	}

	public static String findString(String str,int i,String ans){
		if(i >= str.length()){
			return ans;
		}

		if(str.charAt(i) == 'a'){
			return findString(str,i+1,ans);
		}
		
			ans += str.charAt(i);
			return findString(str,i+1,ans);
	}

	// second approach

	public static void findString2(String ans,String str){
		
		if(str.isEmpty()){
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);

		if(ch == 'a'){
			findString2(ans,str.substring(1));
		}
		else{
		findString2(ans + ch,str.substring(1));
	}
	}

	public static String findString3(String str){
		if(str.isEmpty()){
			return "";
		}

		if(str.charAt(0) == 'a'){
			return findString3(str.substring(1));
		}
		return str.charAt(0)+findString3(str.substring(1));
	}
}