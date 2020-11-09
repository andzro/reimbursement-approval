package com.gamesys.exercises.reimbursement.approval;

import com.gamesys.exercises.reimbursement.approval.config.ReimbursementApprovalConfiguration;
import com.gamesys.exercises.reimbursement.approval.core.ReimbursementApprovalRequest;
import com.gamesys.exercises.reimbursement.approval.core.ReimbursementApprovalService;

public class ReimbursementApprovalMain {

    public static void main(String[] args) {
        ReimbursementApprovalConfiguration reimbursementApprovalConfiguration = new ReimbursementApprovalConfiguration();
        ReimbursementApprovalService reimbursementApprovalService = reimbursementApprovalConfiguration.reimbursementApprovalService();

        ReimbursementApprovalRequest request = new ReimbursementApprovalRequest();
        request.setEmployeeId(Long.parseLong(args[1]));
        request.setReimbursementId(Long.parseLong(args[2]));

        String approver = args[3];

        if ("approve".equals(args[0])) {
            reimbursementApprovalService.approveWithApprover(request, approver);
        } else if ("disapprove".equals(args[0])) {
            String reason = args[4];
            reimbursementApprovalService.disapproveWithReason(request, approver, reason);
        } else {
            System.out.println("Usage: approve/disapprove <employeeID> <reimbursementID>");
        }
    }

}
