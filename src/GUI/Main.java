package GUI;

import GUI.Enums.*;

import GUI.Exceptions.TooManyThingsException;
import GUI.Vehicle.*;
import GUI.Item.Item;
import GUI.Services.CarServiceSpot;
import GUI.Services.CustomerWarehouse;
import GUI.Services.IndependentCarServiceSpot;
import GUI.Services.ParkingSpace;
import GUI.Person.Person;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        //Creating new people
        Person p1 = new Person("James", "Wilson", "JH56 78MS", "12 High Street, Oxford, Oxfordshire, OX1 2AB", LocalDate.of(1993, 7, 22));
        Person p2 = new Person("Emily", "Thompson", "AB12 34CD", "45 Victoria Road, Manchester, Greater Manchester, M14 6BF", LocalDate.of(1990, 12, 25));
        Person p3 = new Person("Elizabeth", "Martin", "PQ45 67XY", "88 Elm Avenue, London, Greater London, SW12 9FE", LocalDate.of(1992, 2, 11));
        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(p1);
        personLinkedList.add(p2);
        personLinkedList.add(p3);

        //Creating warehouses for clients
        CustomerWarehouse cs1 = new CustomerWarehouse(300);
        CustomerWarehouse cs2 = new CustomerWarehouse(400);
        CustomerWarehouse cs3 = new CustomerWarehouse(450);
        LinkedList<CustomerWarehouse> warehouseLinkedList = new LinkedList<>();
        warehouseLinkedList.add(cs1);
        warehouseLinkedList.add(cs2);
        warehouseLinkedList.add(cs3);

        //Creating a repair service
        CarServiceSpot css1 = new CarServiceSpot(200.0);
        CarServiceSpot css2 = new CarServiceSpot(300.0);
        LinkedList<CarServiceSpot> carServiceSpotLinkedList = new LinkedList<>();
        carServiceSpotLinkedList.add(css1);
        carServiceSpotLinkedList.add(css2);

        //Creating an individual repair service
        IndependentCarServiceSpot icss1 = new IndependentCarServiceSpot(400);
        IndependentCarServiceSpot icss2 = new IndependentCarServiceSpot(300);
        LinkedList<IndependentCarServiceSpot> independentCarServiceSpotLinkedList = new LinkedList<>();
        independentCarServiceSpotLinkedList.add(icss1);
        independentCarServiceSpotLinkedList.add(icss2);

        //Creating parking spaces
        ParkingSpace ps1 = new ParkingSpace(11.5);
        ParkingSpace ps2 = new ParkingSpace(11.5);
        ParkingSpace ps3 = new ParkingSpace(11.5);
        ParkingSpace ps4 = new ParkingSpace(11.5);
        LinkedList<ParkingSpace> parkingSpaceLinkedList = new LinkedList<>();
        parkingSpaceLinkedList.add(ps1);
        parkingSpaceLinkedList.add(ps2);
        parkingSpaceLinkedList.add(ps3);
        parkingSpaceLinkedList.add(ps4);

        //Crafting items
        Item item1 = new Item(ItemType.AllSeasonTires, 150.0);
        Item item2 = new Item(ItemType.SummerTires, 150.0);
        Item item3 = new Item(ItemType.WinterTires, 150.0);
        LinkedList<Item> itemLinkedList = new LinkedList<>();
        itemLinkedList.add(item1);
        itemLinkedList.add(item2);
        itemLinkedList.add(item3);

        //Creating cars
        Car so = new Car("Toyota Auris", vehicleType.CityCar, EngineType.Diesel, 1500, 4.5, 1.5, CarBodyType.HATCHBACK);
        OffroadCar st = new OffroadCar("Dacia Duster", vehicleType.OffRoadCar, EngineType.Diesel, 2000, 4.5, 1.8, true);
        Motorbike mt = new Motorbike("Suzuki Hayabusa", vehicleType.Motorcycle, EngineType.Gas, 300, 2.1, 0.7, MotorcycleType.SPORT);
        Amphibian am = new Amphibian("Hydra Spyder", vehicleType.Amphibious, EngineType.Gas, 2500, 7.1, 2.6, true);
        LinkedList<Vehicle> vehicleLinkedList = new LinkedList<>();
        vehicleLinkedList.add(so);
        vehicleLinkedList.add(st);
        vehicleLinkedList.add(mt);
        vehicleLinkedList.add(am);

        //Menu
        System.out.println("Welcome to the warehouse service, select the command:");
        System.out.println("1. Finish the program");
        System.out.println("2. Choose a person");
        System.out.println("3. Print data");
        System.out.println("4. View free rooms");
        System.out.println("5. Rent a free room");
        System.out.println("6. List the rented rooms");
        System.out.println("7. Put the item into the room and check the contents of the room");
        System.out.println("8. Remove an item from storage");
        System.out.println("9. Rent a parking space");
        System.out.println("10. Park the car");
        System.out.println("11. Remove the car from the parking space");
        System.out.println("12. Service");
        System.out.println("13. Save file");

        Person idPerson = personLinkedList.get(0);
        CustomerWarehouse idWarehouse = warehouseLinkedList.get(0);
        ParkingSpace idParkingSpace = parkingSpaceLinkedList.get(0);
        CarServiceSpot idCarServiceSpot = carServiceSpotLinkedList.get(0);
        IndependentCarServiceSpot idIndependentCarServiceSpot = independentCarServiceSpotLinkedList.get(0);
        boolean endProgram = false;
        while (!endProgram) {
            System.out.println("Enter a command number between 1 and 13:");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input > 0 && input <= 13) {
                switch (input) {
                    case 1:
                        endProgram = true;
                        System.out.println("You have finished the programme.");
                        break;
                    case 2:
                        for (Person person : personLinkedList) {
                            System.out.println(person);
                        }
                        System.out.println("Select a person by entering their ID:");
                        int personSelection = scan.nextInt();
                        idPerson = personLinkedList.get(personSelection);
                        System.out.println("You have chosen: " + idPerson);
                        break;
                    case 3:
                        System.out.println("Selected user: " + idPerson);
                        break;
                    case 4:
                        for (CustomerWarehouse customerWarehouse : warehouseLinkedList) {
                            System.out.println(customerWarehouse);
                        }
                        break;
                    case 5:
                        for (CustomerWarehouse customerWarehouse : warehouseLinkedList) {
                            System.out.println(customerWarehouse);
                        }
                        System.out.println("Choose the warehouse you want to rent:");
                        System.out.println("If you don't want to rent a warehouse, press 9: ");
                        int warehouseSelection = scan.nextInt();
                        if (idWarehouse.id == warehouseSelection) {
                            idWarehouse = warehouseLinkedList.get(warehouseSelection);
                            idPerson.rentWarehouse(idWarehouse);
                        }
                        System.out.println("User: " + idPerson);
                        System.out.println("User Warehouse: " + idWarehouse);
                        break;
                    case 6:
                        System.out.println("User: " + idPerson);
                        System.out.println("User Warehouse: " + idWarehouse);
                        break;
                    case 7:
                        System.out.println("Select the item you want to keep in stock: ");
                        for(Item item : itemLinkedList){
                            System.out.println(item);
                        }
                        int itemSelection = scan.nextInt();
                        for(Item item : itemLinkedList){
                            if(item.id == itemSelection) {
                                try {
                                    idWarehouse.addItem(item);
                                } catch(TooManyThingsException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        System.out.println("Current stock: " + idWarehouse);
                        break;
                    case 8:
                        System.out.println("Select the ID of the item you want to remove from the warehouse: ");
                        int selectItemRemoval = scan.nextInt();
                        for(Item item : itemLinkedList){
                            if(item.id == selectItemRemoval) {
                                    idWarehouse.removeItem(item);
                            }
                        }
                        System.out.println("Item " + selectItemRemoval + " has been removed from storage.");
                        System.out.println("Current stock: " + idWarehouse);
                        break;
                    case 9:
                        for(ParkingSpace parkingSpace : parkingSpaceLinkedList){
                            System.out.println(parkingSpace);
                        }
                        System.out.println("Choose a parking spot: ");
                        int selectionParkingSpace = scan.nextInt();
                        idParkingSpace = parkingSpaceLinkedList.get(selectionParkingSpace);
                        System.out.println("User: " + idPerson);
                        idPerson.rentParkingSpace(idParkingSpace);
                        System.out.println("User's parking space: " + idParkingSpace);
                        break;
                    case 10:
                        System.out.println("Select the ID of the car you want to park: ");
                        for(Vehicle vehicle : vehicleLinkedList){
                            System.out.println(vehicle);
                        }
                        int vehicleSelection = scan.nextInt();
                        for(Vehicle vehicle : vehicleLinkedList){
                            if(vehicle.id == vehicleSelection) {
                                try {
                                    idParkingSpace.addVehicle(vehicle);
                                } catch(TooManyThingsException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        System.out.println("Current state of the parking space: " + idParkingSpace);
                        break;
                    case 11:
                        System.out.println(idParkingSpace);
                        System.out.println("Select the ID of the car you want to remove from the parking space: ");
                        int selectRemoveVehicle = scan.nextInt();
                        for(Vehicle vehicle : vehicleLinkedList){
                            if(vehicle.id == selectRemoveVehicle) {
                                idParkingSpace.removeVehicle(vehicle);
                            }
                        }
                        System.out.println("Current condition of the car park: " + idParkingSpace);
                        break;
                    case 12:
                        System.out.println(idParkingSpace);
                        System.out.println("Do you want to start an individual or service repair?");
                        System.out.println("Service repair = select 0 in the menu");
                        System.out.println("Individual repair = select in menu 1");
                        Scanner scanner = new Scanner(System.in);
                        int selectionRepairService = scanner.nextInt();
                        if(selectionRepairService == 0) {
                            System.out.println("Select your vehicle for repair by specifying the ID");
                            System.out.println("Current condition of the car park: " + idParkingSpace);
                            int vehicleToService = scanner.nextInt();
                            for(Vehicle vehicle : vehicleLinkedList){
                                if(vehicle.id == vehicleToService) {
                                    idParkingSpace.removeVehicle(vehicle);
                                    idCarServiceSpot.addVehicleForRepair(vehicle);
                                }
                            }
                            System.out.println("The vehicle is under repair.");
                        } else if (selectionRepairService == 1) {
                        System.out.println("Select your vehicle for repair by specifying the ID");
                        System.out.println("Current condition of the car park: " + idParkingSpace);
                        int vehicleToIndService = scanner.nextInt();
                            for(Vehicle vehicle : vehicleLinkedList){
                                if(vehicle.id == vehicleToIndService) {
                                    idParkingSpace.removeVehicle(idIndependentCarServiceSpot.addVehicleForRepair(vehicle));
                                }
                            }
                            System.out.println("The vehicle is under repair");
                    } else {
                            System.out.println("You gave the wrong command.");
                        }
                        break;
                    case 13:
                        try {
                            FileWriter fileTxtServices = new FileWriter("services.txt");
                            fileTxtServices.write(carServiceSpotLinkedList.toString());
                            fileTxtServices.write(independentCarServiceSpotLinkedList.toString());
                            fileTxtServices.close();

                            FileWriter FileTxtStores = new FileWriter("listStorage.txt");
                            FileTxtStores.write(warehouseLinkedList.toString());
                            FileTxtStores.close();

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("File saved");
                        break;
                }
            }
            else
            {
                System.out.println("Wrong command number entered, please write the correct command.");
            }
        }
    }
}
