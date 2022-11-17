int solution(int n) {
    if (n==1){
        return 1;
    }
    return (solution(n-1)+ (n*4)-4);

}