int solution(int[] inputArray) {
    int max = -100000;
    for (int i= 1; i<inputArray.length; i++){
        if ((inputArray[i-1] * inputArray[i]) >= max){
            max = inputArray[i-1] * inputArray[i];
        }
    }
    return max;

}