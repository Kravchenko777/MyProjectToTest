package application;

import application.ExampleComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class MyTestComponent {

    @Autowired
    private ExampleComponent exampleComponent;

    @Test
    void test(){
        exampleComponent.getString();
    }
}
