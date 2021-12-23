let s = "pPoooyY";

s=s.toUpperCase();

let p_count = 0;
let y_count = 0;

for (let i = 0; i < s.length; i++) { 
    if(s[i]==P)
    {
        p_count++;   
    }
    else (s[i] == Y)
    { 
        y_count++;
    }
    
}
if (y_count == p_count || p_count && y_count == 0) {
    console.log(true);  
  //return true;
}
else
  console.log(false);
  //return false;
