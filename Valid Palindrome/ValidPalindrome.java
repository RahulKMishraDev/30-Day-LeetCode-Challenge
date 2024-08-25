class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newStr="";
        String ss = s.toLowerCase().replaceAll("[, :]","").trim();
        char[] str=ss.toCharArray();
        for(char i:str){
            if(Character.isDigit(i)||Character.isLetter(i)){
                newStr+=i;
            }
        }
        int firstIndex=0;
        int lastIndex=newStr.length()-1;
        while(firstIndex<=lastIndex){
            if(newStr.charAt(firstIndex)!=newStr.charAt(lastIndex)){
                return false;
                }
                firstIndex++;
                lastIndex--;
        }
        return true;
    }
}