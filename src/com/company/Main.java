package com.company;

public class Main {
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
    public static void main(String[] args) {
        /*for (String c:
             HANGED_MAN) {
            System.out.println(c);
        }*/
        new GameRunner().run();
    }
}
