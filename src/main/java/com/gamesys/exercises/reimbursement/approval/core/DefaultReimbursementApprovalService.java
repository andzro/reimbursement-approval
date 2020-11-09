package com.gamesys.exercises.reimbursement.approval.core;

public class DefaultReimbursementApprovalService implements ReimbursementApprovalService {

    private static final boolean APPROVED = true;
    private static final boolean UNAPPROVED = false;

    private final ReimbursementApprovalManager reimbursementApprovalManager;

    public DefaultReimbursementApprovalService(ReimbursementApprovalManager reimbursementApprovalManager) {
        this.reimbursementApprovalManager = reimbursementApprovalManager;
    }

    public void approve(ReimbursementApprovalRequest request) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), APPROVED);
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval);
    }

    public void approveWithApprover(ReimbursementApprovalRequest request, String approver) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), APPROVED);
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval, approver);
    }

    public void disapprove(ReimbursementApprovalRequest request) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), UNAPPROVED);
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval);
    }

    public void disapproveWithReason(ReimbursementApprovalRequest request, String approver, String reason) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), UNAPPROVED);
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval, approver, reason);
    }

}
