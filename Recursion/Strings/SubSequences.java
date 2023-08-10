import java.util.ArrayList;

public class SubSequences{
	public static void main(String[] args){
		String s = "abc";
		// subSeq("",s);
		System.out.println(subSeqRet("", s));
	}

	public static void subSeq(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}

		subSeq(p+up.charAt(0),up.substring(1));
		subSeq(p,up.substring(1));
	}

	static ArrayList<String> subSeqRet(String p, String up){
		if(up.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			if(!p.isEmpty()){
			list.add(p);
			}
			return list;
		}

		ArrayList<String> left = subSeqRet(p+up.charAt(0), up.substring(1));
		ArrayList<String> right = subSeqRet(p, up.substring(1));

		left.addAll(right);
		return left;
}
}