package guru.springframework.spring6di.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service("myDatasource")
@Profile({"dev", "default"})
public class DatasourceServiceDev implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Dev datasource";
    }
}
