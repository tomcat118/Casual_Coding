class 76Sol{
    public String minWindow(String s, String t) {
        if(t.length()>s.length()||t.length()==0){
            return "";
        }

        //a hash table for t + its frequencies
        HashMap <Character, Integer> S = new HashMap();
        //a hash table for s + its frequencies
        HashMap <Character, Integer> T = new HashMap();
        // traverse through t to record its frequencies in hash_t;
        for(int i = 0; i< t.length(); i++){
            T.put(t.charAt(i), T.getOrDefault(t, 0)+1);
        }
     
        String res = s+t;
        
        String temp ="";
        int left = 0;
        int right;
        int count = 0;
        // a for loop using r to go through s;
        for(right =0; right < s.length(); right++){
              char curr = s.charAt(right);
              S.put(curr, S.getOrDefault(curr,0)+1);
              if(T.containsKey(curr) && S.get(curr)<=T.get(curr)){
                  count++;
                  
              }
              while(count == t.length()){
                temp = s.substring(left, right+1);
                if(temp.length() < res.length()){
                      res = temp;
                }
                char to_remove = s.charAt(left);
                System.out.println("to_remove" + to_remove);
                temp = temp.substring(1);
                if(T.containsKey(to_remove) && S.get(to_remove)<= T.get(to_remove)){
                    count--;
                    
                }
                S.put(to_remove,S.getOrDefault(to_remove,0)-1);
                left++;
              }
              System.out.println("left:" +left);
            
        }
          
        return (res == s+t)? "":res;
    }
}