# Jarvis Transaction Hackathon 2026

## Project Goal
Build a simple bank transaction processing system.

## Main Features
- Validate transactions
- Update account balances
- Reject invalid transactions
- Flag transactions for review
- Generate summary results

## Testing
Manual testing will be done using the main business rules.

Test cases include:
- Valid transaction
- Inactive account
- Missing account
- Amount = 0
- Negative amount
- Duplicate transaction ID
- Insufficient balance
- High amount
- Daily limit exceeded
- Too many transactions in a short timeframe

See `transaction_test_cases.xlsx` for expected and actual results.