# java-console-program  
Simple Parking Program, to keep track of tickets, parked cars, and police officers. Demonstrates basic OOP and Java skills.  

**CS-145  
Programming Project 1  
Classes and Methods  **

## Objectives  
- Be able to use objects made up of other objects
- Be able to write a class from scratch
= Be able to write methods

## Introduction  
For this project you will design a set of classes that work together to simulate a police officer issuing a parking ticket.  The classes you should design are:  
- The **ParkedCar** Class:  This class should simulate a parked car.  The class’s responsibilities are:
  - To know the car’s make, model, color, license number, and the number of minutes that the car has been parked.
- The **ParkingMeter** Class:  This class should simulate a parking meter.  The class’s only responsibility is:
  - To know the number of minutes of parking time that has been purchased.
- The **ParkingTicket** Class:  This class should simulate a parking ticket.  The class’s responsibilities are:
  - To report the make, model, color, and license number of the illegally parked car.
  - To report the amount of the fine, which is $25 for the first hour or part of an hour that the car is illegally parked, plus $10 for every additional hour or part of an hour that the car is illegally parked.
  - To report the name and badge number of the police officer issuing the ticket.
- The ## Class:  This class should simulate a police officer inspecting parked cars.  The class’s responsibilities are:
  - To know the police officer’s name and badge number
  - To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired
  - To issue a parting ticket (generate a ParkingTicket object) if the car’s time has expired.


These classes can be represented with the following UML diagrams:
![image](https://user-images.githubusercontent.com/24593916/143726261-e74e3494-8726-4a01-a842-5bf53d3bdb49.png)
![image](https://user-images.githubusercontent.com/24593916/143726268-e5b86bf8-d9d5-46dc-93f0-9d3741e877f4.png)

**
Task #1 Coding the UML Diagrams**
Following the UML diagrams, create the classes as indicated.  Compile and debug.  

**Task #2 Testing**
Copy the files ParkingTicketSimulator.java and ParkingTicketSimulator2.java from Learn@UW-Stout.  Compile and run ParkingTicketSimulator.java.  The car in this program was parked for longer than the time purchased on the parking meter.  You should get the following output:

  **Car Data:**
  Make: Volkswagen
  Model: 1972
  Color: Red
  License Number: 147RHZM
  Minutes Parked: 125
  Officer Data:
  Name: Joe Friday
  BadgeNumber: 4788
  Minutes Illegally Parked: 65
  Fine: $35.00

Compile and run ParkingTicketSimulator2.java.  The car in this program was legally parked.  You should get the following output.
_No crimes committed!_

**Code Listing ParkingTicketSimulator.java**

/**
   ParkingTicketSimulator program
   Parking Ticket Simulator
*/

public class ParkingTicketSimulator
{
   public static void main(String[] args)
   {
      // Create a ParkedCar object.
      // The car was parked for 125 minutes.
      ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red",
                                    "147RHZM", 125);
      
      // Create a ParkingMeter object. 60 minutes were purchased.
      ParkingMeter meter = new ParkingMeter(60);
      
      // Create a PoliceOfficer object.
      PoliceOfficer officer = new PoliceOfficer("Joe Friday",
                                                "4788");
                                                
      // Let the officer patrol.
      ParkingTicket ticket = officer.patrol(car, meter);
      
      // Did the officer issue a ticket?
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
   }
}

**Code Listing ParkingTicketSimulator2.java**

/**
   ParkingTicketSimulator program
   Parking Ticket Simulator
*/

public class ParkingTicketSimulator2
{
   public static void main(String[] args)
   {
      // Create a ParkedCar object.
      // The car was parked for 60 minutes.
      ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red",
                                    "147RHZM", 60);
      
      // Create a ParkingMeter object. 60 minutes were purchased.
      ParkingMeter meter = new ParkingMeter(60);
      
      // Create a PoliceOfficer object.
      PoliceOfficer officer = new PoliceOfficer("Joe Friday",
                                                "4788");
                                                
      // Let the officer patrol.
      ParkingTicket ticket = officer.patrol(car, meter);
      
      // Did the officer issue a ticket?
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
   }
}

**Submission Guidelines**
Your submission into the Canvas should include all project source code, and sample output (test run).  Each program should be properly formatted code with indenting, comments and well named variables. 

**Ethical Programming Guidelines**
- This is an individual assignment; the work you turn in must be yours and yours alone.  Failure to follow these guidelines is punishable according to the syllabus:
- You are free to share conceptual ideas with fellow students (BUT NOT CODE).
- You are free to use any example code provided by the instructor.
- You may NOT share code with another student.
- You may NOT “team” code.
- You may NOT coach code another student or allow someone to coach you.
- You may NOT solicit answers from the Internet (crowd-source your project).

