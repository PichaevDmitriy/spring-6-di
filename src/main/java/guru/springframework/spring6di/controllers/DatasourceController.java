package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class DatasourceController {
    private final DatasourceService datasourceService;

    public DatasourceController(@Qualifier("myDatasource") DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public void printDatasource(){
        System.out.println(datasourceService.getDatasource());
    }
}
