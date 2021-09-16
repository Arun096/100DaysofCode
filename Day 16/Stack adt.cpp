#include<stdio.h>
#include<conio.h>
int max=20;
int i,a[20],top=0,n;
int main()
{
	void create(),push(),pop(),display();
	int choice,cont;
	do
	{
		printf("1.create \n2.push \n3.pop \n4.display\n");
	    printf("\nEnter ur choice:");
        scanf("%d",&choice);
	    switch(choice)
	    {
	    	case 1:
	    	{
	    		create();
				break;
			}
			case 2:
			{
				push();
				break;
			}
			case 3:
			{
				pop();
				break;
			}
			case 4:
		    {
		    	display();
		    	break;
			}
			printf("Enter 0 to quit and 1 to continue...");
			scanf("%d",&cont);		
		}
    } while(cont==1);
}
void create()
{
	printf("Enter the size of stack:");
	scanf("%d",&n);
	if(n<max)
	{
		printf("Enter the elements:");
		for(i=0;i<n;i++)
		{
			scanf("%d",&a[i]);
		}
		top=n-1;
		
	}
	else
	    printf("stack is not created!");
}
void push()
{
	int x;
	if(top<max)
	{
		printf("Enter the element to be pushed:");
		scanf("%d",&x);
		top=top+1;
		a[top]=x;
		top=n;
	}
	else
	    printf("unable to push...");       
}
void pop()
{
	if(top<0)
	{
		printf("stack is UNDERFLOW");
	}
	else
	{
		printf("The top element %d is deleted",a[top]);
		top=top-1;
		top=n;	
	}
}
void display()
{
	if(top<0)
	{
		printf("stack is UNDERFLOW");
	}
	else
	{
		printf("The elements in the stack are...\n");
		for(i=0;i<=top;i++)
		{
			printf("%d",a[i]);
		}
	}
}
