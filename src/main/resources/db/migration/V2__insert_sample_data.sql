-- Flyway Migration: Insert sample data
-- Sample vets: 101, 102

INSERT INTO vet_salary (vet_id, salary)
VALUES
    (101, 5000.00),
    (102, 6500.00)
ON CONFLICT (vet_id) DO UPDATE SET salary = EXCLUDED.salary;

-- Sample payments
INSERT INTO vet_payment (vet_id, payment_date, amount)
VALUES
    (101, DATE '2025-09-15', 1200.00),
    (102, DATE '2025-09-15', 1500.00);
