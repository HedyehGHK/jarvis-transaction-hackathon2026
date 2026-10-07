package main.java.com.model;

public enum TransactionType {
    DEPOSIT,      // money in  -> toAccount
    WITHDRAWAL,   // money out -> fromAccount
    PURCHASE,     // money out -> fromAccount
    TRANSFER;     // fromAccount -> toAccount

    public static TransactionType parse(String raw) {
        if (raw == null) return null;
        try { return valueOf(raw.trim().toUpperCase()); }
        catch (IllegalArgumentException e) { return null; }   // e.g. REVERSAL is not supported in the MVP
    }
}

