import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.Runtime;


public class snmpOperations {

    public static void main(String[] args) throws IOException {

        Runtime rc = Runtime.getRuntime();
//        Process process = rc.exec("cmd.exe");
//        rc.exec("snmpget -v2c -c hDaFHJG7 udp6:2001:0558:4042:0014:1256:11ff:fea7:c86e sysDescr.0");
        rc.exec("snmpset -v2c -c hDaFHJG7 udp6:2001:0558:4042:0014:1256:11ff:fea7:c86e 1.3.6.1.2.1.69.1.1.3.0 i 1");

//        OutputStream otr = rc.exec("snmpget -v2c -c hDaFHJG7 udp6:2001:0558:4042:0014:1256:11ff:fea7:c86e sysDescr.0").getOutputStream();
//        PrintStream prntStrm = new PrintStream(otr);
//        prntStrm.println();
    }
}


