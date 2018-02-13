INSERT INTO poll (poll_id, poll_description) VALUES
	(1, 'This is the question');

INSERT INTO option (option_id, poll_id, option_description) VALUES
	(1, 1, 'First option'),
	(2, 1, 'Second option'),
	(3, 1, 'Third option');
