public class Heapify{
    /**
     * @param nums n non-negative integer array
     * @return a string
     */
   public static void sink(int []nums, int index, int n){
        while(index * 2 + 1 < n){
            int j = index * 2 + 1;
            if(j + 1 < n && nums[j + 1] > nums[j])j++;
            if(nums[index] > nums[j])
                break;
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
            index = j;
        }
    }
    
    public static void heapify(int[] A) {
        int len = A.length;
        for (int i = len/2; i >= 0; i--){
            sink(A, i, len);
        }
        for(int i = len - 1; i >= 0; i--){
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            sink(A, 0, i);
        }
    }
	public static void main(String []args){
		int []nums = {2,23,45,3,4, 567};
		heapify(nums);
	}
}
