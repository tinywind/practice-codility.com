#include <iostream>
#include <cstdarg>
#include <vector>

using namespace std;
/**
 * https://codility.com/demo/take-sample-test/
 *
 * @author tinywind
 * score: unknown
 */
int solution(vector<int> &A) {
	long lastLeft = 0L;
	long lastRight = 0L;
	size_t lastP = -1;
	for (size_t p = 0; p < A.size(); p++) {
		long left = 0L;
		long right = 0L;

		if (lastP <= 0)
			for (size_t i = 0; i < p; i++)
				left += A[i];
		else
			left = lastLeft + A[lastP];

		if (lastP < 0)
			for (size_t i = p + 1; i < A.size(); i++)
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

void p(int count, ...) {
	vector<int> a;
	cout << "A([";
	va_list ap;
	va_start(ap, count);
	for (int j = 0; j < count; ++j) {
		int i = va_arg(ap, int);
		a.push_back(i);
		cout << i << " ";
	}
	va_end(ap);
	cout << "]) : " << solution(a) << endl;
}

int main() {
	p(8, -1, 3, -4, 5, 1, -6, 2, 1);
	return 0;
}
