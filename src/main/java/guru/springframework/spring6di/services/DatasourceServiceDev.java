package guru.springframework.spring6di.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service("myDatasource")
@Profile({"EN", "default"})
public class DatasourceServiceDev implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Dev datasource";
    }
}
