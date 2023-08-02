import java.util.LinkedList;
import java.util.Queue;

public class Source {
    Queue<Triplet> q=new LinkedList<>();
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        boolean[][] visit=new boolean[N][M];
        q.offer(new Triplet(0,0,0));
        visit[0][0]=true;
        while(!q.isEmpty()){
            Triplet curr=q.poll();
            if(curr.row==X && curr.col==Y) return curr.price;
            for(int i=0;i<4;i++){
                int newRow=curr.row+dx[i];
                int newCol=curr.col+dy[i];
                if(newRow>=0 && newRow<N && newCol>=0 && newCol<M && !visit[newRow][newCol] && A[newRow][newCol]==1){
                    visit[newRow][newCol]=true;
                    q.offer(new Triplet(newRow,newCol,curr.price+1));
                }
            }
        }
        return -1;
    }
    
    class Triplet{
        int row,col,price;
        Triplet(int row,int col,int price){
            this.row=row;
            this.col=col;
            this.price=price;
        }
}
