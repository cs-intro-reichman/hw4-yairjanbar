public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        char currentChar;
        String newS="";
        for (int i=0;i<str.length();i++) {
            currentChar=str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar +32);
                newS += currentChar;
            }
            else {
                newS += currentChar;
            }
        }
        return newS;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean check=false;
        for (int i=0;i<str1.length();i++) {
            if (str1.charAt(i)==str2.charAt(0)){
                check=true;
                int m=i;
                for (int j=0;j<str2.length();j++){
                    if (str1.charAt(m)!=str2.charAt(j)) {
                        check=false;
                    }
                    m++;
                }
                return check;
            }
        }
        return false;
    }
}
