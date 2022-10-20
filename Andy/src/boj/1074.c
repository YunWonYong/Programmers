// 백준, 1074,Z
// https://www.acmicpc.net/problem/1074
#include <stdio.h>
#include <math.h>

int findLoc(int n,int r,int c) {
	int center = pow(2,n)/2;
	return (center<=c) + (center<=r)*2;
}

int foo(int n,int r,int c) {
	int loc = findLoc(n,r,c);
	if(n==1) return loc;
	int mid = pow(2,n-1);
	return (loc * mid * mid) + foo(n-1, r>=mid?r-mid:r, c>=mid?c-mid:c);
}

int main(void) {
    int n,r,c;
	scanf("%d %d %d",&n,&r,&c);
	printf("%d",foo(n,r,c));
	return 0;
}