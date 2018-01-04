package com.company;

public class GameState {

    private String word;
    private int attempts;
    private boolean[] success;

    private static final String[] HANGED_MAN = {
            "\t\t|\\_____",
            "\t\t/\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____\n",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|   |\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|   |/\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|  \\|/\n" +
                    "\t\t|\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|  \\|/\n" +
                    "\t\t|   |\n" +
                    "\t\t|\n" +
                    "\t\t|\\_____",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|  \\|/\n" +
                    "\t\t|   |\n" +
                    "\t\t|  /\n" +
                    "\t\t|\\_____\n",
            "\t\t/----\n" +
                    "\t\t|   |\n" +
                    "\t\t|   0\n" +
                    "\t\t|  \\|/\n" +
                    "\t\t|   |\n" +
                    "\t\t|  / \\\n" +
                    "\t\t|\\_____"
    };

    public GameState() {

        Dictionary dictionary = new Dictionary();
        this.word = dictionary.getRandomWord();
        this.success = new boolean[word.length()];

    }

    public String getCurrentResult() {

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (!success[i]) {
                result = result + "_ ";
            } else {
                result = result + word.charAt(i);
            }
        }

        result = result + System.lineSeparator();
        result = result + "You have " + (10 - attempts) + " attempts left.";

        return result;
    }

    public void checkLetter(char letter) {

        int coincidence = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                success[i] = true;
                coincidence++;
            }
        }

        if (coincidence == 0) {
            attempts++;
            System.out.println("This letter doesn't match.");
            System.out.println(HANGED_MAN[attempts]);
        } else {
            System.out.println("This letter matches!");
            System.out.println(HANGED_MAN[attempts]);
        }
    }

    public boolean isOver() {

        boolean pendingLetter = false;

        for (int i = 0; i < success.length; i++) {
            if (!success[i]) {
                pendingLetter = true;
                break;
            }
        }

        if ((pendingLetter && attempts == 10) || !pendingLetter) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasWon() {
        if (isOver() && attempts < 10) {
            return true;
        } else {
            return false;
        }
    }


}
