import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "impact-cli", version = "1.0", mixinStandardHelpOptions = true)
public class ImpactCLI implements Runnable {

    @Override
    public void run() {
       // This prints out company name when the program runs
       System.out.println("SaaSquatch by impact.com");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactCLI()).execute(args);
        System.exit(exitCode);
    }
}
