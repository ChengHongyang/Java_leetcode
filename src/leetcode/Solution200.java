package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/8/19
 * <p>
 * <p>
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * <p>
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 * <p>
 * 此外，你可以假设该网格的四条边均被水包围。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 * ['1','1','1','1','0'],
 * ['1','1','0','1','0'],
 * ['1','1','0','0','0'],
 * ['0','0','0','0','0']
 * ]
 * 输出: 1
 */
public class Solution200 {
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if ('1' == grid[i][j]) {
                    digui(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public static void digui(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        digui(i + 1, j, grid);
        digui(i - 1, j, grid);
        digui(i, j + 1, grid);
        digui(i, j - 1, grid);

    }
    public static void main(String []args){
           char[][]grid= {
                   {'1', '1', '0', '1', '0'},
                   {'1', '1', '0', '1', '0'},
                   {'1', '1', '0', '0', '0'},
                   {'0', '0', '1', '0', '0'}
           };
           System.out.println(numIslands(grid));
    }
}
