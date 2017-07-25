import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.ClassInitializer;

public class GuiceInjection implements ClassInitializer{
    public static Injector injector;

    @Override
    public Object initialize(Class<?> aClass) throws Exception {
        injector = Guice.createInjector(new GuiceBindings());
        return injector.getInstance(aClass);
    }
}
