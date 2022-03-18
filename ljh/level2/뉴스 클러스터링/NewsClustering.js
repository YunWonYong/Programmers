// 뉴스 클러스터링
function solution(str1, str2) {
    str1 = str1.toUpperCase();
    str2 = str2.toUpperCase();
    
    const list1 = divide(str1);
    const list2 = divide(str2);  
    
    list1.sort();
    list2.sort();
    
    let pointer = 0;
    let intersection = 0;
    for (let i = 0; i < list1.length; i++) {
        for (let j = pointer; j < list2.length; j++) {
            if (list1[i] === list2[j]) {
                intersection++;
                pointer = j + 1;
                break;
            }
        }
    }

    const union = list1.length + list2.length - intersection;
    return union === 0? 65536 : Math.floor(intersection * 65536 / union);
}

function divide (str) {
    const list = [];
    for(let i = 0; i < str.length - 1; i++) {
        let char1 = str[i].charCodeAt();
        if(char1 < 65 || char1 > 90) {
            continue;
        }
        let char2 = str[i+1].charCodeAt();
        if(char2 < 65 || char2 > 90) {
            continue;
        }
        
        list.push(String.fromCharCode(char1, char2));
    }
    return list;
}