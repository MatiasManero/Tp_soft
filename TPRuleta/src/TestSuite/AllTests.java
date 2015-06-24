package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Test.Test_ModeloApuesta;
import Test.Test_Numeros;

@RunWith(Suite.class)
@SuiteClasses({ Test_ModeloApuesta.class, Test_Numeros.class })
public class AllTests {

}
