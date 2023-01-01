#include <iostream>
#include <string.h>
#include<ctime>
using namespace std;

class toll_box
{
   public:
   string vehicles_no;
   string ticket_no;
   void add_vehicles();
   void display();
};

void toll_box::add_vehicles()
{
    time_t tmNow;
    tmNow = time(NULL);
    struct tm t = *localtime(&tmNow);
    cout<<endl<<endl<<"Date: "<<t.tm_mday<<"-"<<t.tm_mon+1<<"-"<<t.tm_year+1900<<endl;
    cout<<"Enter Vehicle Number:";
    cin>>vehicles_no;
    cout<<"Enter Ticket Number:";
    cin>>ticket_no;
    cout<<endl<<endl<<endl;
}

void toll_box::display()
{
    time_t tmNow;
    tmNow = time(NULL);
    struct tm t = *localtime(&tmNow);
    cout<<"Date: "<<t.tm_mday<<"-"<<t.tm_mon+1<<"-"<<t.tm_year+1900<<endl;
    cout<<"Vehicle Number:"<<vehicles_no<<endl;
    cout<<"Ticket Number:"<<ticket_no<<endl<<endl<<endl;
}



int main()
{
   toll_box entry[100];
   int counting=0,high_rate=0,medium_rate=0,low_rate=0;
   int i,option,input;
   string vehicle;

   while(1)
   {
       cout<<"======== Options ========"<<endl;
       cout<<"1. Heavy Duty Vehicle"<<endl;
       cout<<"2. Medium Duty Vehicle"<<endl;
       cout<<"3. Light Duty Vehicle"<<endl;
       cout<<"4. Today's Total Tax"<<endl;
       cout<<"5. Search Vehicle"<<endl;
       cout<<"0. Exit"<<endl;
       cout<<"Select the Options:";
       cin>>option;

       switch(option)
       {
           case 1: entry[counting].add_vehicles();
                   high_rate +=800;
                   counting++;
                   break;

           case 2: entry[counting].add_vehicles();
                   medium_rate += 500;
                   counting++;
                   break;

           case  3:entry[counting].add_vehicles();
                   low_rate +=300;
                   counting++;
                   break;

            case 4: cout<<endl<<endl<<"1. Heavy Duty Vehicle"<<endl;
                    cout<<"2. Medium Duty Vehicle"<<endl;
                    cout<<"3. Light Duty Vehicle"<<endl<<"Select:";
                    cin>>input;

                    if(input == 1){
                        time_t tmNow;
                        tmNow = time(NULL);
                        struct tm t = *localtime(&tmNow);
                        cout<<endl<<endl<<"Date: "<<t.tm_mday<<"-"<<t.tm_mon+1<<"-"<<t.tm_year+1900<<endl;
                        cout<<"Total Heavy Duty Tax collection:"<<high_rate<<endl<<endl<<endl;
                    }
                    else if(input == 2){
                        time_t tmNow;
                        tmNow = time(NULL);
                        struct tm t = *localtime(&tmNow);
                        cout<<endl<<endl<<"Date: "<<t.tm_mday<<"-"<<t.tm_mon+1<<"-"<<t.tm_year+1900<<endl;
                        cout<<"Total Medium Duty Tax collection:"<<medium_rate<<endl<<endl<<endl;
                    }

                    else if(input == 3){
                        time_t tmNow;
                        tmNow = time(NULL);
                        struct tm t = *localtime(&tmNow);
                        cout<<endl<<endl<<"Date: "<<t.tm_mday<<"-"<<t.tm_mon+1<<"-"<<t.tm_year+1900<<endl;
                        cout<<"Total Light Duty Tax collection:"<<low_rate<<endl<<endl<<endl;
                    }

                    else
                        cout<<"OOPS!! Please enter a correct choice"<<endl<<endl<<endl;
                    break;

           case 5: cout<<"Enter Vehicle Number:";
                   cin>>vehicle;

                   for( i=0; i<counting ; i++)
                   {
                       if(entry[i].vehicles_no == vehicle)
                       {
                           cout<<endl<<"Matched!!"<<endl<<"Details of Vehicle:"<<endl;
                           entry[i].display();
                           break;
                       }
                   }
                   if(i>=counting)
                        cout<<"No match found!"<<endl<<endl;
                   break;


            case 0: exit(0);

            default: cout<<"OOPS!! Please enter a correct choice"<<endl<<endl<<endl;
       }
   }
   return 0;

}
