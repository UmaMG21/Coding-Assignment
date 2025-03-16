import java.util.Arrays;
public class StringAnagram{
    public static boolean isAnagram(String s1, String s2){
        
        if (s1 == null || s2 == null){
            return false;
        }

        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        if(str1.length()!= str2.length()){
            return false;
        }
        else{
            char c1[] = str1.toLowerCase().toCharArray();
            char c2[] = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }
    }

    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));
    }
}


