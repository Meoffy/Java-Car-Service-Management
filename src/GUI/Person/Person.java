package GUI.Person;

import GUI.Services.CustomerWarehouse;
import GUI.Services.ParkingSpace;
import java.time.LocalDate;

public class Person {
    private static int idCounter = 0;
    private int ID;
    private String name;
    private String surname;
    private String personalIdentityNumber;
    private String address;
    private LocalDate dateOfBirth;
    private boolean isRented;



    public Person(String name, String surname, String personalIdentityNumber, String address, LocalDate dateOfBirth) {
        this.ID = idCounter++;
        this.name = name;
        this.surname = surname;
        this.personalIdentityNumber = personalIdentityNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }


    public boolean isRented() {
        return isRented;
    }

    public void rentWarehouse(CustomerWarehouse customerWarehouse)  {
        if(this.isRented()) {
            rentWarehouse(new CustomerWarehouse(400));
        }
    }

    public void rentParkingSpace(ParkingSpace parkingSpace) {
        if(this.isRented()) {
            rentParkingSpace(new ParkingSpace(11.5));
        }
    }

    @Override
    public String toString() {
        return
                "ID = " + ID +
                ", Name = " + name +
                ", Surname = " + surname +
                ", Personal Identity Number = " + personalIdentityNumber +
                ", Address = " + address +
                ", Date of birth = "+ dateOfBirth;
    }
}
