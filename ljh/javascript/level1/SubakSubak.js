// 수박수박수박수박수박수? (211231 - 220107)
export default class SubakSubak {
    solution = (n) => {
        return '수박'.repeat(n/2) + (n%2 === 0? '' : '수');
    }
}