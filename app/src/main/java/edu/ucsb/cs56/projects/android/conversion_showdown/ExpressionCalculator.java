package edu.ucsb.cs56.projects.android.conversion_showdown;

import net.sourceforge.jeval.EvaluationException;
import net.sourceforge.jeval.Evaluator;

/**
 * The Expression Calculator class
 * Created by UMARU on 7/15/2016.
 */
public class ExpressionCalculator {


    Evaluator evaluator = new Evaluator();

    //Calculates with double
    public double eval_double( String exp) throws EvaluationException{
        return Double.parseDouble( evaluator.evaluate( exp ) );
    }

    public String eval(String exp) throws EvaluationException{
        return evaluator.evaluate( exp );
    }

}
