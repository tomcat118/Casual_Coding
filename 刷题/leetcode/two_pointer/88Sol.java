public class 88Sol {
 
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int pos = m-- + n-- -1;
            while(m>=0 && n >=0){
                if(nums1[m]<nums2[n]){
                    nums1[pos] = nums2[n];
                    n--;
                    pos--;
                }
                else{
                    nums1[pos] = nums1[m];
                    m--;
                    pos--;
                }
            }
            while(n >=0){
                nums1[pos]=nums2[n];
                pos--;
                n--;
            }
        }
}
