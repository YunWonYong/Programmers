const stage = () => {
    const variables = {
        stage: 0,
        user: 0,
        rate: 0.0
    };
    return ((self) => {
      return {
        setStage:(stage) => {
            self.stage = stage;
        },
        getStage: () => self.stage,
        userUp: () => self.user++,
        getUser: () => self.user,
        rateCalc: (tryUser) => {
            if (self.user === 0 || tryUser === 0) {
                self.rate = 0.0;
                return;
            }
            self.rate = (self.user / tryUser);
        },
        getRate: () => self.rate, 
      };
    })(variables);
};
const solution = (n, stages) => {
    const users = [];
    let index = 0;
    let el = null;
    const answer = [];
    while(index < n) {
        el = stage();
        el.setStage(index + 1);
        users[index] = el;
        answer[index++] = index;
    }
    
    stages.forEach(stage => {
        if (stage > n) {
            return;
        }
        users[ stage - 1 ].userUp();
    });
    let tryUsers = stages.length;
    users.forEach( el => {
        let user = el.getUser();
        if(user === 0) {
            return;
        }
        el.rateCalc(tryUsers);
        tryUsers -= user;
    });
    
    sortStage(answer, users);
    return answer;
};

const sortStage = (answer, users) => {
    const range = users.length - 1;
    let index = 0;
    let currentStage = null;
    let nextStage = null;
    while(index < range) {
        currentStage = users[index];      
        nextStage = users[index + 1];
        if (currentStage.getRate() < nextStage.getRate()) {
            users[index] = nextStage;
            users[index + 1] = currentStage;
            answer[index] = nextStage.getStage();
            answer[index + 1] = currentStage.getStage();
            index = index > 0 ? --index : index;
            continue;
        }
        index++;
    }
};