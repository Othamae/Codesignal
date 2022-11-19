int solution(int[] statues) {
    Arrays.sort(statues);    
    int c = 0;
    for (int i=0; i < statues.length-1; i++){
        if (statues[i+1]- statues[i] !=1 ){
            c += (statues[i+1]- statues[i])-1;
        }
    }
    return c;
}
