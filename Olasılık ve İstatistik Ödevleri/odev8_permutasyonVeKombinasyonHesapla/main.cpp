#include <iostream>
using namespace std;

double faktoriyel(int a)
{
    double sayac = 1;
    for (int i = 1;i < a + 1;i++)
    {
        sayac *= i;
    }
    return sayac;
}

int main()
{
    setlocale(LC_ALL, "Turkish");
    int x, n, r;
    double kombinasyon, permutasyon;
    cout << "**** Kombinasyon ve Perm�tasyon ****" << endl;
    deger:cout << "Kombinasyon i�lemi yapmak i�in 1; Perm�tasyon i�lemi yapmak i�in 2'ya bas�n�z:";
    cin >> x;
    if (x == 1)
    {
        cout << "n de�erini giriniz: ";
        cin >> n;
        cout << "r de�erini giriniz: ";
        cin >> r;
        kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        cout << "Sonu�: " << kombinasyon << endl;
    }
    if (x == 2)
    {
        cout << "n de�erini giriniz: ";
        cin >> n;
        cout << "r de�erini giriniz: ";
        cin >> r;
        permutasyon = faktoriyel(n) / faktoriyel(n - r);
        cout << "Sonu�: " << permutasyon << endl;
    }
    else
        goto deger;
    cout << endl;
    goto deger;

}
