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
    cout << "**** Kombinasyon ve Permütasyon ****" << endl;
    deger:cout << "Kombinasyon iþlemi yapmak için 1; Permütasyon iþlemi yapmak için 2'ya basýnýz:";
    cin >> x;
    if (x == 1)
    {
        cout << "n deðerini giriniz: ";
        cin >> n;
        cout << "r deðerini giriniz: ";
        cin >> r;
        kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        cout << "Sonuç: " << kombinasyon << endl;
    }
    if (x == 2)
    {
        cout << "n deðerini giriniz: ";
        cin >> n;
        cout << "r deðerini giriniz: ";
        cin >> r;
        permutasyon = faktoriyel(n) / faktoriyel(n - r);
        cout << "Sonuç: " << permutasyon << endl;
    }
    else
        goto deger;
    cout << endl;
    goto deger;

}
