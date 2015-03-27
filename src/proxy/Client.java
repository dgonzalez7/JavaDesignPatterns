/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package proxy;

import flyweight.*;

public class Client {
    
    public static void main(String[] args) {
        Engine engine = new EngineProxy(1300, false);
        engine.diagnose(new EngineDiagnosticTool());
        
        Engine engine2 = new EngineProxy(1300, false);
        engine2.diagnose(new EngineDiagnosticTool());
        
        // My test code - see if these are really running in seperate threads
        Engine standard1 = new EngineProxy(1300, false);
        standard1.diagnose(new EngineDiagnosticTool());

        Engine standard2 = new EngineProxy(1300, false);
        standard2.diagnose(new EngineDiagnosticTool());

        Engine standard3 = new EngineProxy(1300, false);
        standard3.diagnose(new EngineDiagnosticTool());

        Engine standard4 = new EngineProxy(1600, false);
        standard4.diagnose(new EngineDiagnosticTool());

        Engine standard5 = new EngineProxy(1600, false);
        standard5.diagnose(new EngineDiagnosticTool());
    }
    
}
