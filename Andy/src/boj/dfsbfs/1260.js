process.stdin.resume();
process.stdin.setEncoding('utf8');

//백준, 1260, DFS와 BFS
const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n,m,start;
[n,m,start] = lines[0].split(" ").map(Number);

let tree = [];
for(let i=1;i<=n;i++)
	tree[i] = new Set();
	
for(let i=1;i<=m;i++) {
	let x,y;
	[x,y] = lines[i].split(" ").map(Number);
	
	tree[x].add(y);
	tree[y].add(x);
}

for(let i=1;i<=n;i++) {
	tree[i] = [...tree[i]].sort((a,b)=>a-b);
}

// DFS
arrDfs = [];
dfs(start);

function dfs(start) {
	let arr=[];
	rec(start);

	function rec(cur) {
		if(arr[cur] == 1) return;
		arr[cur] = 1;
		arrDfs.push(cur);
		
		tree[cur].forEach( (d) =>{
			rec(d);
		});
	}
}
console.log(arrDfs.join(" "));

// BFS
arrBfs = [];
bfs(start);

function bfs(start) {
	let arr=[];
	let buf=[];
	buf.push(start);
	arr[start] = 1;
	arrBfs.push(start);	
	rec();
	
	function rec() {
        while(true) {
    		let tmp = [];
    		buf.forEach( (d) => {
				tree[d].forEach( (d2) => {
					if(arr[d2] != 1) {
						arr[d2] = 1;
						arrBfs.push(d2);
						tmp.push(d2);
					}
				});
    		});
    		
            if(tmp.length===0) break;
            buf = tmp;            
        }		
	}
}
console.log(arrBfs.join(" "));