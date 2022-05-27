#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n,i,k,j,min,max,R,h,sayac;
	int sayi,gecici=0,gecici2=0,gecici3=0,sinif1,sinif3;
	double n14,n34,j1,fq1,q1,j3,fq3,q3,l1,l3;
	
		printf(" dizi boyutu olacak n degerini giriniz:");
	scanf("%d",&n);
	
	int d[n];
	int yedek[n];
	
	for(i=0;i<n;i++)
	{
		printf("diziye deger girin:");
		scanf("%d",&d[i]);	
	}


   for(i=0; i<n-1;i++)
   { 
        for(j=i+1; j<n; j++)
		{	
            if(d[i] > d[j])
			{
                gecici = d[i];
                d[i] = d[j]; 
                d[j] = gecici; 
            }
        }
	}
	for(i=0;i<n;i++)
	{
		yedek[i]=1;
		gecici2=i;
		gecici3=i+1;
		 while(d[i]==d[i+1])
		 {
		 	yedek[gecici2]+=1;
		 	yedek[gecici3]=0;
		 	i++;
		 	gecici3++;
		 }
		
	}
	
	for(i=0;i<n;i++)
	{
		printf("%d ",d[i]);
	}
     	printf("\n\n");
        
	
	min=d[0];
	max=d[n-1];
	R=max-min;
	k=ceil(pow(n,1.0/2));
	h=ceil((double)R/(double)k);
	
	printf("R degeri: %d \n",R);
	printf("k degeri: %d \n",k);
	printf("h degeri: %d \n",h);	

	
	int sina[k],sinu[k],sf[k],ef[k];
	double ssa[k],ssu[k],son[k],of[k],eof[k];
	
	sina[0]=d[0];
	
	for(i=1;i<k;i++)
		sina[i]=(sina[i-1])+h;
		
	sinu[0]=(sina[1]-1);
	
	for(i=1;i<k;i++)
		sinu[i]=sinu[i-1]+h;
		
		printf("\n\n**SINIF LIMITLERI**\n\n");
		
	for(i=0;i<k;i++)
		printf("%d  %d\n",sina[i],sinu[i]);
	
	ssa[1]=((double)sina[1]+(double)sinu[0])/(double)2;
	ssa[0]=ssa[1]-h;
	for(i=2;i<k;i++)
		ssa[i]=(ssa[i-1])+h;
		
	ssu[0]=ssa[1];
	
	for(i=1;i<k;i++)
		ssu[i]=ssu[i-1]+h;
		
		printf("**SINIF SINIRLARI**\n\n");
		
	for(i=0;i<k;i++)
		printf("%.2lf  %.2lf\n",ssa[i],ssu[i]);
	
	for(j=0;j<k;j++){
		sayac=0;
		for(i=0;i<n;i++){
		if(d[i]<ssu[j] && d[i]>ssa[j])
		sayac=sayac+1;
		}
		
		sf[j]=sayac;
	}

	printf("**SINIF FREKANSLARI**\n\n");
	
	for(i=0;i<k;i++)
		printf("%d\n",sf[i]);
		
	for(i=0;i<k;i++)
		son[i]=(ssa[i]+ssu[i])/2;
	
	printf("**SINIF ORTA NOKTALARI**\n\n");

	for(i=0;i<k;i++)
		printf("%lf\n",son[i]);	
		
		ef[0]=sf[0];
		
	for(i=1;i<k;i++)
		ef[i]=ef[i-1]+sf[i];
		
	printf("**EKLENIK FREKANS**\n\n");
		
	for(i=0;i<k;i++)
		printf("%d\n",ef[i]);
	
	for(i=0;i<k;i++)
		of[i]=(double)sf[i]/(double)ef[k-1];
	
	printf("**ORANSAL FREKANS**\n\n");
	
		for(i=0;i<k;i++)
		printf("%.2lf\n",of[i]);	
		
	for(i=0;i<k;i++)
		eof[i]=(double)ef[i]/(double)ef[k-1];
		
		
		printf("**EKLENIK ORANSAL FREKANS**\n\n");
		for(i=0;i<k;i++)
		printf("%.2lf\n",eof[i]);	
		
	n14=(double)n/(double)4;
	
	for(i=0;i<k;i++){
		if(n14<(double)ef[i]){
			sinif1 = i;
			break;
		}	
	}
		
		if(sinif1 == 0){
			j1 = n14;
		}
		else {
			j1 = n14 - ef[sinif1-1];
		}
		l1 = ssa[sinif1];
		fq1 = sf[sinif1];
	
		q1 = l1 + ((j1*h)/fq1);
		
		
	n34=3*((double)n/(double)4);	
		
	for(i=0;i<k;i++){
		if(n34<(double)ef[i]){
			sinif3 = i;
			break;
		}
	}
		
		if(sinif3 == 0){
			j3 = n34;
		}
		else {
			j3 = n34 - ef[sinif3-1];
		}
		l3 = ssa[sinif3];
		fq3 = sf[sinif3];
	
		q3 = l3 + ((j3*h)/fq3);
		
		printf("\n\n");
		printf("Q1 =%lf\n",q1);
		printf("Q3 =%lf",q3);
		
		getchar();
		getchar();
	
	return 0;
}
