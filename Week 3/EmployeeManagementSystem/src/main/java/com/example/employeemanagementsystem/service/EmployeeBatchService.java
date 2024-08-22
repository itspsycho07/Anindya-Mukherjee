package com.example.employeemanagementsystem.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EmployeeBatchService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void batchInsertEmployees(List<Employee> employees) {
        int batchSize = 20; // The batch size should match the configured size in application.properties

        for (int i = 0; i < employees.size(); i++) {
            entityManager.persist(employees.get(i));

            // Flush and clear the entity manager at the batch size interval
            if (i % batchSize == 0 && i > 0) {
                entityManager.flush();
                entityManager.clear();
            }
        }

        // Flush and clear after the last batch
        entityManager.flush();
        entityManager.clear();
    }
}
