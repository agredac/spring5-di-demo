package guru.springframework.services;

/**
 * Created by jt on 5/24/17.
 */
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        System.out.println("PrimarySpanishGreetingService");

        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        System.out.println("sayGreeting" + greetingRepository.getGermanGreeting());

        return greetingRepository.getSpanishGreeting();
    }
}
