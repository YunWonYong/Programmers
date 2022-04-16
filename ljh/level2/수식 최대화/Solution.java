/**
 *  수식 최대화
 */

 import java.util.List;
import java.util.ArrayList;

class Solution {
    public long solution(String expression) {
        List<Long> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        divide(expression, numbers, operators);
 
        char[][] permutation = {
            {'+', '-', '*'}, {'+', '*', '-'},
            {'-', '+', '*'}, {'-', '*', '+'},
            {'*', '+', '-'}, {'*', '-', '+'}};
        
        long max = 0;
        long result = 0;
        for (char[] arr : permutation) {
            result = process(numbers, operators, arr, arr.length + 1, 0);
            result = result > 0? result : -result;
            if (result > max) {
                max = result;
            }
        }

        return max;
    }  
    
    public void divide(String expression, List<Long> numbers, List<Character> operators) {
        long num = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if ('0' <= c && c <= '9') {
                num = num * 10 + (c - '0');
                continue;
            }
            numbers.add(num);
            num = 0;
            operators.add(c);
        }
        numbers.add(num);
    }
    
    public long process(List<Long> numbers, List<Character> operators, char[] arr, int last, int r) {      
        if (r == last) {
            return numbers.get(0);
        }
        
        List<Long> newNumbers = new ArrayList<>();
        List<Character> newOperators = new ArrayList<>();
        int numPointer = 0;
        int operPointer = 0;
        
        newNumbers.add(numbers.get(numPointer++)); 
        while (operPointer < operators.size()) {
            char c = operators.get(operPointer);
            long num = numbers.get(numPointer);
            if (c == arr[r]) {
                newNumbers.add(calculate(newNumbers.remove(newNumbers.size() - 1), num, c));
            } else {
                newNumbers.add(num);
                newOperators.add(c);
            }
            numPointer++;   
            operPointer++;
        }
    
        return process(newNumbers, newOperators, arr, last, r + 1);
    }
    
    public long calculate(Long a, Long b, char c) {
        long result = 0;
        switch(c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
        }
        return result;
    }
    
}