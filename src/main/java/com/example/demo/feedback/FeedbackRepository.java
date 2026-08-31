package com.example.demo.feedback;

import org.springframework.data.jpa.repository.JpaRepository;

// ✅ Repository interface for Feedback entity
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
