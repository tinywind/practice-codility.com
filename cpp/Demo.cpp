#include <iostream>
#include <vector>
using namespace std;

int solution(vector<int> &A) {
    long lastLeft = 0L;
    long lastRight = 0L;
    int lastP = -1;
    for (int p = 0; p < A.size(); p++) {
        long left = 0L;
        long right = 0L;

        if (lastP <= 0)
            for (int i = 0; i < p; i++)
                left += A[i];
        else
            left = lastLeft + A[lastP];

        if (lastP < 0)
            for (int i = p + 1; i < A.size(); i++)
                right += A[i];
        else if (lastP + 1 < A.size())
            right = lastRight - A[lastP + 1];
        else
            right = 0L;

        if (left == right)
            return p;

        lastP = p;
        lastLeft = left;
        lastRight = right;
    }

    return -1;
}

void p() {
	cout << "!!!Hello World!!!" << endl;
}

int main() {
	p();
	return 0;
}
