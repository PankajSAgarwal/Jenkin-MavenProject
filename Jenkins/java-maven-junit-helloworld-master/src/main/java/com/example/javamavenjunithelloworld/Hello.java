package com.example.javamavenjunithelloworld;

import java.io.PrintStream;

/**
 * Simple class that says "Hello!".
 */
public class Hello {

    static final String HELLO = "Hello!";
    public static final int MAXIMUM_AMOUNT_OF_TIMES = 20;
    private short times = 1;

    /**
     * Set how many times "Hello!" should be said.
     * @param timesparam How many times should this class say "Hello!"?
     * The value should be no larger than 20.
     * @throws IllegalArgumentException Thrown when times is larger
     * than 20 or a negative number.
     */
	public void setTimes(final int timesparam){
		if (timesparam < 0 || timesparam > MAXIMUM_AMOUNT_OF_TIMES) 
			throw new IllegalArgumentException(
					"Parameter «times» should be a "
					+ "positive integer no larger than "
					+ MAXIMUM_AMOUNT_OF_TIMES + "."
					);
		
		this.times = (short) timesparam;
	}

    /**
     * Say "Hello!".
     *
     * @param printer PrintStream to write output to.
     */
    public void sayHello(final PrintStream printer) {
        for (short i = 0; i < times; i++) {
            printer.println(HELLO);
        }
    }

}
