INSERT INTO poll (id, description) VALUES
	(1, 'This is the question');

INSERT INTO option (id, poll_id, description) VALUES
	(1, 1, 'First option'),
	(2, 1, 'Second option'),
	(3, 1, 'Third option');
