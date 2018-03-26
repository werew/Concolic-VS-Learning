
import RERSlearner.*;
import com.google.common.collect.ImmutableSet;
import de.learnlib.api.SUL;

import java.io.IOException;
import java.util.Collection;

public class TestRunner {

    static private BasicLearner.TestingMethod tm;
    static private BasicLearner.LearningMethod lm;
    static private Collection<String> inputAlphabet;

    /**
     * Example of how to learn a Mealy machine model from one of the compliled RERS programs.
     * @param args
     * @throws IOException
     */
    public static void main(String [] args) throws IOException {
        if (args.length < 4){
            System.out.println("usage: java ParamTest <SUL (program)> <Alphabet> " +
                               "<Learning method> <Testing method> [bootstrapQueries]");
            return;
        }
       
        System.out.println("SUL: "+ args[0]); 
        System.out.println("Alphabet up to: " + args[1]);
        System.out.println("Learning Method: " + args[2]);
        System.out.println("Testing Method: " + args[3]);

        // Load the System Under Learning (SUL)
        SUL<String,String> sul = new ProcessSUL(args[0]);

        // Set Input Alphabet
        inputAlphabet = makeInputAlphabet(args[1]);
        if (inputAlphabet == null){System.out.println("Invalid alphabet"); return;}

        // Set Learning method        
        lm = makeLearningMethod(args[2]);
        if (lm == null){System.out.println("Invalid learning method"); return;}

        // Set Testing method        
        tm = makeTestingMethod(args[3]);
        if (tm == null){System.out.println("Invalid testing method"); return;}

        // Bootstrap queries
        if (args.length > 4){
            BasicLearner.bootstrapOracle = new FileEQOracle(sul,args[4]);
        }


        try {
            System.out.println("Starting experiment");
            BasicLearner.runControlledExperiment(sul, lm, tm, inputAlphabet);
        } finally {
            if (sul instanceof AutoCloseable) {
                try {
                    ((AutoCloseable) sul).close();
                } catch (Exception exception) {} // should not happen
            }
        }
    }

    static private Collection<String> makeInputAlphabet(String id){
        switch (Integer.parseInt(id)){
            case 5:  return ImmutableSet.of("1","2","3","4","5");
            case 10: return ImmutableSet.of("1","2","3","4","5","6","7","8","9","10");
            case 15: return ImmutableSet.of("1","2","3","4","5","6","7","8","9","10",
                                            "11","12","13","14","15");
            case 20: return ImmutableSet.of("1","2","3","4","5","6","7","8","9","10",
                                            "11","12","13","14","15","16","17","18",
                                            "19","20");
            default: return null;
        }
    }

    static private BasicLearner.LearningMethod makeLearningMethod(String id){
        switch (id){
            case "LStar": return BasicLearner.LearningMethod.LStar;
            case "TTT":   return BasicLearner.LearningMethod.TTT;
            case "RivestSchapire": return BasicLearner.LearningMethod.RivestSchapire;
            case "KearnsVazirani": return BasicLearner.LearningMethod.KearnsVazirani;
            default: return null;
        }
    }

    static private BasicLearner.TestingMethod makeTestingMethod(String id){
        switch (id){
            case "RandomWalk": return BasicLearner.TestingMethod.RandomWalk;
            case "WMethod":    return BasicLearner.TestingMethod.WMethod;
            case "WpMethod":   return BasicLearner.TestingMethod.WpMethod;
            default: return null;
        }
    }

}
