import com.google.inject.Inject;

public class PaymentService {
    private final DebitCardProcessor processor;

    @Inject
    PaymentService(DebitCardProcessor processor) {
        this.processor = processor;
    }

    public Receipt payAmount(int rupees) {
        return this.processor.charge(rupees);
    }

}