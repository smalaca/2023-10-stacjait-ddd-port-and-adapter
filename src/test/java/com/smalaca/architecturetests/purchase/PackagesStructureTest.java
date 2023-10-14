package com.smalaca.architecturetests.purchase;

import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

class PackagesStructureTest {
    private static final String JAVA = "java..";
    private static final String COMMAND = "..applicationcore..";
    private static final String QUERY = "..query..";
    private static final String INFRASTRUCTURE = "..infrastructure..";

    @Test
    void commandShouldBeIndependent() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(COMMAND)
                .should().onlyAccessClassesThat().resideInAnyPackage(COMMAND, JAVA)
                .because("we use hexagonal architecture")
                .check(PurchaseContextClasses.get());
    }

    @Test
    void queryShouldDependOnPersistence() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(QUERY)
                .should().onlyAccessClassesThat().resideInAnyPackage(QUERY, JAVA, INFRASTRUCTURE)
                .because("we use hexagonal architecture")
                .check(PurchaseContextClasses.get());
    }

    @Test
    void infrastructureMayDependOnCommandAndQuery() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(INFRASTRUCTURE)
                .should().onlyAccessClassesThat().resideInAnyPackage(INFRASTRUCTURE, JAVA, COMMAND, QUERY)
                .because("we use hexagonal architecture")
                .check(PurchaseContextClasses.get());
    }
}
