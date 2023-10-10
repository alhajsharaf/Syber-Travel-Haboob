package selenium;



public class Test_plan {
    public static <Stress_test1> void main(String[] args) throws InterruptedException {
        //user registration
       UserRegisteration_test  uregistration_test = new UserRegisteration_test();
       uregistration_test.userregister();
       //user login
       UserLogin_test ulogin_test= new UserLogin_test();
       ulogin_test.userlogin();
       //agent registration
        AgentRegistration_test aregistration_test = new AgentRegistration_test();
        aregistration_test.agentregister_test();
        //agent login
        AgentLogin_test alogin_test = new AgentLogin_test();
        alogin_test.agentlogin();
        //flight booking
        Flights_test flights_test = new Flights_test();
        flights_test.flight();
        //hotel booking
        Hotels_test hotels_test = new Hotels_test();
        hotels_test.hotels();
        //contact us
        Contact_test contact_test = new Contact_test();
        contact_test.contact();

        }

    }



