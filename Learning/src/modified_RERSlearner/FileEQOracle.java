package RERSlearner;

import de.learnlib.api.EquivalenceOracle;
import de.learnlib.api.SUL;
import de.learnlib.oracles.DefaultQuery;
import net.automatalib.automata.transout.MealyMachine;
import net.automatalib.words.Word;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by ramon on 12-12-16.
 */
public class FileEQOracle implements EquivalenceOracle<MealyMachine<?, String, ?, String>, String, Word<String>> {
    private final SUL<String,String> sul;
    private Scanner fileInputScanner = null;

    public FileEQOracle(SUL<String,String> sul, String inputFile) throws FileNotFoundException {
        this.sul = sul;
        File f = new File(inputFile);
        fileInputScanner = new Scanner(f);
    }

    @Override
    public DefaultQuery<String, Word<String>> findCounterExample(MealyMachine<?, String, ?, String> hypothesis, Collection<? extends String> allowedInputs) {
        do {
            String lineInput = null;
            try {
                lineInput = fileInputScanner.nextLine();
            } catch (NoSuchElementException e) {
                return null;
            }

            String[] sutInputs = lineInput.split("\\s");
            if (sutInputs.length != 0) {
                Word<String> input = Word.fromArray(sutInputs, 0, sutInputs.length);
                Word<String> hypOutput = hypothesis.computeOutput(input);
                Word<String> sulOutput = sulOutput(input);
                if (!hypOutput.equals(sulOutput)) {
                    // We have found a counter example
                    return new DefaultQuery<String, Word<String>>(Word.fromList(Collections.emptyList()), input, sulOutput);
                } 
            }
        } while (true);
    }

    private Word<String> sulOutput(Word<String> inputs) {
        sul.pre();
        List<String> output = new ArrayList<>();
        for (String input: inputs) {
            output.add(sul.step(input));
        }
        sul.post();
        return Word.fromList(output);
    }
}
