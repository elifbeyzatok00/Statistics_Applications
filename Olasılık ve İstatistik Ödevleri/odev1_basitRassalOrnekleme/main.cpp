#include <iostream>
#include <stdlib.h>
#include <time.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;


int main(int argc, char** argv) {
	int min, max, num, random, i, j, a, b ;

    cout<<("minimum deger giriniz: ");
	cin>>min;
	cout << ("maximum deger giriniz: ");
	cin >> max;
	cout << ("Kac tane sayi secilsin?: ");
	cin >> num;
	srand(time(NULL));

	int* d = new int[num];
	
	if (num <= (max - min)+1) {
		for (i = 0; i < num; i++)
		{
		e:
			random = min + (rand() % ((max - min)+1));
			for (j = 0; j < num; j++) {
				if (random == d[j])
					goto e;
			}

			d[i] = random;

		}
	}
	else {
		for (i = 0; i < num; i++)
		{

			random = min + (rand() % (max - min));
			d[i] = random;

		}
	}

	for (i = 0; i < num; i++)
		cout<<d[i]<<" ";
	return 0;
}
