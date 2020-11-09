package com.gamesys.exercises.reimbursement.approval.core;

public interface ReimbursementApprovalService {

    void approve(ReimbursementApprovalRequest request);

    default void approveWithApprover(ReimbursementApprovalRequest request, String approver) {}

    void disapprove(ReimbursementApprovalRequest request);

    default void disapproveWithReason(ReimbursementApprovalRequest request, String approver, String reason) {}

}
