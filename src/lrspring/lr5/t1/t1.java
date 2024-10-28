public static int calculate(int year) {
    boolean isLeapYear = false;
    if ((year % 4 == 0) && (year % 100 != 0)) {
        isLeapYear = true;
    } else if (year % 400 == 0) {
        isLeapYear = true;
    }

    int daysInCommonYear = 365;
    if (isLeapYear) {
        daysInCommonYear = 366;
    }

    return daysInCommonYear;
}