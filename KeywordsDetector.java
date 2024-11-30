public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int n=0;n<sentences.length;n++) {
            for (int k=0;k<keywords.length;k++) {
                String str1= sentences[n], str2=keywords[k];
                boolean check=false;
                for (int i=0;i<str1.length();i++) {
                    if (str1.charAt(i)==str2.charAt(0)){
                        check=true;
                        int m=i;
                        for (int j=0;j<str2.length();j++){
                            if (m >= str1.length() || str1.charAt(m) != str2.charAt(j)) {
                                check = false;
                                break;
                            }
                            m++;
                        }
                        if(check) System.out.println(str1);
                    }
                }

            }
        }
    }
}
