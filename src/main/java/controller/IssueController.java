package com.example.demo.controller;

import com.example.demo.model.Issue;
import com.example.demo.service.IssueService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/issues")
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    // Issue a book
    @PostMapping
    public Issue addIssue(@RequestBody Issue issue) {
        return issueService.addIssue(issue);
    }

    // Get all issued books
    @GetMapping
    public Map<Integer, Issue> getAllIssues() {
        return issueService.getAllIssues();
    }

    // Update issue
    @PutMapping("/{issueId}")
    public Issue updateIssue(@PathVariable int issueId, @RequestBody Issue issue) {
        return issueService.updateIssue(issueId, issue);
    }

    // Delete issue
    @DeleteMapping("/{issueId}")
    public String deleteIssue(@PathVariable int issueId) {
        return issueService.deleteIssue(issueId);
    }
}