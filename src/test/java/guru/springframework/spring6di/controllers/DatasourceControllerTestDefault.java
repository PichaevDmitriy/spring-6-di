package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class DatasourceControllerTestDefault {
    @Autowired
    DatasourceController datasourceController;

    @Test
    public void printDatasource(){
        datasourceController.printDatasource();
    }
}