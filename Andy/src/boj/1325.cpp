// 백준, 1325, 효율적인 해킹
#include<stdio.h>
#include<string.h>
#include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

#define MAXCOUNT  10001

int maxhack = 0;
vector<int> v[MAXCOUNT];

void rec(int* visit, int idx) {
	if (visit[idx] != 0) return;
	visit[idx] = 1;
	maxhack++;
	vector<int>::iterator itor = v[idx].begin();
	for (; itor != v[idx].end(); itor++) {
		rec(visit , *itor);
	}
}

int main() {
	int n, m, maxcnt = 0;
	scanf("%d %d", &n, &m);
	int a, b;
	for (int i = 0; i < m; i++) {
		scanf("%d %d", &a, &b);
		v[b].push_back(a);
	}

	int arr_cnt[MAXCOUNT];
	int visit[MAXCOUNT];
	for (int i = 1; i <= n; i++) {
		maxhack = 0;
		memset(visit, 0, sizeof(int) * (n+1));
		rec(visit, i);
		arr_cnt[i] = maxhack;
		if (maxcnt < maxhack) maxcnt = maxhack;
	}

	for (int i = 1; i <= n; i++) {
		if (arr_cnt[i] == maxcnt) cout << i << " ";
	}
	cout << endl;

	return 0;
}