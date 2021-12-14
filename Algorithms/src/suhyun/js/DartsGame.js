const solution = (dartResult) =>  {
	var answer = 0;
	var count =0;
	var answer2 = [,,];
	var dartResult = "1D2S3T*";
	var array = dartResult.split("");
	
	for (var i = 0; i < dartResult.length; i++){
	    if (array[i] == 'S') {
	       // console.log(answer[count]);
	    }
	    else if (array[i] == 'D') {
	        answer2[count - 1] = answer2[count - 1] * answer2[count - 1];
	       // console.log(answer[count]);
	    }
	    else if (array[i] == 'T') { 
	        answer2[count - 1] = answer2[count - 1] * answer2[count - 1] * answer2[count - 1];
	       // console.log(answer[count]);
	
	    }
	    else if(array[i]=='*')
	    { 
	        if (count == 1) {
	            answer2[0] = 2 * answer2[0];
	        }
	        else if (count > 1) {
	            answer2[count - 2] = answer2[count - 2] * 2;
	            answer2[count - 1] = answer2[count - 1] * 2;
	        }
	        //console.log(answer[count]);
	
	    }
	    else if (array[i] == '#') { 
	        answer2[count - 1] = -answer2[count - 1];
	    }
	
	    else {
	
	        answer2[count] = parseInt(array[i]);
	        //console.log(answer[count]);
	        if (parseInt(array[i])== 1) { 
	            if (parseInt(array[i + 1]) == 0) { 
	                answer2[count] = 10;
	                i++;
	            }
	        }
	
	        count++;
	        //console.log(answer[count]);
	    }
	
	}
	for (var i = 0; i < 3; i++) { 
	    answer = answer + answer2[i];
	}
	console.log(answer);
};