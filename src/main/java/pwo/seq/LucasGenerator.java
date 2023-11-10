package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }

    @Override 
    public BigDecimal previousTerm() {
        if (lastIndex > 1) {
            BigDecimal temp = f_2;
            f_2 = current.subtract(f_1);
            current = f_1;
            f_1 = temp;
        } else if (lastIndex == 1) {
            current = new BigDecimal(2);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex--;
        return current;
    }
}