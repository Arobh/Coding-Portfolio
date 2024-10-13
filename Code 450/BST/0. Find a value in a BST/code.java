class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root==null)  return false;
        if(root.data==x)    return true;
        else if(root.data>x)    return search(root.left,x);
        else    return search(root.right,x);
    }
}
