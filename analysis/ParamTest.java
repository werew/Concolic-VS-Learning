
import RERSlearner.*;
import com.google.common.collect.ImmutableSet;
import de.learnlib.api.SUL;

import java.io.IOException;
import java.util.Collection;

public class ParamTest {
    /**
     * Example of how to learn a Mealy machine model from one of the compliled RERS programs.
     * @param args
     * @throws IOException
     */
    public static void main(String [] args) throws IOException {
        if (args.length < 4){
            System.out.println("usage: java ParamTest <SUL (program)> <Alphabet> <Learning method> <Testing method>");
            return;
        }
       
        System.out.println("SUL: "+ args[0]); 
        System.out.println("Alphabet up to: " + args[1]);
        System.out.println("Learning Method: " + args[2]);
        System.out.println("Testing Method: " + args[3]);

        // Load the System Under Learning (SUL)
        SUL<String,String> sul = new ProcessSUL(args[0]);

        // The input alphabet
        Collection<String> inputAlphabet = null;
        switch (Integer.parseInt(args[1])){
            case 5: inputAlphabet = ImmutableSet.of("1","2","3","4","5");
                break;
            case 10: inputAlphabet = ImmutableSet.of("1","2","3","4","5","6","7","8","9","10");
                break;
            case 15: inputAlphabet = ImmutableSet.of("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
                break;
            case 20: inputAlphabet = ImmutableSet.of("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20");
                break;
            default:
                System.out.println("Invalid alphabet");
                return;
        }


        // Learning method        
        BasicLearner.LearningMethod lm;
        switch (args[2]){
            case "LStar": lm = BasicLearner.LearningMethod.LStar;
                break;
            case "TTT": lm = BasicLearner.LearningMethod.TTT;
                break;
            case "RivestSchapire": lm = BasicLearner.LearningMethod.RivestSchapire;
                break;
            case "KearnsVazirani": lm = BasicLearner.LearningMethod.KearnsVazirani;
                break;
            default:
                System.out.println("Invalid learning method");
                return;
        }

        // The testing method
        BasicLearner.TestingMethod tm;
        switch (args[3]){
            case "RandomWalk": tm = BasicLearner.TestingMethod.RandomWalk;
                break;
            case "WMethod": tm = BasicLearner.TestingMethod.WMethod;
                break;
            case "WpMethod": tm = BasicLearner.TestingMethod.WpMethod;
                break;
            default:
                System.out.println("Invalid testing method");
                return;
        }


        try {
            System.out.println("Starting experiment");
            // runControlledExperiment for detailed statistics, runSimpleExperiment for just the result
            BasicLearner.runControlledExperiment(sul, lm, tm, inputAlphabet);
        } finally {
            if (sul instanceof AutoCloseable) {
                try {
                    ((AutoCloseable) sul).close();
                } catch (Exception exception) {
                    // should not happen
                }
            }
        }
    }
}
