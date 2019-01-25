package no.oslomet.aaas.service;

import no.oslomet.aaas.utils.ARXWrapper;
import org.deidentifier.arx.ARXAnonymizer;
import org.deidentifier.arx.ARXConfiguration;
import org.deidentifier.arx.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AnonymizationService {

    @Autowired
    ARXWrapper arxWrapper;

    public String anonymize() throws IOException {
        Data.DefaultData data = Data.create();
        ARXConfiguration config = ARXConfiguration.create();
        ARXAnonymizer anonymizer = new ARXAnonymizer();
       return arxWrapper.anonomize(anonymizer, config);
    }


}

