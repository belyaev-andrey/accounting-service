-- Flyway Migration: Insert sample data
-- Sample vets: 101, 102

INSERT INTO vet_salary (id, vet_id, salary)
VALUES
    (1, 101, 50.00),
    (2, 102, 65.00)
ON CONFLICT (vet_id) DO UPDATE SET salary = EXCLUDED.salary;

-- Sample payments
INSERT INTO vet_payment (id, vet_id, payment_date, amount)
VALUES
    (1, 101, DATE '2025-09-01', 0.00),
    (2, 102, DATE '2025-09-01', 0.00);
