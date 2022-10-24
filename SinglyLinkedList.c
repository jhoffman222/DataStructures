#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
} *first = NULL;

void createLinkedList(const int *A, int n) {
    int i;
    struct Node *t, *last;
    first = (struct Node *) malloc(sizeof(struct Node));
    first->data = A[0];
    first->next = NULL;
    last = first;

    for (i = 1; i < n; i++) {
        t = (struct Node *) malloc(sizeof(struct Node));
        t->data = A[i];
        t->next = NULL;
        last->next = t;
        last = t;
    }
}

void display(struct Node *p) {
    while (p != NULL) {
        printf("%d ", p->data);
        p = p->next;
    }
    printf("\n");
}

int count(struct Node *p) {
    int l = 0;
    while (p) {
        l++;
        p = p->next;
    }
    return l;
}

void insert(struct Node *p, int index, int x) {
    struct Node *t;
    int i;

    if (index < 0 || index > count(p))
        return;
    t = (struct Node *) malloc(sizeof(struct Node));
    t->data = x;

    if (index == 0) {
        t->next = first;
        first = t;
    } else {
        for (i = 0; i < index - 1; i++)
            p = p->next;
        t->next = p->next;
        p->next = t;
    }
}

int deleteNode(struct Node *p, int index) {
    struct Node *q = NULL;
    int x = -1, i;

    if (index < 0 || index > count(p))
        return -1;
    if (index == 0) {
        q = first;
        x = first->data;
        first = first->next;
        free(q);
        return x;
    } else {
        for (i = 0; i < index; i++) {
            q = p;
            p = p->next;
        }
        q->next = p->next;
        x = p->data;
        free(p);
        return x;
    }
}

int main() {
    int A[] = {1, 2, 3, 4, 5, 6};
    createLinkedList(A, 6);
    display(first);
    insert(first, 0, 0);
    display(first);
    deleteNode(first, 0);
    display(first);

    return 0;
}
