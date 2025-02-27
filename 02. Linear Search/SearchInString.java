public class SearchInString {
    public static void main(String[] args) {
        String name = "praveen";
        char k = 'v';
        System.out.println(search1(name, k));
    }

    public static boolean search1(String str, char k) {
        if(str.length() == 0) return false;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == k) return true;
        }
        return false;
    }

    static boolean search2(String str, char k) {
        if(str.length() == 0) return false;
        for(char ch:str.toCharArray()) {
            if(ch == k) return true;
        }
        return false;
    }
}
