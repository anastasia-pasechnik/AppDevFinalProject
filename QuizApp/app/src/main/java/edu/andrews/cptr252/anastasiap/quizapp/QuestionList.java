package edu.andrews.cptr252.anastasiap.quizapp;

import android.content.Context;

import java.util.ArrayList;

public class QuestionList {

    /** Instance variable for QuestionList **/
    private static QuestionList sOurInstance;

    /** List of Questions **/
    private ArrayList<Question> mQuestions;


    /** Reference to information about app environment */
    private Context mAppContext;
    /** Private constructor. */
    private QuestionList(Context appContext) {
        mAppContext = appContext;
        mQuestions = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Question question = new Question();
            question.setTitle("Question #" + i);

            mQuestions.add(question);
        }
    }


    /**
     * Return one and only instance of the question list.
     * (If it does not exist, create it).
     * @param c is the Application context
     * @return Reference to the question list
     */
    public static QuestionList getInstance(Context c) {
        if (sOurInstance == null){
            sOurInstance = new QuestionList(c.getApplicationContext());
        }
        return sOurInstance;
    }
    /**
     * Return list of questions.
     * @return Array of Question objects.
     */
    public ArrayList<Question> getQuestions() { return mQuestions; }


}
