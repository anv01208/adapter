class SpeedPokerAdapter implements CasinoGame {
    private SpeedPokerGame speedPoker;

    public SpeedPokerAdapter(SpeedPokerGame speedPoker) {
        this.speedPoker = speedPoker;
    }

    public void startGame() {
        speedPoker.beginRound();
    }

    public void placeBet(int amount) {
        speedPoker.bet(amount);
    }

    public void playGame() {
        speedPoker.playRound();
    }

    public void collectWinnings() {
        speedPoker.winMoney();
    }
}