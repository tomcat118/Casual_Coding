class 452 {
    public int findMinArrowShots(int[][] points) {
        //sort points based on span
       
        Arrays.sort(points, (a,b)-> (a[1]-b[1]));
        for (int i =0; i< points.length; i++){
            System.out.println(Arrays.toString(points[i]));
        }
        //sets new begin and end
        int begin, end;
        int total = 1;
         end = points[0][1];  
        //for loop over points, check if next circle wraps it; if not, add one to total
        for(int i = 1; i< points.length; i++){
            begin = points[i][0];
       
            if(end < begin){
                end = points[i][1];
                total+=1;
            }
            
        }

            return total;
    }
}