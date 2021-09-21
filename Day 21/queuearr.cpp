#include<stdio.h> 
#include<conio.h> 
#include<stdlib.h> 
#define SIZE 5 
int front=-1; 
int rear=-1; 
int q[SIZE]; 
void insert(); 
void del(); 
void display(); 
void main() 
{ 
    int choice,cont; 
    do 
    { 
        printf("\n QUEUE ADT USING ARRAY\n"); 
        printf("\n1. Insert"); 
        printf("\n2. Delete"); 
        printf("\n3. Display ");
        printf("\n4. Exit"); 
        printf("\nEnter Your Choice:"); 
        scanf("%d",&choice); 
        switch(choice) 
        { 
            case 1: 
                insert(); 
		display(); 
		break; 
            case 2: 
                del(); 
		display(); 
		break; 
            case 3:
	        display(); 
                break; 
            case 4: 
                exit(0); 
       }printf("\nEnter 0 to quit and 1 to continue:");
        scanf("%d",&cont);
    }while(cont==1);
} 
void insert() 
{ 
    int no; 
    printf("\nEnter No:"); 
    scanf("%d",&no); 
    if(rear<SIZE-1) 
    { 
        q[++rear]=no; 
        if(front==-1) 
        front=0;
    }     
    else 
    { 
        printf("\nQueue overflow"); 
    } 
} 
void del() 
{ 
    if(front==-1) 
    { 
        printf("\nQueue Underflow"); 
        return; 
    } 
    else 
	{ 
        printf("\nDeleted Item:-->%d\n",q[front]); 
    } 
    if(front==rear) 
    { 
        front=-1; 
        rear=-1; 
    } 
    else 
    {
	    front=front+1; 
    }
} 
void display() 
{ 
    int i; 
    if(front==-1) 
    {     
        printf("\nQueue is empty...."); 
        return; 
    } 
    for(i=front;i<=rear;i++) 
        printf("%d\n",q[i]);
} 