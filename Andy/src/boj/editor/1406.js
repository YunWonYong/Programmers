process.stdin.resume();
process.stdin.setEncoding('utf8');

// 백준, 1406, 에디터
const readline = require("readline");
const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

let input = [];

rl.on("line", function(line) {
	input.push(line)
}).on("close", function() {
	proc(input);
	process.exit();
});


const LNode = function(str) {    
    const node = {};
    node.next = node.prev = null;
    node.str = str;
    return node;
};

const LinkedList = function() {
    const list = {};
    list.head = LNode("head");
    list.tail = LNode("tail");
    list.head.next = list.tail;
    list.tail.prev = list.head;
    list.pos = list.head;
    list.add = function(str) {
        const node = LNode(str);
        node.prev = list.tail.prev;
        list.tail.prev.next = node;
        list.tail.prev = node;
        node.next = list.tail;  
        list.pos = node;
    }
	list.L = function() {
		if(list.pos == list.head) return;
		list.pos = list.pos.prev;
	}
	list.D = function() {
		if(list.pos.next == list.tail) return;
		list.pos = list.pos.next;
	}
	list.B = function() {
		if(list.pos == list.head) return;
		let p = list.pos.prev;
		let n = list.pos.next;
		p.next = n;
		n.prev = p;
        list.pos = p;
	}
	list.P = function(str) {
		let node = LNode(str);
		let p = list.pos;
		let n = list.pos.next;
	
		node.next = n;
		node.prev = p;
		n.prev = node;
		p.next = node;

		list.pos = node;
	}
	list.toString = function() {
		let cur = list.head.next;
		let str = "";
		while(true) {
			if(cur == list.tail) break;
			str += cur.str;
			cur = cur.next;
		}
		return str;
	}
    return list;
}

list = LinkedList();

function proc(input) {
	let str = input[0];
	[...str].forEach( (d) => list.add(d));
	let cnt = Number(input[1]);
	for(i=2;i<2+cnt;i++) {
		let c = [...input[i]][0];
		if(c == 'L') 
			list.L();
		else if(c == 'D')
			list.D();
		else if(c == 'B')
			list.B();
		else if(c == 'P')
			list.P([...input[i]][2]);
		
	}
	console.log(list.toString());

}
