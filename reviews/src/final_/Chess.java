package final_;

public class Chess {
	enum ChessPlayer
	{
		WHITE, BLACK
	}
	
	
	final ChessPlayer getFirstPlayer() //final �����ڴ� �������������, �ý��� �ı��ϴ� ��� �� ����
	{
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess
{
	//ChessPlayer getFirstPlayer(){} //final �޼ҵ��̱⿡ �������̵� �� �� ����.
}
