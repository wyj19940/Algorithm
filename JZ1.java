public class Solution {
    public boolean Find(int target, int [][] array) {
        
        //行数
        int rows = array.length;
        if(rows == 0){
            return false;
        }
        //列数
        int columns = array[0].length;
        if(columns == 0){
            return false;
        }
        
        int row = 0;
        int col = columns - 1;
        
        while(row <= (rows -1) && col >= 0){
            
            if(target >  array[row][col]){
                row ++;
            }else if(target < array[row][col]){
                col --;
            }else{
                return true;
            }
        }
        return false;
    }
}

/**


**/
