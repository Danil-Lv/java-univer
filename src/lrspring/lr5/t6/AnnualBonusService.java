import org.springframework.stereotype.Service;

@Service
public class AnnualBonusService {
    public double calculateQuarterlyBonus(Employee employee) {
        if (employee.getPosition().isManager()) {
            // Пример расчёта квартальной премии
            return employee.getSalary() * 0.25;
        } else {
            throw new IllegalArgumentException("Квартальная премия доступна только для менеджеров.");
        }
    }
}
