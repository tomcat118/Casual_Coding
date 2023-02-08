class Candy{
    
        public int candy(int[] ratings) {
            
            int min_c;
            if(ratings.length<2){
                return ratings.length;
            }
            int[] candies = new int[ratings.length];
            candies[0] = 1;
            for (int i = 1; i< ratings.length; i++){
                if(ratings[i]>ratings[i-1]){
                    candies[i]=candies[i-1]+1;
                }  
                else{
                    candies[i] = 1;
                }
            }
            for (int i = ratings.length-1; i>0; i--){
                if(ratings[i]<ratings[i-1]){
                    candies[i]=Math.max(candies[i-1],candies[i]+1);
                }  
            }
    
            return Arrays.stream(candies).sum();
        }
    
}