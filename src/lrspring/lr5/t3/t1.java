public double calculateQuarterlyBonus(Employee employee) {
    if (!employee.isManager()) {
        return 0;
    }

    double salary = employee.getSalary();
    double bonusPercentage = 0.1;

    return salary * bonusPercentage;
}