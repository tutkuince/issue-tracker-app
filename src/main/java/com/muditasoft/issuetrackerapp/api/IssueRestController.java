package com.muditasoft.issuetrackerapp.api;

import com.muditasoft.issuetrackerapp.dto.IssueDto;
import com.muditasoft.issuetrackerapp.service.IssueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/issue")
public class IssueRestController {

    private final IssueService issueService;

    public IssueRestController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(issueService.getById(id));
    }

    @PostMapping
    public ResponseEntity<IssueDto> createIssue(@Valid @RequestBody IssueDto issueDto) {
        return ResponseEntity.ok(issueService.save(issueDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<IssueDto> updateIssue(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody IssueDto issueDto){
        return ResponseEntity.ok(issueService.update(id, issueDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(issueService.delete(id));
    }
}
