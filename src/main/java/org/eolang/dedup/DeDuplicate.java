package org.eolang.dedup;

import org.eolang.dedup.Main;
import java.io.IOException;

public class DeDuplicate {
    /**
     * Path to file to be transformed.
     */
    private final String pathInput;

    /**
     * Path to output file.
     */
    private final String pathOutput;

    public DeDuplicate(final String iPath, final String oPath) {
        this.pathInput = iPath;
        this.pathOutput = oPath;
    }

    public void exec() throws IOException {
        System.out.println(this.pathInput);
        System.out.println(this.pathOutput);
    }
}
