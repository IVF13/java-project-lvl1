package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Progression {
    public static final String condition = "What number is missing in the progression?";

    public static void aProgressionPlay(int winsNum) {
        final int arrLenLowerNum = 5;
        final int arrLenUpperNum = 10;
        final int randomFirstProgNum = 20;
        final int randomStepUpperNum = 10;
        String[] generatedProgressions = new String[winsNum];
        String[] answers = new String[winsNum];

        String name = Cli.greet();

        for (int j = 0; j < winsNum; j++) {
            StringBuilder arr = new StringBuilder();

            int[] progArr = progGeneration(arrLenLowerNum, arrLenUpperNum, randomFirstProgNum, randomStepUpperNum);
            int hiddenElementNum = (int) (Math.random() * (progArr.length));

            for (int i = 0; i < progArr.length; i++) {
                if (i != 0) {
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
        Engine.toExamineAndCompare(answers, generatedProgressions, name, winsNum, condition);
    }

    private static int[] progGeneration(int arrLenLowerNum, int arrLenUpperNum,
                                        int randomFirstProgNum, int randomStepUpperNum) {
        int[] progArr = new int[arrLenLowerNum + Utils.genRandInt(arrLenUpperNum)];
        int step = 1 + Utils.genRandInt(randomStepUpperNum);
        progArr[0] = Utils.genRandInt(randomFirstProgNum);
        for (int i = 1; i < progArr.length; i++) {
            progArr[i] = progArr[i - 1] + step;
        }
        return progArr;
    }

}

