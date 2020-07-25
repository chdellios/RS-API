package gr.bitsplease.bitsplease.repository;

import gr.bitsplease.bitsplease.models.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOffer, Integer> {
}
