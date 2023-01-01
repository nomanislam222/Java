#include <iostream>
#include <list>
using namespace std;


 struct node{
    int type;
    string date;
    string vehicle_no;
    int ticket_no;
};

node* new_node(int type, string date, string vehicle_no, int ticket_no){
    node *newNode = new node;
    newNode->type = type;
    newNode->date = date;
    newNode->vehicle_no = vehicle_no;
    newNode->ticket_no = ticket_no;
    return newNode;
}
int main(){
    list<node*> vehicle_list;
    int high_rate =0, medium_rate=0, low_rate =0;

    vehicle_list.push_back(new_node(1, " 22/22/22", "HR-54A-2783  ", 122));
    vehicle_list.push_back(new_node(2, "22/22/22", "SC-44G-1767  ", 123));
    vehicle_list.push_back(new_node(3, " 22/22/22", "BR-54B-1586  ", 124));
    vehicle_list.push_back(new_node(2, "22/22/22", "RT-75T-1499  ", 125));
    vehicle_list.push_back(new_node(1, " 22/22/22", "NP-40X-2506  ", 126));


    cout<<"   Vehicle Type       Date     Vehicle    Ticket"<<endl;
    for(auto i = vehicle_list.begin(); i!= vehicle_list.end(); i++){

        if((*i)->type == 1){
            cout<< "Heavy Duty Vehicle";
            high_rate +=800;
            }

        else if((*i)->type == 2) {
            cout<<"Medium Duty Vehicle";
            medium_rate +=500;
            }

        else{
            cout<<"Low Duty Vehicle  ";
            low_rate +=300;
            }

        cout<<" "<<(*i)->date<<" "<<(*i)->vehicle_no<<" "<<(*i)->ticket_no<<endl;

    }
        cout<<endl<<endl<<"Total Tax Collection:"<<high_rate+medium_rate+low_rate<<endl;
        cout<<"High Duty Tax Collection:"<<high_rate<<endl;
        cout<<"Medium Duty Tax Collection:"<<medium_rate<<endl;
        cout<<"Low Duty Tax Collection:"<<low_rate<<endl<<endl;
}
