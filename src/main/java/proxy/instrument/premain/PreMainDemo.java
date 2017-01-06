package proxy.instrument.premain;

import java.lang.instrument.Instrumentation;

/**
 * Created by tangjie
 * 2016/12/30
 * styletang.me@gmail.com
 */
public class PreMainDemo {
    /**
     * This method is called before the application’s main-method is called,
     * when this agent is specified to the Java VM.
     **/
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("PerfMonAgent.premain() was called.");
        // Initialize the static variables we use to track information.
        // Set up the class-file transformer.
        MyClassFileTransformer trans = new MyClassFileTransformer();
        System.out.println("Adding a MyClassFileTransformer instance to the JVM.");
        inst.addTransformer(trans);
    }
}
