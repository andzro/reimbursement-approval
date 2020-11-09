package com.gamesys.exercises.reimbursement.approval.core;

public interface ReimbursementApprovalManager {

    void saveReimbursementApproval(ReimbursementApproval reimbursementApproval);

    void saveReimbursementApproval(ReimbursementApproval reimbursementApproval, String username);
}
