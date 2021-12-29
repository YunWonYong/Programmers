#include <iostream>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

//프로그래머스 Level 1,서울에서 김서방 찾기
string solution(vector<string> seoul) {
    char str[128];
    vector<string>::iterator it = find(seoul.begin(), seoul.end(), "Kim");
    sprintf(str,"김서방은 %d에 있다", (it - seoul.begin()));
    string answer = str;
    return answer;
}