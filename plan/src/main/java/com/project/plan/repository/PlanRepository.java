package com.project.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
