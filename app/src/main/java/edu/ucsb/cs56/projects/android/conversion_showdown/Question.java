package edu.ucsb.cs56.projects.android.conversion_showdown;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Class that deals with type of questions
 * Created by UMARU on 7/26/2016.
 */

public class Question implements Parcelable{
    private String from, to, questionType;

    @Override
    public int describeContents() {
        return 0;
    }

    //Non-null static field of type Question that implements Parcelable.Creator
    public static final Parcelable.Creator<Question> CREATOR = new Question.Creator<Question>() {
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    /**
     * Wrapping the question into a Parcel class.
     * @param dest
     * @param flags
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Bundle b = new Bundle();
        b.putString("from", from);
        b.putString("to", to);
        b.putString("questionType", questionType);
        dest.writeBundle( b );
    }

    /**
     * Taking a Parcel class in to unwrap and extract needed information.
     * @param in
     */
    public Question( Parcel in ){
        Bundle b = in.readBundle();
        from = b.getString( "from" );
        to = b.getString( "to" );
        questionType = b.getString( "questionType" );
    }
    public Question(String from, String to, String questionType){
        this.from = from;
        this.to = to;
        this.questionType = questionType;
    }

    public String getQuestionType(){
        return questionType;
    }

    public String getFrom(){
        return from;
    }

    public String getTo(){
        return to;
    }

    /**
     * Return a boolean to indicate if two questions are the same.
     * @param obj
     * @return
     */
    public boolean equals( Object obj ){
            if (! (obj instanceof Question ) )
                return false;
            return ((Question) obj).getFrom().equals(from) &&
                    ((Question) obj).getTo().equals(to) &&
                    ((Question) obj).getQuestionType().equals( questionType );

    }
}
