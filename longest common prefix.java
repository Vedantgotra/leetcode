class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i,j;
        String temp="",tempo="";
        if (strs.length==1){
            return strs[0];
        }
        else{
    for(i=0;i<strs.length-1;i++){
        if(strs[i].length()<strs[i+1].length()){
        for(j=0;j<strs[i].length();j++){
            if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                temp=temp+strs[i].charAt(j);
            }
            else{
                break;
            }
        }
        }
       else{
           for(j=0;j<strs[i+1].length();j++){
            if(strs[i].charAt(j)==strs[i+1].charAt(j)){
               temp=temp+strs[i].charAt(j);
            }
                else{
                break;
            }
        }
       }
        strs[i+1]=temp;
        tempo=temp;
        temp="";
    }
        return tempo;
    }
    }
}
