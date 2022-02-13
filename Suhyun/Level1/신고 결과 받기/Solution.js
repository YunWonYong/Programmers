let id_list = ["muzi", "frodo", "apeach", "neo"];
let report = ["muzi frodo", "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"];
let k = 2;

let answer = [];
let id = new Map();
id_list.map(e => id.set(e, 0));
let mail_id = new Map(id);


//중복제거 
const unique = {};
report.forEach(el => {
    unique[el] = true;
})
const arr_unique = Object.keys(unique);


for (let i = 0; i < arr_unique.length; i++) {
    let wakare = arr_unique[i].split(" ");

    id.set(wakare[1], id.get(wakare[1]) + 1);

}
for (let i = 0; i < arr_unique.length; i++) {
    let wakare = arr_unique[i].split(" ");
    if (id.get(wakare[1]) >= k) {
        mail_id.set(wakare[0], mail_id.get(wakare[0]) + 1);

    }
}

for (let i = 0; i < id_list.length; i++) {
    answer.push(mail_id.get(id_list[i]));
}





return answer;
