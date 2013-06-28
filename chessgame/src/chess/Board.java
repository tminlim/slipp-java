package chess;

import java.util.ArrayList;

import pieces.Pawn;

class Board {
	ArrayList<Pawn> pawns = new ArrayList<Pawn>();

	void addPawn(Pawn pawn) {
		pawns.add(pawn);
	}

	int countPawnSize() {
		return pawns.size();
	}

	ArrayList<Pawn> getPawns() {
		return pawns;
	}

}