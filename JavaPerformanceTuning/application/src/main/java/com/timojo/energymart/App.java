package com.timojo.energymart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//http://localhost:8080/readings/read/
//http://localhost:8080/plans/recommend/
//CMD open jconsole --> jconsole folder MBeans/Metrics
//CMD open jmc Java mission control
//jcmd change default value PID=18288 //jcmd 18288 VM.set_flag CMSWaitDuration 1500 //jinfo -flag CMSWaitDuration=1500 18288
//jcmd 18288 VM.flags -all --> verify intx CMSWaitDuration = 1500 {manageable} {attach}
//jcmd 18288 Thread.print --> Threads
//Jmeter test CMD
// jmeter -n -t energymart.jmx -l energymart.jtl -JThreads=100 -Jduration=120
//jmeter -g energymart.jtl -o html-report (Generate html report)
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}