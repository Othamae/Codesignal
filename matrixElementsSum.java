int solution(int[][] matrix) {
    int s = 0;
    int[][]m=matrix.clone();
    for (int i=0; i<matrix.length; i++){
        for (int j=0; j< matrix[0].length; j++){         
            if (matrix[i][j]== 0){
                int k= i;
                while (k<matrix.length){
                    m[k][j] = 0;
                    k++;
                }                                
            }
            s += m[i][j]; 
        }
    }
    return s;
}
