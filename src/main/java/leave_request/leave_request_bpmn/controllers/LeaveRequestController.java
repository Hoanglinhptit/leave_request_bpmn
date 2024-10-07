package leave_request.leave_request_bpmn.controllers;

import leave_request.leave_request_bpmn.entities.LeaveRequest;
import leave_request.leave_request_bpmn.repo.LeaveRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/leave-requests")
public class LeaveRequestController {
    private final LeaveRequestRepository leaveRequestRepository;

    @Autowired
    public LeaveRequestController(LeaveRequestRepository leaveRequestRepository) {
        this.leaveRequestRepository = leaveRequestRepository;
    }

    @PostMapping
    public LeaveRequest createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
        return leaveRequestRepository.save(leaveRequest);
    }

    @GetMapping("/{id}")
    public LeaveRequest getLeaveRequest(@PathVariable Long id) {
        return leaveRequestRepository.findById(id).orElseThrow(() -> new RuntimeException("Leave Request not found"));
    }
}
