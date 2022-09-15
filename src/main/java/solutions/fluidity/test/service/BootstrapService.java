package solutions.fluidity.test.service;

import org.springframework.stereotype.Component;
import solutions.fluidity.test.premiershipapi.BootstrapStatic;

import java.io.IOException;

@Component
public class BootstrapService {

    private BootstrapStatic bootstrapStatic;

    public BootstrapService(BootstrapStatic bootstrapStatic) {
        this.bootstrapStatic = bootstrapStatic;
    }

    public String getBootstrapData() throws IOException {
        String result = bootstrapStatic.lookup();
        return result;
    }
}