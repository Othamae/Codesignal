int solution(int n) {
    String s = "";
    while (n>0){
        s+="9";
        n--;
    }    
    return Integer.parseInt(s);
}