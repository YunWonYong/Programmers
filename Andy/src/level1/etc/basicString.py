# 프로그래머스 Level 1,문자열 다루기 기본
def solution(s):
    if(len(s) != 4 and len(s) != 6):
        return False;    
    return s.isdigit();