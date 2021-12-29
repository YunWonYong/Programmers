public class Omoikiri {
    public static void main(String[] args) {
        String[] str = {"sun","bed","car"};
        
        String[] answer = new String[strings.length];
        

        ArrayList<String> array = new ArrayList<>();
            
        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(array);
        
        for (int i=0; i<array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }
        System.out.print(answer);
        //return answer;
        
    }
}
