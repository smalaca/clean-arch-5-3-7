package com.smalaca.rentalapplication.domain.agreement;

import org.assertj.core.api.Assertions;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class AgreementAcceptedAssertion {
    private final AgreementAccepted actual;

    private AgreementAcceptedAssertion(AgreementAccepted actual) {
        this.actual = actual;
    }

    public static AgreementAcceptedAssertion assertThat(AgreementAccepted actual) {
        return new AgreementAcceptedAssertion(actual);
    }

    public AgreementAcceptedAssertion hasRentalType(String expected) {
        Assertions.assertThat(actual.getRentalType()).isEqualTo(expected);
        return this;
    }

    public AgreementAcceptedAssertion hasRentalPlaceId(String expected) {
        Assertions.assertThat(actual.getRentalPlaceId()).isEqualTo(expected);
        return this;
    }

    public AgreementAcceptedAssertion hasOwnerId(String expected) {
        Assertions.assertThat(actual.getOwnerId()).isEqualTo(expected);
        return this;
    }

    public AgreementAcceptedAssertion hasTenantId(String expected) {
        Assertions.assertThat(actual.getTenantId()).isEqualTo(expected);
        return this;
    }

    public AgreementAcceptedAssertion hasPrice(BigDecimal expected) {
        Assertions.assertThat(actual.getPrice()).isEqualTo(expected);
        return this;
    }

    public AgreementAcceptedAssertion hasDays(List<LocalDate> expected) {
        Assertions.assertThat(actual.getDays()).isEqualTo(expected);
        return this;
    }
}
