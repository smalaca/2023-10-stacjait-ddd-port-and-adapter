package com.smalaca.architecturetests.productmanagement;

import com.tngtech.archunit.library.Architectures;
import org.junit.jupiter.api.Test;

class PackagesStructureTest {
    private static final String APPLICATION_SERVICE = "..command.application..";
    private static final String DOMAIN = "..command.domain..";
    private static final String REPOSITORY = "..infrastructure.repository..";
    private static final String REST = "..infrastructure.rest..";

    @Test
    void shouldFollowPortAndAdaptersArchitecture() {
        Architectures.onionArchitecture()
                .applicationServices(APPLICATION_SERVICE)
                .domainServices(DOMAIN)
                .domainModels(DOMAIN)
                .adapter("repository", REPOSITORY)
                .adapter("rest", REST)
                .check(ProductManagementContextClasses.get());
    }
}
