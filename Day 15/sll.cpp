#include<stdio.h>  
#include<stdlib.h> 
struct node
{
    int data;
    struct node*next;
};
struct node*head;
void beginsert();   
void lastinsert();  
void begindelete();  
void lastdelete();  
void main()  
{  
    int choice=0;
    while(choice!=4)
    { 
        printf("\n1.Insert in begining\n2.Insert at last\n3.Delete from Beginning\n4.Delete from last\n"); 
        printf("\nEnter your choice:");         
        scanf("%d",&choice); 
        switch(choice)  
        {  
            case 1: 
            {
                beginsert();      
                break;
            }
            case 2:
            {
                lastinsert(); 
                break;
            }
            case 3: 
            {
                begindelete();       
                break;  
            }
            case 4:
            {
                lastdelete();        
                break;
            }
        }printf("Enter the choice...");
    } 
}  
void beginsert()  
{  
    struct node *ptr;  
    int item;  
    ptr=(struct node *)malloc(sizeof(struct node *));  
    if(ptr==NULL)  
    {  
        printf("\nOVERFLOW");  
    }  
    else  
    {  
        printf("\nEnter value\n");    
        scanf("%d",&item);    
        ptr->data=item;  
        ptr->next=head;  
        head=ptr;  
        printf("\nNode inserted");  
    }  
      
}  
void lastinsert()  
{  
    struct node *ptr,*temp;  
    int item;     
    ptr=(struct node*)malloc(sizeof(struct node));      
    if(ptr==NULL)  
    {  
        printf("\nOVERFLOW");     
    }  
    else  
    {  
        printf("\nEnter value:");  
        scanf("%d",&item);  
        ptr->data=item;  
        if(head==NULL)  
        {  
            ptr->next=NULL;  
            head=ptr;  
            printf("\nNode inserted");  
        }  
        else  
        {  
            temp=head;  
            while(temp->next!=NULL)  
            {  
                temp=temp->next;  
            }  
            temp->next=ptr;  
            ptr->next=NULL;  
            printf("\nNode inserted");  
          
        }  
    }  
}  
void begindelete()  
{  
    struct node *ptr;  
    if(head==NULL)  
    {  
        printf("\nList is empty\n");  
    }  
    else   
    {  
        ptr=head;  
        head=ptr->next;  
        free(ptr);  
        printf("\nNode deleted from beginning\n");  
    }  
}  
void lastdelete()  
{  
    struct node *ptr,*ptr1;  
    if(head==NULL)  
    {  
        printf("\nlist is empty");  
    }  
    else if(head->next==NULL)  
    {  
        head=NULL;  
        free(head);  
        printf("\nOnly node of the list deleted ...\n");  
    }  
          
    else  
    {  
        ptr=head;   
        while(ptr->next!=NULL)  
        {  
            ptr1=ptr;  
            ptr=ptr->next;  
        }  
        ptr1->next=NULL;  
        free(ptr);  
        printf("\nDeleted Node from the last ...\n");  
    }     
}  

   
 
  
