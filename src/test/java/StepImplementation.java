import com.thoughtworks.gauge.Step;

import static junit.framework.TestCase.assertEquals;

public class StepImplementation {

    @Step("Pay amount <rupees> rupees")
    public void payMoney(String amount) {
        int rupees = Integer.parseInt(amount);
        PaymentService paymentService = GuiceInjection.injector.getInstance(PaymentService.class);
        Receipt receipt = paymentService.payAmount(rupees);

        assertEquals(receipt.getPaymentStatus(), ReceiptStatus.SUCCESS);
    }

    @Step("Fail to pay <100> rupees")
    public void failurePayment(String amount) {
        int rupees = Integer.parseInt(amount);
        PaymentService paymentService = GuiceInjection.injector.getInstance(PaymentService.class);
        Receipt receipt = paymentService.payAmount(rupees);

        assertEquals(receipt.getPaymentStatus(), ReceiptStatus.FAILURE);
    }

}
