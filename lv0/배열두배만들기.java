package lv0;

public class 배열두배만들기 {

public int[] solution(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        
        return numbers;
    }
	
}
