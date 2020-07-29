package gr.bitsplease.bitsplease.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Match {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID matchId;
    private String typeOfMatching;
    private String status;
    private double percentage;
    private boolean finalised;

    @ManyToOne
    private Applicant applicant;

    @ManyToOne
    private JobOffer jobOffer;

}
