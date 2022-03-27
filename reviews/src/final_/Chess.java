package final_;

public class Chess {
	enum ChessPlayer
	{
		WHITE, BLACK
	}
	
	
	final ChessPlayer getFirstPlayer() //final 지정자는 비공개정보접근, 시스템 파괴하는 경우 를 방지
	{
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess
{
	//ChessPlayer getFirstPlayer(){} //final 메소드이기에 오버라이딩 할 수 없다.
}
