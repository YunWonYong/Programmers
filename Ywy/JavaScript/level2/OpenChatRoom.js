export default class OpenChatRoom {
    solution = (record) => {
        const userInfo = {};
        const messageQueue = [];
        const stateMessage = {
            Enter: "들어왔습니다.",
            Leave: "나갔습니다."
        };
        record.forEach(txt => {
            let [state, id, name] = txt.split(" ");
            userInfo[id] = name ? name : userInfo[id];
            if (state === "Change") {
                return;
            }
            messageQueue.push(`${id}#님이 ${stateMessage[state]}`);
        });

        messageQueue.forEach((el, index) => {
            let [id, state] = el.split("#");
            messageQueue[index] = userInfo[id] + state;
        });
        return messageQueue;
    };
}