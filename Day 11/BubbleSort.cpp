#include<stdio.h>
#include<conio.h>
int main()
{
	int n,i,j,temp;
	int a[100];
	printf("Enter the number of elements:");
	scanf("%d",&n);
	printf("\n");
	printf("Enter the %d array elements:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(a[j+1]<a[j])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	printf("\n");
	printf("\nThe sorting elements are...");
	for(i=0;i<n;i++)
	{
		printf("\n%d",a[i]);
	}
	printf("\n");
}
