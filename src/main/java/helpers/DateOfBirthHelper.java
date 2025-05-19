package helpers;

public class DateOfBirthHelper {

    /**
     * <p>This method takes the value of the day using .substring method and removes the "0" zero character if it's presented on the first position</p>
     * @param date full date of birth in the format of DD.MM.YYYY with String data type
     * @return String value of the day
     */
    public String validateDay(String date){
        String resultDay = date.substring(0, 2);
        if (resultDay.startsWith("0")) {
            resultDay = resultDay.substring(1);
        }
        return resultDay;
    }

    public String validateMonth(String date){
        String resultMonth = date.substring(3, 5);
        if (resultMonth.startsWith("0")){
            resultMonth = resultMonth.substring(1);
        }
        return resultMonth;
    }

    public String validateYear(String date){
         return date.substring(6,10);


    }
}
