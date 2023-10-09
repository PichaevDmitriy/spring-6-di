package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.*;

@SpringBootTest
@ActiveProfiles({"EN", "prod"})
class DatasourceControllerTestProd {
    @Autowired
    DatasourceController datasourceController;
    @Test
    void printDatasource() {
        datasourceController.printDatasource();
    }

}