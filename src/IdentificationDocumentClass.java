import java.time.Month;
import java.util.Scanner;


//@author B.Makate

public class IdentificationDocumentClass {

    String idNumber, dayOfBirth, yearNumber, monthName, monthNumber,
            genderNum, typeOfCitizenship, typeOfGender, citizenship;

    int monthOfBirth, yearOfBirth, gender, citizenNumber;

    public IdentificationDocumentClass(String idNumber, String dayOfBirth, String yearNumber, String monthName, String monthNumber, String genderNum, String typeOfCitizenship,
                                       String typeOfGender, String citizenship, int monthOfBirth, int yearOfBirth, int gender, int citizenNumber) {

        this.idNumber = idNumber;
        this.dayOfBirth = dayOfBirth;
        this.yearNumber = yearNumber;
        this.monthName = monthName;
        this.monthNumber = monthNumber;
        this.genderNum = genderNum;
        this.typeOfCitizenship = typeOfCitizenship;
        this.typeOfGender = typeOfGender;
        this.citizenship = citizenship;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.citizenNumber = citizenNumber;
    }



    public static void main(String[] args) {

        IdentificationDocumentClass obj = new IdentificationDocumentClass("123", "day", "year", "month", "07", "number", "citizen", "gender", "citizenship", 07, 2004, 4567, 1);

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Enter your ID number: ");

            obj.idNumber = input.nextLine();

            if(obj.idNumber.length() == 13) {

                break;

            } else {

                System.out.println("Wrong ID number. Try again");

            }

        }

        obj.genderNum = obj.idNumber.substring(6, 10);

        obj.gender = Integer.parseInt(obj.genderNum);

        if(obj.gender >= 0000 && obj.gender <=4999){

            obj.typeOfGender = "Female";

        }else{

            obj.typeOfGender = "Male";

        }

        obj.yearNumber = obj.idNumber.substring(0, 2);

        obj.yearOfBirth = Integer.parseInt(obj.yearNumber);

        if(obj.yearOfBirth >= 0 && obj.yearOfBirth <= 24){

            obj.yearOfBirth += 2000;

        } else {

            obj.yearOfBirth += 1900;

        }

        obj.monthNumber = obj.idNumber.substring(2, 4);

        obj.monthOfBirth = Integer.parseInt(obj.monthNumber);

        obj.monthName = (Month.of(obj.monthOfBirth).name()).substring(0, 1).toUpperCase() + Month.of(obj.monthOfBirth).name().substring(1).toLowerCase();


        obj.dayOfBirth = obj.idNumber.substring(4, 6);

        obj.citizenship = obj.idNumber.substring(10, 11);

        obj.citizenNumber = Integer.parseInt(obj.citizenship);

        if(obj.citizenNumber == 1){

            obj.typeOfCitizenship = "Permanent Citizen";

        } else{

            obj.typeOfCitizenship = "RSA citezen";

        }

        System.out.println('\n' + "Gender: " + obj.typeOfGender + '\n' + "Year of Birth: " + obj.yearOfBirth);

        System.out.println("Day of birth: " + obj.dayOfBirth + '\n' + "Month of birth: " + obj.monthName + '\n' + "Citizenship: " + obj.typeOfCitizenship);

    }

}
