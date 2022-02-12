public class MaximumPledgeMinimumMultiple {
    // 유클리드 호제법
    public static void main(String[] args) {
        int n=3;
        int m=12;

        int mm=euclidean(Math.max(n,m), Math.min(n,m));

        n=n/mm;
        m=m/mm;

        int mp=m*n*mm;
        int[] answer={mm,mp};
        System.out.println(answer[0]);
    }

    public static int euclidean(int big, int small){
        int val=big%small;
        
        if(val==0){
            return small;
        }
        else{
            return euclidean(small, val);
        }
    }
}
