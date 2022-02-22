class Node{
    constructor(valueInput){
        this.value = valueInput;
        this.left = null;
        this.right = null;
    }
}


class BST{
    constructor(){
        this.root = null;
    }


    insert(valueInput){
        //create a node with thee value input and insert it into the tree using the rules of a bst
        let newNode = new Node(valueInput)
        //if the root is null we want to insert a new node and make it the valueInput.
        if(this.root == null){
            //make root equal to new node
            this.root = newNode
            return this
        }
        //else if the root is not null we want to see if valueInput is greater than or less than the value of the root
        //create a variable to iternate through the tree called current and set it equal to the root 
            //while current is pointing to node, traverse (go from one node to another) through the tree. 
                //if the valueInput is greater than the value of the current node
                    //if the current.right=null then set current.right to equal to newNode
                    //else set current to equal to current.right 
                // if the valuueInput is less than the value of current node 
                    //if the current.left=null then set current.left to equal to newNode
                    ////else set current to equal to current.left
        else {
            let current = this.root
            while(current != null){
                if(valueInput > current.value){
                    if(current.right == null){
                        current.right = newNode
                        return this
                    }else{
                        current = current.right
                    }
                }
                else{
                    if(current.left == null){
                        current.left = newNode
                        return this
                    }else{
                        current = current.left
                    }
                }
            }
        }
        return this


}


let bst1 = new BST()

bst1.insert(5)

console.log(bst1)