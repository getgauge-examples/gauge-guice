import com.google.inject.Guice;
import com.google.inject.Injector;
import com.thoughtworks.gauge.BeforeSuite;

public class GuiceInjection {
    public static Injector injector;

    @BeforeSuite
    public void registerGuice(){
        injector = Guice.createInjector(new GuiceBindings());
    }
}
