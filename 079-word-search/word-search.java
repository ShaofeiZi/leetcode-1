# -*- coding:utf-8 -*-


# Given a 2D board and a word, find if the word exists in the grid.
#
#
# The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
#
#
#
# For example,
# Given board = 
#
# [
#   ['A','B','C','E'],
#   ['S','F','C','S'],
#   ['A','D','E','E']
# ]
#
#
# word = "ABCCED", -> returns true,
# word = "SEE", -> returns true,
# word = "ABCB", -> returns false.


public class Solution {
    
    public boolean exist(char[][] board, String word) {
        int[][] visited = new int[board.length][];
        for(int i = 0;i< board.length;i++){
            visited[i] = new int[board[0].length];
        }
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j< board[0].length;j++){
                if(find(board,word,i,j,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board, String word,int x,int y,int pos,int[][] visited){
        if(board[x][y] == word.charAt(pos)){
            visited[x][y] = 1;
            if(pos == word.length()-1){
                return true;
            }
            if(y < board[0].length-1 && visited[x][y+1] == 0){
                if(find(board,word,x,y+1,pos+1,visited)) return true;
            }
            if(x < board.length-1 && visited[x+1][y] == 0){
                if(find(board,word,x+1,y,pos+1,visited)) return true;
            }
            if(y > 0 && visited[x][y-1] == 0){
                if(find(board,word,x,y-1,pos+1,visited)) return true;
            }
            if(x > 0 && visited[x-1][y] == 0){
                if(find(board,word,x-1,y,pos+1,visited)) return true;
            }
            visited[x][y] = 0;
            return false;
        }else{
            return false;
        }
    }
}
