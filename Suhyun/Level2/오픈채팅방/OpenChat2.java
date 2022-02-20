import java.util.*;
public class OpenChat2 {
    public static void main(String[] args) {
        String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                        "Leave uid1234","Enter uid1234 Prodo",
                        "Change uid4567 Ryan","Enter usdf12 Magi", "Leave uid1234"};

        //String[] sentence=new String[record.length];
        ArrayList<String> sentence = new ArrayList<>();
        ArrayList<String> id = new ArrayList<>();

        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> ch = new ArrayList<>();

        for(int i=0 ; i<record.length; i++){
            
            String [] kiroku =  record[i].split(" ");

            switch(kiroku[0]){
                case "Enter": 
                    sentence.add("님이 들어왔습니다.");
                    id.add(kiroku[1]);
                    map.put(kiroku[1],kiroku[2]);
                    break;
                            
                case "Leave": 
                    sentence.add("님이 나갔습니다.");
                    String leave=map.get(kiroku[1]);
                    //map.put(kiroku[1],"null");
                    id.add(kiroku[1]);
                    break;
                
                case "Change": 
                    //map 갱신 
                    map.put(kiroku[1],kiroku[2]);     
                    break;    
            }                           
                  
        }

        for(int i=0; i<id.size(); i++){
            if(map.containsKey(id.get(i))){

                id.set(i,map.get(id.get(i)));
                //map.get(id.get(i));

            }
        }

        String [] answer = new String[id.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i]=id.get(i)+sentence.get(i);
        }
            

        System.out.println(Arrays.toString(answer));
    }        


}
