package com.example.demo.feedback;
import com.example.demo.feedback.Feedback;
import com.example.demo.feedback.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository repository;

    @GetMapping
    public List<Feedback> getAllFeedback() {

        return repository.findAll();
    }

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {

        return repository.save(feedback);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Controller is working!";
    }
}
