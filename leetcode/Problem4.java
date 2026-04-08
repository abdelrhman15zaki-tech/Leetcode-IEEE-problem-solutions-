class Problem4 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int min=201;
        int index=201;
        for(int i=0;i<strs.length;i++){
            
            if(strs[i].length()<min){
                index=i;min=strs[i].length();
            }
        }
        int limit=strs[index].length();
        for(int i=0;i<strs.length;i++){
            if(i==index)continue;
            for(int j=0;j<strs[index].length();j++){
                
                if((strs[i].charAt(j)!=(strs[index].charAt(j)))&&j<limit){
                    limit=j;
                    }





            }
        }
    
    
    

    
    return strs[index].substring(0,limit);}
}