package guru.springframework.spring6di.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Profile("prod")
@Service("myDatasource")
public class DatasourceServiceProd implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Prod datasource";
    }
}
