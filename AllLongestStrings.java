String[] solution(String[] inputArray) {
    int m = inputArray[0].length();
    int c= 0;
    List<String> l = new ArrayList<>();
    l.add(inputArray[0]);
    for (int i=1; i<inputArray.length;i++) {
        if (inputArray[i].length()>=m){
            m= inputArray[i].length();
            l.add(inputArray[i]);
        }
    }    
    for (String string : l) {
        if (string.length()<m){
            c++;
        }
    }
    for (int i= 0; i<c; i++){
        l.remove(l.get(0));
    }
    
    String[]f = new String[l.size()];
    f = l.toArray(f);
    return f;
    

}
