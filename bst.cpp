#include<iostream>
using namespace std;

struct BstNode{
    string id;
    string name;
    double cgpa;
    BstNode *left;
    BstNode *right;
};

BstNode *root;


BstNode *GetNewNode(string id,
                    string name,
                    float cgpa){

    BstNode *NewNode = new BstNode();
    NewNode->id = id;
    NewNode->name=name;
    NewNode->cgpa=cgpa;
    NewNode->left = NULL;
    NewNode->right = NULL;
    return NewNode;
}




// insertion process
BstNode *Insert(BstNode *root,
                string id,
                string name,
                float cgpa){

    if(root==NULL){
        root = GetNewNode(id, name, cgpa);
        cout << "Succesfully Inserted!" << " ";
    }
    else if(id <= root->id){
        root->left = Insert(root->left, id, name, cgpa);
    }
    else{
        root->right = Insert(root->right, id, name, cgpa);
    }
    return root;
}



// Inorder traversal
void inorderTraversal(struct BstNode* root) {
    if(root == NULL){
        return;
    }

    inorderTraversal(root->left);
    cout << "ID:    " << root->id <<" ";
    cout << "NAME:  "<< root->name << "";
    cout << "CGPA:  " << root->cgpa << "";
    inorderTraversal(root->right);
}


bool Search(BstNode *root,
            string id){

    if(root==NULL){
        cout << "No student details" << "";
        return false;
    }
    else if(root->id == id){
        return true;
    }
    else if(id <= root->id){
        return Search(root->left, id);
    }
    else{
        return Search(root->right, id);
    }
}



int main()
{
    cout << "";
    root = NULL;

    root = Insert(root, "1", "X", 4.00);
    root = Insert(root, "8", "Y", 3.35);
    root = Insert(root, "5", "Z", 3.12);




    cout << "";
    cout << "Student Deatils" << "";
    cout << "--------------------------------------------" << "";
    inorderTraversal(root);
    cout << "";


    cout << "Enter search id: ";
    string s;
    cin >> s;
    cout << "";

    if(Search(root, s) == true){
        cout << "Student id found!" << "";
    }
    else{
        cout << "Student id not found" << "";
    }


    return 0;
}
