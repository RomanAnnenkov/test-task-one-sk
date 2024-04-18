INSERT INTO sk_example_table (id, obj)
VALUES (1,'{"current":0}'::JSONB)
ON CONFLICT (id) DO UPDATE
SET obj = EXCLUDED.obj;