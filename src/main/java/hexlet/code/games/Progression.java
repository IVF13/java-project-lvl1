package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    public static void aProgressionPlay(int winsNum) {
        final int arrLenLowerNum = 5;
        final int arrLenUpperNum = 10;
        final int randomFirstProgNum = 20;
        final int randStepUpperNum = 10;
        String[] generatedProgressions = new String[winsNum];
        String[] answers = new String[winsNum];

        String name = Cli.greet();
        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < winsNum; j++) {
            StringBuilder arr = new StringBuilder();
            int[] progArr = new int[arrLenLowerNum + (int) (Math.random() * arrLenUpperNum)];
            int step = 1 + (int) (Math.random() * randStepUpperNum);
            int hiddenElementNum = (int) (Math.random() * (progArr.length));
            progArr[0] = (int) (Math.random() * randomFirstProgNum);
            for (int i = 0; i < progArr.length; i++) {
                if (i != 0) {
                    progArr[i] = progArr[i - 1] + step;
                    arr.append(" ");
                }
                if (i == hiddenElementNum) {
                    arr.append("..");
                } else {
                    arr.append(progArr[i]);
                }
            }
            answers[j] = Integer.toString(progArr[hiddenElementNum]);
            generatedProgressions[j] = arr.toString();
            //System.out.println("(Correct answer is " + progArr[hiddenElementNum] + ")");
            progArr = null;
        }
        Engine.toExamineAndCompare(answers, generatedProgressions, name, winsNum);
    }
}
