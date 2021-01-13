package application;


import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		Scanner sc = new Scanner (System.in);
		while(true) {
	Interface.printBoard(chessMatch.getpieces());
	System.out.println();
	System.out.print("Source: ");
	ChessPosition source = Interface.readChessPosition(sc);
	
	System.out.println();
	System.out.print(" Target: ");
	ChessPosition target = Interface.readChessPosition(sc);
	
	ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	
	}

}
