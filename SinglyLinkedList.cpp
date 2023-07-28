#include <iostream>
using namespace std;

int main()
{
    struct node
    {
        int data;
        struct node *next;
    };
    struct node *head, *newnode, *temp;
    int ch;
    head = 0;

    while (ch)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        cout << "enter the number:";
        cin >> newnode->data;
        if (head == 0)
        {
            head = temp = newnode;
            newnode->next = 0;
        }
        else
        {
            temp->next = newnode;
            temp = newnode;
        }
        cout << "want to continue press 1 or 0:";
        cin >> ch;
    }

    temp = head;
    while (temp != 0)
    {
        cout << temp->data << endl;
        temp = temp->next;
    }
}