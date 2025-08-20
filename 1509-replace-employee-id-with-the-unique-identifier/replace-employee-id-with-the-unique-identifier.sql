SELECT eui."unique_id", e."name"
FROM "employees" e
LEFT JOIN "employeeuni" eui
    ON e.id = eui.id;