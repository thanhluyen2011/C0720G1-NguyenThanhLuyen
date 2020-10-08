package commons;

import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static final String CUSTOMER_NAME = "^([A-Z][a-z]*[\\s])*[A-Z][a-z]*$";
    public static final String CUSTOMER_EMAIL = "^\\w{3,}@[a-zA-Z]{3,5}\\.[a-zA-Z]{2,3}$";
    public static final String CUSTOMER_CMND = "^(\\d{3}[\\s]){2}\\d{3}$";
    public static final String CUSTOMER_DAY_OF_BIRTH = "^([0][1-9]|[1-2][0-9]|[3][0-1])[/]([0][1-9]|[1][0-2])[/]\\d{4}$";
    public static boolean regexNameService(String name) {
        final String REGEXNAMEVILLA = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(REGEXNAMEVILLA);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexId(String id) {
        final String REGEX_ID = "^SV(VL|HO|RO)-\\d{4}";
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher(id);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexAreaOfUse(String areaOfUse) {
        final String REGEX_AREAOFUSE = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(REGEX_AREAOFUSE);
        Matcher matcher = pattern.matcher(areaOfUse);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexCost(String cost) {
        int choose = Integer.parseInt(cost);
        boolean check;
        if (choose <= 0) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }

    public static boolean regexPeople(String people) {
        int choose = Integer.parseInt(people);
        boolean check;
        if (choose > 0 && choose < 20) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static boolean regexFree(String free) {
        final String REGEX_FREE = "^massage|massage|food|drink|car$";
        Pattern pattern = Pattern.compile(REGEX_FREE);
        Matcher matcher = pattern.matcher(free);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexFloors(String floors) {
        int choose = Integer.parseInt(floors);
        boolean check;
        if (choose <= 0) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }
    public static boolean isValiNameCustomer(String name) throws NameException {
        Pattern pattern = Pattern.compile(CUSTOMER_NAME);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        if (!check) {
            throw new NameException();
        }
        return check;
    }

    public static boolean isValiEmaiCustomer(String email) throws EmailException {
        Pattern pattern = Pattern.compile(CUSTOMER_EMAIL);
        Matcher matcher = pattern.matcher(email);
        boolean check = matcher.matches();
        if (!check) {
            throw new EmailException();
        }
        return check;
    }

    public static boolean isValiSexCustomer(String sex) throws GenderException {
        String[] strings = new String[]{"male", "female", "unknow"};
        boolean check = Arrays.asList(strings).contains(sex.toLowerCase());
        if (!check) {
            throw new GenderException();
        }
        return check;
    }

    public static boolean isValiCMND(String cmnd) throws IdCardException {
        Pattern pattern = Pattern.compile(CUSTOMER_CMND);
        Matcher matcher = pattern.matcher(cmnd);
        boolean check = matcher.matches();
        if (!check) {
            throw new IdCardException();
        }
        return check;
    }

    public static boolean isValiDayOfBirth(String birthday) throws BirthdayException {
        Pattern pattern = Pattern.compile(CUSTOMER_DAY_OF_BIRTH);
        Matcher matcher = pattern.matcher(birthday);
        boolean check = matcher.matches();
        if (check) {
            int birthYear = Integer.parseInt(birthday.split("/")[2]);
            int nowYear = Calendar.getInstance().get(Calendar.YEAR);
            if (birthYear < 1900 || nowYear - birthYear < 18) {
                check = false;
                throw new BirthdayException();
            }
        }else {
            throw new BirthdayException();
        }
        return check;
    }

}
