package andy.level1;

//프로그래머스 Level 1,부족한 금액 계산하기
public class InsufficientAmount {
    public long solution(int price, int money, int count) {
        long sum = (long)price*((count+1)*(count/2)+(count+1)/2*(count%2));
        return sum>money?sum-money:0;
    }
}
