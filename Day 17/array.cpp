#include<stdio.h> 
#include<conio.h> 
#define MAX 10 
void create(); 
void insert(); 
void deletion(); 
void search(); 
void display(); 
int a,b[20],n,p,e,f,i,pos; 
int main() 
{ 
     
    int ch,cont;
    do 
    { 
        printf("***********************ARRAY IMPLEMENTATION***************************");
        printf("\n 1.Create \n 2.Delete \n 3.Search \n 4.Insert \n 5.Display\n");  
        printf("\nEnter ur choice:");
	scanf("%d",&ch);
	switch(ch) 
	{ 
	case 1: 
	    create(); 
            break; 
        case 2: 
            deletion(); 
            break; 
        case 3: 
	    search(); 
	    break; 
	case 4: 
	    insert(); 
	    break; 
        case 5: 
            display(); 
            break; 
    }printf("\n\nenter 0 to quit and 1 to continue\n");
    scanf("%d",&cont);
  }while(cont==1);
}
void create() 
{ 
    printf("Enter the number of nodes:"); 
    scanf("%d", &n); 
    printf("Enter the  Element:\n",i+1); 
    for(i=0;i<n;i++) 
    { 
        scanf("%d", &b[i]); 
    } 
} 
void deletion() 
{ 
    printf("Enter the position u want to delete:"); 
    scanf("%d", &pos); 
    if(pos>=n) 
    { 
        printf("Invalid Location:"); 
    } 
    else 
    { 
        for(i=pos+1;i<n;i++) 
        { 
            b[i-1]=b[i]; 
        } 
        n--; 
    } 
    printf("The Elements after deletion...\n"); 
    for(i=0;i<n;i++) 
    { 
        printf("\n%d", b[i]); 
    } 
} 
void search() 
{ 
    printf("Enter the Element to be searched:"); 
    scanf("%d", &e); 
    for(i=0;i<n;i++) 
    { 
        if(b[i]==e) 
        { 
            printf("Value is in the %d Position", i); 
        }
    } 
} 
void insert() 
{ 
    printf("Enter the position u need to insert:"); 
    scanf("%d", &pos); 
    if(pos>=n) 
    { 
        printf("invalid Location::"); 
    } 
	else 
    { 
        for(i=MAX-1;i>=pos-1;i--) 
        { 
            b[i+1]=b[i]; 
        } 
        printf("Enter the element to insert:\n"); 
        scanf("%d",&p); 
        b[pos]=p; 
        n++; 
    } 
    printf("\nThe list after insertion.....\n"); 
    display();
} 
void display()
{ 
    printf("The Elements of The list ADT are:\n"); 
    for(i=0;i<n;i++) 
    { 
        printf("\n%d", b[i]); 
    }
} 

