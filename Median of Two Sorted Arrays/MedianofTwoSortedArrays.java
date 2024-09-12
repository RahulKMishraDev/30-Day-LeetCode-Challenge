class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int i=0 ,j=0 ,k=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            arr[k]=nums2[j];
            k++;
            j++;
        }
        int low=0;
        int high=m+n-1;
        int mid=(low+high)/2;
        if((m+n)%2!=0){
            return arr[mid];
        }
        double sum=(double)(arr[mid]+arr[mid+1])/2 ;
        return sum;
    }
}