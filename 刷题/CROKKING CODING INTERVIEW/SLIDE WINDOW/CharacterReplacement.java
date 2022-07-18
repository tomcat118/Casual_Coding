import java.util.*;

class CharacterReplacement {
  public static int findLength(String str, int k) {
    // TODO: Write your code here

    int windowStart = 0;
    int maxRepeatedLetter = 0;
    int maxLength = 0;
    //ERROR: compile error cuz  invalid character constant, java doesn't recognize the empty char
      //char rightChar = ''; 
      //char leftChar = '';
    char rightChar = ' '; 
    char leftChar = ' ';
    //Error: declaration
      //Map <Character, Integer> letterLengthCount = new Hashmap <>();
      // HashMap
    Map <Character, Integer> letterLengthCount = new HashMap<>();
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
        rightChar = str.charAt(windowEnd);
        letterLengthCount.put(rightChar, letterLengthCount.getOrDefault(rightChar,0) +1 );
        maxRepeatedLetter = Math.max(maxRepeatedLetter, letterLengthCount.get(rightChar));

        if(windowEnd - windowStart + 1 - maxRepeatedLetter > k){
          leftChar = str.charAt(windowStart);
          letterLengthCount.put(leftChar, letterLengthCount.getOrDefault(leftChar,0) - 1 );
          windowStart++;
        }
        maxLength = Math.max(maxLength, windowEnd - windowStart +1);
    }
    return maxLength;
  }
  public static void main(String[] args) {
    System.out.println(CharacterReplacement.findLength("aabccbb", 2));
    System.out.println(CharacterReplacement.findLength("abbcb", 1));
    System.out.println(CharacterReplacement.findLength("abccde", 1));
  }
}
