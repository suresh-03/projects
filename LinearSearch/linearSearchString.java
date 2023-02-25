package LinearSearch;

public class linearSearchString {
    public static void main(String[] args) {
        String n = "suresh";
        char target = 'y';
        System.out.println(search(n, target));
        System.out.println(searchb(n, target));
    }
    static int search(String a, char target){
        if(a.length() == 0){
            return -1;
        }
        else{
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == target){
                    return i;
                }
            }
        }
        return -1;
    }

    // method 2

    static boolean searchb(String a, char target){
        if(a.length() == 0){
            return false;
        }
        else{
            for(char c : a.toCharArray()){
                if(c == target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
