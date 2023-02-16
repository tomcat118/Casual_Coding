    public class 524Sol{
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, (a,b) -> {
            if(a.length()!=b.length())
                return b.length()- a.length();
            else
                return a.compareTo(b);
        });
        int out = 0;
        
        for (String b : dictionary){
            if(s.length() < b.length()){
                continue;
            }
            if(isContain(s, b)){
                return b;
            }
        }
        return "";
    }
    public boolean isContain(String a, String b){
        int i =0;
        int j = 0;
        while(i<a.length() && j <b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==b.length();
    }
    }