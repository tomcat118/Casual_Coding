class 606{
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean plant = false;
        int total = 0;
        //check first and last element plantable
        if(flowerbed.length==1){
            plant = (flowerbed[0]==0)? true: (n==0)?true :false;
            return plant;
        }
            
        else{
            if(flowerbed[0]==0 && flowerbed[1]==0){
                                flowerbed[0] = 1;
                                total++;
                    }
        }

    
        //check if middle indexes plantable            
        for(int i = 1; i<flowerbed.length-2; i++){
         if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1){
             total++;
             flowerbed[i]=1;
             i++;
         }
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            total++;
        }

        //check if n plants ready
        
        plant = (total>=n)?true: false;
        
        return plant;
    }
}