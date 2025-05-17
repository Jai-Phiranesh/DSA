//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 
System.out.println("~");
}
	}
}




// } Driver Code Ends




class MyQueue {

    int front, rear;
    int arr[] = new int[100005];
    int currentSize;

    MyQueue() {
        front = -1;
        rear = -1;
        currentSize = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
       if(currentSize==0){
           front=0;
           rear=0;
           arr[rear]=x;
           currentSize++;
           
       }
       else{
           rear = (rear+1)%arr.length;
           arr[rear]=x;
            currentSize++;
       }
       
       
        
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
       if(currentSize==0){
           return -1;
       }
       int temp = arr[front];
       if(currentSize==1){
           front = -1;
           rear = -1;
       }
       else{
             front = (front+1)%arr.length;
       }
       currentSize--;
       return temp;
    }
}
