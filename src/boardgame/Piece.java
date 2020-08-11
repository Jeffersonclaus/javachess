/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author root
 */
public class Piece {
    
    protected Position positon;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }




    public Piece( Board board, Position positon) {
       
        this.board = board;
         this.positon =  null;
    }



    protected Board getBoard() {
        return board;
    }

    
    
}
