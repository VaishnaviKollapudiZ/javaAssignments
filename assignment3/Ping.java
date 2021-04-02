package com.assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ping {

    public static double findMedianTime(ArrayList<Double> times)
    {
        Collections.sort(times);
        int length= times.size();
        if(length%2==0)
        {
            return (times.get(length/2-1)+times.get(length/2))/2;
        }
        else
            return times.get(length/2);
    }
    public static void pingCommand(String[] command,int packetCount){

        try{
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String commandOutput;
//            if((commandOutput = inputStream.readLine()) == null)
//            {
//                System.err.println("Invalid Ip Address");
//                return;
//            }

            int count = 0;
            ArrayList<Double> times = new ArrayList<>();
            while ((commandOutput = inputStream.readLine()) != null ) {
                int index = commandOutput.indexOf("time=");
                String time = "";
                if (index != -1) {
                    time = commandOutput.substring(index + 5, index + 11);

                    times.add(Double.parseDouble(time));
                }
            }
            for(double time:times)
                System.out.println(time);
            System.out.println("\nThe median time taken to ping = "+findMedianTime(times));


            inputStream.close();

        }catch(Exception exception){
            exception.printStackTrace();
        }

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the IpAddress of the server/host you want to ping = ");
        String ipAddress = scan.nextLine();
        System.out.println("\nNo. of data packets to send = ");
        int packetCount = scan.nextInt();
        String[] command = {"/bin/sh","-c","ping -c "+packetCount+" "+ipAddress+"| grep \"time=\" |cut -d ' ' -f 7-8"};
        pingCommand(command,packetCount);

    }
}
