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
    
        isFull(node = this.root){ 
            //return true if the tree is full (every node either has 0 children or 2 children). Return false if tree is not full (at least one node in the tree has only one child)
            console.log("1")
            
            if(node.right != null && node.left != null){ //if it has 2 children
                // console.log("2")
                // let flagleft= this.isFull(node.left)
                // console.log("3")
                // let flagright= this.isFull(node.right)
                // console.log("4")

                // if(flagleft && flagright){
                //     return true
                // }else{
                //     return false
                // }
                console.log("hi")

                return this.isFull(node.left) && this.isFull(node.right);
            }else if(node.left == null && node.right == null){ 
                return true
    
            }else{
                return false
            }
        }


    

    

}


let bst1 = new BST()

bst1.insert(5).insert(10).insert(0).insert(15).insert(8).insert(9)

console.log(bst1.isFull())



console.log("testingggg")

console.log(false && false)