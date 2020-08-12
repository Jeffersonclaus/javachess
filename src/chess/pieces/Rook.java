/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import chess.Color;

/**
 *
 * @author root
 */
public class Rook extends chess.ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);
    }

    
    @Override  
    public String toString(){ 
    
    return "R";
}

}