import com.google.inject.AbstractModule;

public class GuiceBindings extends AbstractModule {

    @Override
    protected void configure() {

     /*
      * This binding tells Guice that when DebitCardProcessor is used in
      * a dependency, that should be satisfied with a PaypalDebitCardProcessor.
      */
        bind(DebitCardProcessor.class).to(PaypalDebitCardProcessor.class);
    }
}
