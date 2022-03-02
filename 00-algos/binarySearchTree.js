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

    getHeight(node = this.root, count=0){
        
        //base case is when we know exactly what to return. If the node is == null, return 0
        if(node == null){
            return count;
        }else{
            let max = Math.max(this.getHeight(node.left, count+1), this.getHeight(node.right, count+1))
            return max
        }

    }

    totalSize(node = this.root){
        //base case- simple case for the problem 
        //if node is equal to null, then it will return zero

        if(node==null){
            console.log("node is null")
            return 0
        }
        //if node is not null then we need to recursively go from node to node 
        else{
            console.log("this is the current node-->", node.value)
            
            return 1+  this.totalSize(node.left)+ this.totalSize(node.right)
            

        }
        
        }



    

    

}


let bst1 = new BST()

bst1.insert(5).insert(3).insert(12).insert(10).insert(1).insert(4).insert(7)

console.log(bst1.totalSize())