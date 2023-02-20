package org.example.runner;

import org.example.runner.runner.ConsoleRunner;
import org.example.runner.runner.Runner;

/**
 * Pseudo server that starts JVM and runs crawling. Supports one thread per run.
 * Currently, changing {@link Runner} implementation is possible only
 * directly in code, creating new instance of such implementations, as
 * {@link ConsoleRunner}
 *
 * @since 1.0-SNAPSHOT
 */
public class MainPseudoServer {

    public static void main(String[] args) {
        Runner crawlingRunner = new ConsoleRunner(args[0],
                Integer.parseInt(args[1]));
        crawlingRunner.startCrawling();
    }

}
