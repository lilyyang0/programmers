class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        if(k>0){
            answer=my_string.repeat(k);
        }
        return answer;
    }
}