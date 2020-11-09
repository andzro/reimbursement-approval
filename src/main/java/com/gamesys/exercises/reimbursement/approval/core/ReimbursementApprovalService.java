package com.gamesys.exercises.reimbursement.approval.core;

public interface ReimbursementApprovalService {

    void approve(ReimbursementApprovalRequest request);

    void approve(ReimbursementApprovalRequest request, String username);

    void disapprove(ReimbursementApprovalRequest request);

}
