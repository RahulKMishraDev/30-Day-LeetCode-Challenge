class PlusOneProblem {
    public int[] plusOne(int[] digits) {
        int idx=digits.length-1;
        while(idx>=0){
            if(digits[idx]==9){
                digits[idx]=0;
            }
            else{
                digits[idx]+=1;
                return digits;
            }
            idx--;
        }

        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}