import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
//USING THE COMPONENTS TAG ON CLASSES IS DOING ALL OF THE WORK NOW
public class AppConfig {

    /*@Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        //CONSTRUCTOR INJECTION
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //USING AUTOWIRING AND SETTER INJECTION
        //SpeakerServiceImpl service = new SpeakerServiceImpl();

        //SETTER INJECTION USING THE speakerRepository BEAN
        //service.setRepository(getSpeakerRepository());

        return service;
    }*/

    //IMPLEMENTED AS A SINGLETON BY DEFAULT
    //SINGLETON = 1 OBJ INSTANCE PER SPRING CONTAINER
    //PROTOTYPE = UNIQUE OBJ PER METHOD CALL BY CONTEXT
    //REQUEST = 1 BEAN PER HTTP REQUEST
    //SESSION = 1 BEAN PER HTTP SESSION
    //GLOBAL SESSION = 1 BEAN PER APPLICATION; AKA NEW BEAN WHEN SERVER IS RESTARTED
    //METHOD FOR SETTER INJECTION

    /*@Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }*/
}
