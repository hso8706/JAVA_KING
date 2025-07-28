package com.example.demo.task.repository;

import com.example.demo.task.dto.FilterRequestDto;
import com.example.demo.task.entity.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

@Repository
public class TaskRepositoryCustomImpl implements TaskRepositoryCustom {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Task> findTasksByFilters(FilterRequestDto filter) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Task> cq = cb.createQuery(Task.class);
        Root<Task> task = cq.from(Task.class);
        List<Predicate> predicates = new ArrayList<>();

        if (!CollectionUtils.isEmpty(filter.getEpic())) {
            predicates.add(task.get("epicTitle").in(filter.getEpic())); // 주의: epic_id가 아닌 title 기준
        }

        if (!CollectionUtils.isEmpty(filter.getImportance())) {
            predicates.add(task.get("importance").in(filter.getImportance()));
        }

        if (!CollectionUtils.isEmpty(filter.getMember())) {
            predicates.add(task.get("member").in(filter.getMember()));
        }

        if (!CollectionUtils.isEmpty(filter.getDepartment())) {
            predicates.add(task.get("department").in(filter.getDepartment()));
        }

        if (!CollectionUtils.isEmpty(filter.getTeam())) {
            predicates.add(task.get("team").in(filter.getTeam()));
        }

        if (!CollectionUtils.isEmpty(filter.getUnit())) {
            predicates.add(task.get("unit").in(filter.getUnit()));
        }

        cq.where(cb.and(predicates.toArray(new Predicate[0])));
        TypedQuery<Task> query = em.createQuery(cq);
        return query.getResultList();
    }
}
