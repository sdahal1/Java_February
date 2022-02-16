class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.next = null
    }
}


class SLL {
    constructor(){
        this.head = null;
    }

    addToBack(valueInput){
        //create a node object with a given value to add to the back of the list eventually 
        let newNode = new Node(valueInput)
        //if the singly linked list is empty (this mean that its head === null), then set the head of the singly linked list to be this new node
        if(this.head == null){
            this.head = newNode;
        }
        //otherwise (else) go to the end of the list and insert the node to the end
        else{ //else means that the list is not empty
            // console.log("this.head looks like this-->", this.head)
            let runner = this.head; //create runner variable to start at the beginning of the list (the head)
            
            //increment runner while runner.next != null (as long as the runner.next does not equal to null, that meanns runner is not at the last node)
            while(runner.next != null){ //in other words (while runner is not the last node)
                runner = runner.next //this moves runner to the next node
            }

            //by the time while loop is done, we will have runner pointing to the last node
            runner.next = newNode;

        }
    }

    display(){
        let result = "";

        //use runner to traverse the SLL
        let runner = this.head;
        while(runner != null){ //while runner is pointing at a node
            result += `${runner.value} -->`
            runner = runner.next //this is how you increment runner to go to the next node
        }

        console.log(result)
    }


    unshiftNode(value){ //unshift means to add to the front
        let unshiftedNode = new Node(value)
        if(this.head == null){
            this.head = unshiftedNode
        }
        else{
            unshiftedNode.next = this.head
            this.head = unshiftedNode
        }
    }
    shiftNode(){ //shift means remove from front
        let removedNode = this.head
        this.head = removedNode.next
        removedNode.next = null
        return removedNode
    }
    popNode(){ //pop means remove from back
        let runner = this.head
        while (runner.next.next != null){
            runner = runner.next
        }
        let tail = runner.next
        runner.next = null
        return tail
    }

    reverse(){
        //we want to iterate throught the singly linked list using a runner from beginning to end 
        //create a variable called runner and set it to equal to the head
        //create a variable (previous) to keep track of where the runner was at 
        let runner = this.head
        let previous = runner
        //as long as runner is pointing to something, we want to keep track of the next node 
        while(runner != null){
             //keep track of the node that is next to the runner so like that we can keep track of the next node
            let nextNode = runner.next
            //if runner is the head we want to make it point to null 
            if(runner == this.head){
                runner.next = null
            }
            //else if runner is not the head we want to make it point to the previous node
            else{
                runner.next = previous
            }
            //set runner to equal to next
            //set previous to be current runner 
            previous = runner 
            //if next is null, runner is at the last node and we can make last node the head
            if(nextNode == null){
                this.head = runner
            }
            runner = nextNode
        }
        
    }



}

let sll1 = new SLL()

sll1.addToBack(3)
sll1.addToBack(12)
sll1.addToBack(15)
sll1.addToBack(9)

sll1.display()

console.log(sll1)
// let firstNode = new Node(3);
// let secondNode = new Node(9);
// firstNode.next = secondNode

// let thirdNode = new Node(12);

// secondNode.next = thirdNode;



