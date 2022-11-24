package org.eolang.dedup;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.io.File;
import java.util.concurrent.Callable;
import java.io.IOException;


@Command(name = "dedup", mixinStandardHelpOptions = true, version = "dedup 0.0.1",
        description = "Removes object duplication in a file")
public final class Main implements Callable<Integer> {
    /**
     * Path to input file.
     */
    @CommandLine.Option(names = {"--dir"},
            description = "Path to input file")
    private File input_file;

    /**
     * Path to output file.
     */
    @CommandLine.Option(names = {"--target"},
            description = "Path to output file")
    private File output_file;


    @Override
    public Integer call() throws IOException {
        new DeDuplicate(this.input_file.toString(), this.output_file.toString()).exec();
        return 0;
    }

    /**
     * Main entrance for Java command line.
     *
     * @param args The args from the command line.
     */
    public static void main(final String[] args) {
        new CommandLine(new Main()).execute(args);
    }
}
