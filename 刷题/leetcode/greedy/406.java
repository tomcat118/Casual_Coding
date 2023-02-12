public class 406 {
    public int[][] reconstructQueue(int[][] people) 
    {
        //pick up the tallest guy first
        //when insert the next tall guy, just need to insert him into kth position
        //repeat until all people are inserted into list
        Arrays.sort(people, new Comparator<int[]>(){
            @Override
            public int compare(int[] a1, int[] a2){
                return a1[0]!=a2[0]?a2[0]-a1[0]: a1[1]-a2[1];
            }
        });
        List<int[]>queue = new LinkedList<>();
        for(int[] cur : people)
        {
            queue.add(cur[1], cur);
        }

        return queue.toArray(new int[people.length][]);
    }
}