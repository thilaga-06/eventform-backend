package com.example.demo.service;

import com.example.demo.model.Issue;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IssueService {

    private Map<Integer, Issue> issues = new HashMap<>();

    // Issue a book
    public Issue addIssue(Issue issue) {
        issues.put(issue.getIssueId(), issue);
        return issue;
    }

    // Get all issued books
    public Map<Integer, Issue> getAllIssues() {
        return issues;
    }

    // Update issue
    public Issue updateIssue(int issueId, Issue issue) {
        issue.setIssueId(issueId);
        issues.put(issueId, issue);
        return issue;
    }

    // Delete issue
    public String deleteIssue(int issueId) {
        issues.remove(issueId);
        return "Issue Record Deleted Successfully";
    }
}