package lv0;

public class 분수의덧셈 {

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 분모 통일
        int num = denom1;
        numer1 *= denom2;
        denom1 *= denom2;
        numer2 *= num;
        denom2 *= num;
        
        // 덧셈
        answer[0] = numer1 + numer2;
        answer[1] = denom1;
        
        // 약분
        for (int i = denom1 - 1; i > 1; i--) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] /= i;
                answer[1] /= i;
            }
        }
        
        return answer;
    }
	
}
