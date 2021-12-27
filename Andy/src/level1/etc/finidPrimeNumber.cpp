#include <string>
#include <vector>

using namespace std;

//프로그래머스 Level 1,소수 찾기
int solution(int n) {
    int answer = 0;
    int* arr = new int[n+1];
    for(int i=2;i<=n;i++) {
        if(arr[i]==2) continue;
        arr[i] = 1;
        for(int j=i*2;j<=n;j+=i) {
            arr[j] = 2;
        }
    }
    for(int i=2;i<=n;i++) 
        if(arr[i] == 1) answer++;
    delete[] arr;
    return answer;
}