package main.java.com.model;

import java.math.BigDecimal;
import java.util.List;

/** outcome for one transaction. flags are independent of approve/reject (valid + flagged is still processed). */
public record TransactionResult(String transactionId, String timestamp, String type, String accountId,
                                BigDecimal amount, boolean approved, RejectReason rejectReason,
                                List<String> reviewFlags) {

    public boolean flagged() { return !reviewFlags.isEmpty(); }

    /** lines in the format: "TX001 APPROVED" / "TX002 REJECTED - INVALID ACCOUNT". */
    public String toLine() {
        return approved ? transactionId + " APPROVED"
                        : transactionId + " REJECTED - " + rejectReason.label();
    }
}
