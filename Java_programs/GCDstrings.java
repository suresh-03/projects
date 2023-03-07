public class GCDstrings {
    public static void main(String[] args) {
        String s1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String s2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(s1, s2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        String ans1 = str1 + str2;
        String ans2 = str2 + str1;
        if(ans1.equals(ans2)){
            int Gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, Gcd);
        }
        return "";
            }
            private static int gcd(int a, int b) {
                return b == 0 ? a : gcd(b, a % b);
            }
      
     
        
    }

