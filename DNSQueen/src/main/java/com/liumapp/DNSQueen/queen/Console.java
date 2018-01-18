package com.liumapp.DNSQueen.queen;

import org.apache.commons.cli.*;

import java.io.*;
import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class Console {

    private Queen queen;

    private BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));

    public Queen getQueen() {
        return queen;
    }

    public void setQueen(Queen queen) {
        this.queen = queen;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Console console = new Console();
        Queen queen = new Queen();
        console.setQueen(queen);

        try {
            Options options = new Options();
            options.addOption(new Option("f", true, "input file"));
            options.addOption(new Option("c", true, "simple command"));
            CommandLineParser commandLineParser = new PosixParser();
            CommandLine commandLine = commandLineParser.parse(options, args);
            console.readOptions(commandLine);
            List<String> argList = commandLine.getArgList();
            if (argList == null || argList.size() < 1) {
                queen.setPort(Queen.DEFAULT_PORT);
                queen.setAddress(Queen.DEFAULT_ADDRESS);
            } else {
                queen.setPort(Integer.parseInt(argList.get(1)));
                queen.setAddress(argList.get(0));
            }
            queen.connect();
            console.process();
        } catch (ParseException e) {
            System.out.println("parse command error " + e);
            System.exit(-1);
        } catch (UnknownHostException e) {
            System.out.println("connnect to " + queen.getAddress() + ":"
                    + queen.getPort() + " failed " + e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("connnect to " + queen.getAddress() + ":"
                    + queen.getPort() + " failed " + e);
            System.exit(-1);
        }
    }

    private void readOptions(CommandLine commandLine) {
        if (commandLine.hasOption("f")) {
            String filename = commandLine.getOptionValue("f");
            try {
                reader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(filename)));
            } catch (FileNotFoundException e) {
                System.out.println("can't find file " + filename);
            }
        }
        if (commandLine.hasOption("c")) {
            String command = commandLine.getOptionValue("c");
            reader = new BufferedReader(new StringReader(command));
        }
    }

    private void process() throws IOException {
        String line = null;
        while ((line = readline()) != null && line.length() > 0) {
            System.out.println(line);
            queen.say(line);
            processResponse();
        }
    }

    private void processResponse() throws IOException {
        String line = null;
        if ((line = queen.hear()) != null) {
            System.out.println(line);
        }
    }

    public String readline() throws IOException {
        return reader.readLine();
    }

}