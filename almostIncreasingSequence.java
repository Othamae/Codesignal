boolean solution(int[] sequence) {
    int c = 0;
    if (sequence[0]>=sequence[1]){
        c++;   
    }
    int i =2;
    while (i< sequence.length){
        if (sequence[i]<=sequence[i-1]){
            c++;  
            if (sequence[i]<= sequence[i-2]) {
                sequence[i]= sequence[i-1];
            }
        }
        i++; 
        
    }
    return (c<2);
    
    
    
   
}
