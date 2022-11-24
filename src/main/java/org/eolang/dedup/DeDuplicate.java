package org.eolang.dedup;

import org.eolang.dedup.Main;
import java.io.IOException;

public class DeDuplicate {
    /**
     * Path to file to be transformed.
     */
    private final String path_input;

    /**
     * Path to output file.
     */
    private final String path_output;

    public DeDuplicate(final String i_pth, final String o_pth) {
        this.path_input = i_pth;
        this.path_output = o_pth;
    }

    public void exec() throws IOException {
        System.out.println(this.path_input);
        System.out.println(this.path_output);
    }
}
