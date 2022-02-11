/**
 * 오픈 채팅방(220205-220211)
 */

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> openChat = new HashMap<>();

        String[] splited;
        String state;
        String id;
        String nickname;
        int changeCount = 0;

        for(String e: record) {
            splited = e.split(" ");
            state = splited[0];

            if(state.equals("Leave")){
                continue;
            }

            id = splited[1];
            nickname = splited[2];

            if(state.equals("Change")){
                changeCount++;
                openChat.replace(id, nickname);
                continue;
            }

            if(openChat.containsKey(splited[1])){
                openChat.replace(id, nickname);
            }else{
                openChat.put(id, nickname);
            }

        }

        String[] result = new String[record.length-changeCount];
        int index = 0;
        StringBuffer sb = new StringBuffer();

        for(String e: record) {
            splited = e.split(" ");
            state = splited[0];
            id = splited[1];
            nickname = openChat.get(id);

            sb.append(nickname);
            sb.append("님이 ");

            switch(state) {
                case "Enter":
                    sb.append("들어왔습니다.");
                    result[index++] = sb.toString();
                    break;
                case "Leave":
                    sb.append("나갔습니다.");
                    result[index++] = sb.toString();
                    break;
            }

            sb.setLength(0);
        }

        return result;
    }

}