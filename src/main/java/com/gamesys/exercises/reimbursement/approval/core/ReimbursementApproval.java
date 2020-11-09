package com.gamesys.exercises.reimbursement.approval.core;

public class ReimbursementApproval {

    private long reimbursementId;
    private long employeeId;
    private boolean approved;
    private String approver;
    private String reason;

    public ReimbursementApproval() {
    }

    public ReimbursementApproval(long reimbursementId, long employeeId, boolean approved) {
        this.reimbursementId = reimbursementId;
        this.employeeId = employeeId;
        this.approved = approved;
    }

    public ReimbursementApproval(long reimbursementId, long employeeId, boolean approved, String approver) {
        this.reimbursementId = reimbursementId;
        this.employeeId = employeeId;
        this.approved = approved;
        this.approver = approver;
    }

    public ReimbursementApproval(long reimbursementId, long employeeId, boolean approved, String approver, String reason) {
        this.reimbursementId = reimbursementId;
        this.employeeId = employeeId;
        this.approved = approved;
        this.approver = approver;
        this.reason = reason;
    }

    public long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getApprover() {
        return approver;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "ReimbursementApproval{" +
                "reimbursementId=" + reimbursementId +
                ", employeeId=" + employeeId +
                ", approved=" + approved +
                '}';
    }
}
