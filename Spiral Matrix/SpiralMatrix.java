import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int row=matrix.length;
        int col=matrix[0].length;
        int t=0 ,l=0,b=row-1,r=col-1;
        int d=0;
        if(row==0){
            return list;
        }
        while(l<=r&&t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    list.add(matrix[t][i]);
                    
                }
                d=1;
                t++;
            }
            else if(d==1){
                for(int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
                    
                }
                d=2;
                r--;
            }
            else if(d==2){
                for(int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                    
                }
                d=3;
                b--;
            }
            else if(d==3){
                for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                    
                }
                d=0;
                l++;
            }
        }
        return list;
    }
}