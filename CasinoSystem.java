public class CasinoSystem {
    public static void main(String[] args) {
        SpeedPokerGame speedPoker = new SpeedPokerGameImpl();
        SpeedPokerAdapter adapter = new SpeedPokerAdapter(speedPoker);

        playCasinoGame(adapter);
    }

    public static void playCasinoGame(CasinoGame game) {
        game.startGame();
        game.placeBet(50);
        game.playGame();
        game.collectWinnings();
    }
}