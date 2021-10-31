class Node<T>{

//setters and getters
public Node<T> left;
public Node<T> right;
private T data;

@Override
public String toString() {
	
	return this.getData().toString();
	
}
/*
 * sets and gets left Node right node  and data
 */
public void setLeft(Node<T>left){
	
 this.left = left;
 
}


public void setRight(Node<T>right){
	
 this.right = right;
 
}


public void setData(T data){
	
	this.data = data;
	
		}
public T getData(){
	
	 return this.data;
	 
		}

public Node<T> getRight() {
	
return right;

}

public Node<T>getLeft() {
	
return this.left;

}
    Node(T data) {
    	
  this.data = data;
  
}

}




