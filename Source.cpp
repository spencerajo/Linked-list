#include<iostream> //MAYBE TRY TO DEFINE A CONSTRUCTOR TO MAKE THINGS EASIER
using namespace std; 
struct Node {
	int data; 
	Node* next; 

	void create(int); 
	void print(); 
	void reverse(); 
};

struct Node* head = NULL;

int main() {

	Node n1; 
	n1.create(13); 
	n1.create(99); 
	n1.create(45);
	n1.create(101); 
	n1.print();

	cout << endl;
	n1.reverse(); 
	n1.print(); 

	system("pause"); 
	return 0; 
}

void Node::create(int item) {
	Node* temp = new Node(); //does the same as malloc()
	Node* curr; 

	if (head == NULL) {
		temp->data = item;
		temp->next = NULL;
		head = temp;
		return;	//get tf outta the fxn and put the node at the first position
	}
	if (head != NULL) {
		curr = head; 
 		while (curr->next != NULL) {
			curr = curr->next; 
		}
		temp->data = item;
		temp->next = NULL;
		curr->next = temp; 
		return; //get tf out of the fxn and put the node at the last position
	}
}

void Node::print() {
	Node* temp = head; 

	while (temp != NULL) {
		cout << temp->data << endl; 
		temp = temp->next; 
	}	
}

void Node::reverse() {
	//you dont need to allocate memory w/ 'new' keyword, 
	//it will return unwanted zeros in your list  
	Node* curr = head;
	Node* prev = NULL;
	Node* nxt = NULL;

	while (curr != NULL) {
		nxt = curr->next;
		curr->next = prev;
		prev = curr;
		curr = nxt;
	}
	head = prev; //set the  head to the last node of the linked list

	return;
}