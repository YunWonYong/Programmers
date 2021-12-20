const solution = (participants, completions) => {
    const {participantObj, completionObj} = getSettingObjs(participants, completions);
    const keys = Object.keys(participantObj);
    let key;
    let index = 0;
    const range = keys.length;
    let completionCount = 0;
    let participantCount = 0;
    do {
        key = keys[index];
        completionCount = completionObj[key];
        if (completionCount === undefined) {
            return key;
        } 
        participantCount = participantObj[key];
        completionObj[key] = --completionCount;
        participantObj[key] = --participantCount;
        if (participantCount - completionCount === 1) {
            return key;
        }
    } while((++index) < range);
    return [participantObj, completionObj]
};

const getSettingObjs = (participants, completions) => {
    const participantObj = {};
    const completionObj = {};
    const range = participants.length - 1;
    let index = 0;
    let key = null;
    participantObj[participants[range]] = 1;
    do {
        key = participants[index];
        participantObj[key] = !participantObj[key] ? 1 : participantObj[key] + 1;
        key = completions[index];
        completionObj[key] = !completionObj[key] ? 1 : completionObj[key] + 1;
    } while((++index) < range);
    return {participantObj: participantObj, completionObj: completionObj};
};