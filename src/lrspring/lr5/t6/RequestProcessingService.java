import org.springframework.stereotype.Service;

@Service
public class RequestProcessingService {
    private final AnnualBonusService annualBonusService;

    public RequestProcessingService(AnnualBonusService annualBonusService) {
        this.annualBonusService = annualBonusService;
    }

    public Response processRequest(Request request) {
        // Здесь можно добавить логику изменения запроса и расчёта премии
        double bonus = annualBonusService.calculateQuarterlyBonus(request.getEmployee());
        return new Response(request.getEmployee(), bonus);
    }
}
