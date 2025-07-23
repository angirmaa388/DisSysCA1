/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dissysca1;

/**
 *
 * @author angirmaa
 */

import generated.healthwellbeing.HealthWellBeingGrpc.HealthWellBeingImplBase;
import java.io.IOException;
import java.util.logging.Logger;

import  generated.mymental.MyMentalGrpc.MyMentalImplBase;
import  generated.mymental.Advice;
import generated.mymental.MentalIssue;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.logging.Level;

public class HealthWellBeingServer extends HealthWellBeingImplBase {
    private static final Logger logger = Logger.getLogger(HealthWellBeingServer.class.getName());

    public static void main(String[] args) {

        HealthWellBeingServer healthWellBeingServer = new HealthWellBeingServer();
        
        Logger.getLogger("io.grpc.netty").setLevel(Level.SEVERE);
        Logger.getLogger("io.grpc.netty.shaded").setLevel(Level.SEVERE);
        Logger.getLogger("javax.jmdns").setLevel(Level.SEVERE);
        int port = 50051;
        logger.setLevel(Level.SEVERE);
        
         try {
            Server server = ServerBuilder.forPort(port)
                    .addService(healthWellBeingServer)
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            System.out.println("#####Server started, listening on" + port);
    
        ServiceRegistration esr = ServiceRegistration.getInstance();
            esr.registerService( "_grpc._tcp.local.", "healthWellBeingServer", port,"text here if you like");
            server.awaitTermination();

        } catch (IOException e) {
          
            e.printStackTrace();

        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }

    
    }
}