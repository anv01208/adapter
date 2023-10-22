class SpeedPokerGameImpl implements SpeedPokerGame {
    public void beginRound() {
        System.out.println("Speed Poker: Round begins.");
    }

    public void bet(int amount) {
        System.out.println("Speed Poker: Bet " + amount + " chips.");
    }

    public void playRound() {
        System.out.println("Speed Poker: Playing the round.");
    }

    public void winMoney() {
        System.out.println("Speed Poker: You've won money!");
    }
}