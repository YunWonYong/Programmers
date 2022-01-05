public class Caesar {
    public static void main(String[] args) {
        String s="AaZz";
        int n = 25;
        String answer="";
        char[] arr = s.toCharArray();
        boolean flag=true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==' ')continue;

           // 대문자일 경우
            else if(arr[i]<=90){
                flag=false;
            }

            arr[i]=(char)(arr[i]+n);
            //소문자일 때 
            if(flag){

                if(arr[i]>122){
                   
                    arr[i]=(char) (arr[i]-26);

                }

            }
            // 대문자일 때
            else{
                if(arr[i]>90){
                    arr[i]=(char) (arr[i]-26);
                   
                }

            }
            flag=true;
        
        }

        answer=new String(arr);
        System.out.println(answer);
        //retrun answer;
    }
}
