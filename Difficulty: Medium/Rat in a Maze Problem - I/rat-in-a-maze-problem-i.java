//{ Driver Code Starts
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            int[][] maze = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }

            if (sc.hasNextLine()) sc.nextLine();

            Solution obj = new Solution();
            ArrayList<String> result = obj.ratInMaze(maze);

            if (result.isEmpty()) {
                System.out.print("[]");
            } else {
                for (String path : result) {
                    System.out.print(path + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    private void recursion( ArrayList<String> result,int i,int j,int[][]maze,int[][]vis,String s,int n){
        
        if(i==n-1 && j==n-1){
            result.add(s);
            return;
        }
        
        //down
        if(i+1<n && !(vis[i][j]==1) && maze[i][j]==1){
            vis[i][j]=1;
            recursion(result,i+1,j,maze,vis,s+"D",n);
            vis[i][j]=0;
            
        }
        
        //left
        if(j-1>=0 && !(vis[i][j]==1) && maze[i][j]==1){
            vis[i][j]=1;
            recursion(result,i,j-1,maze,vis,s+"L",n);
            vis[i][j]=0;
            
        }
        
        //right
        if(j+1<n && !(vis[i][j]==1) && maze[i][j]==1){
            vis[i][j]=1;
            recursion(result,i,j+1,maze,vis,s+"R",n);
            vis[i][j]=0;
            
        }
        
        //up
        if(i-1>=0 && !(vis[i][j]==1) && maze[i][j]==1){
            vis[i][j]=1;
            recursion(result,i-1,j,maze,vis,s+"U",n);
            vis[i][j]=0;
            
        }
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n=maze.length;
        ArrayList<String> result = new ArrayList<String>();
        
         if (maze[0][0] == 0 || maze[n-1][n-1] == 0) {
            return result; 
        }
        int[][] vis= new int[n][n];
        recursion(result,0,0,maze,vis,"",n);
        return result;
        
        
        
    }
}