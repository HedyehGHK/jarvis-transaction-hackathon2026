package main.java.com.model;

/**
 * a raw transaction that is exactly as read from the file. everything is kept as a String on purpose:
 * dirty data (e.g. amount "12.5O", lowercase type) must reach the validator and not crash the parser.
 */
public record Transaction(int lineNumber, String transactionId, String timestamp, String type,
                          String fromAccount, String toAccount, String amount,
                          String channel, String description) {}
