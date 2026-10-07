package main.java.com.model;

import java.util.Map;

public record ProcessingSummary(int processed, int approved, int rejected, int flagged,
                                Map<String, Integer> rejectionBreakdown) {}
