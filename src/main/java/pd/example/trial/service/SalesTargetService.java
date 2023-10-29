package pd.example.trial.service;

import org.springframework.stereotype.Service;
import pd.example.trial.model.SalesTarget;
import pd.example.trial.repository.SalesTargetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SalesTargetService {
    private final SalesTargetRepository salesTargetRepository;

    public SalesTargetService(SalesTargetRepository salesTargetRepository) {
        this.salesTargetRepository = salesTargetRepository;
    }

    /**
     * Method will get all the tergets.
     * @return
     */
    public List<SalesTarget> getAllSalesTargets() {
        return salesTargetRepository.findAll();
    }

    /**
     * Method will get all the sales target by id.
     * @param id
     * @return
     */
    public Optional<SalesTarget> getSalesTargetById(String id) {
        return salesTargetRepository.findById(id);
    }

    /**
     * Method save the terget details.
     * @param salesTarget
     * @return
     */
    public SalesTarget saveSalesTarget(SalesTarget salesTarget) {
        return salesTargetRepository.save(salesTarget);
    }

    /**
     * Method delete the sales target by id.
     * @param id
     */
    public void deleteSalesTargetById(String id) {
        salesTargetRepository.deleteById(id);
    }
}
