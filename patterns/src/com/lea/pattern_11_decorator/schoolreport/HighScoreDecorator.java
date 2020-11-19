package com.lea.pattern_11_decorator.schoolreport;

/**
 * @author lzc
 * @create 2020-11-19 10:09
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore() {
        System.out.println("这次语文考试最高分75分，数学最高分83分，自然80分");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
