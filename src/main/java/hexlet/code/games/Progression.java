package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Progression {
    public static final String QUEST = "What number is missing in the progression?";

    public static void aProgressionPlay() {
        final int randFirstProgNum = 20;
        final int randStepUpperNum = 10;
        final int arrLenLowerNum = 5;
        final int arrLenUpperNum = 10;
        int winsNum = Engine.WINSNUM;
        String[] generatedProgressionsQuestionSet = new String[winsNum];
        String[] answers = new String[winsNum];

        for (int j = 0; j < winsNum; j++) {
            StringBuilder arr = new StringBuilder();

            int[] progArr = progGen(randFirstProgNum, randStepUpperNum, arrLenLowerNum, arrLenUpperNum);
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
            generatedProgressionsQuestionSet[j] = arr.toString();

        }
        Engine.toExamineAndCompare(answers, generatedProgressionsQuestionSet, QUEST);
    }

    private static int[] progGen(int randFirstProgNum, int randStepUpperNum, int arrLenLowerNum, int arrLenUpperNum) {
        int[] progArr = new int[arrLenLowerNum + Utils.genRandInt(arrLenUpperNum)];
        int step = 1 + Utils.genRandInt(randStepUpperNum);
        progArr[0] = Utils.genRandInt(randFirstProgNum);
        for (int i = 1; i < progArr.length; i++) {
            progArr[i] = progArr[i - 1] + step;
        }
        return progArr;
    }

}

