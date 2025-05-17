INSERT INTO post(id, title        , description            , content                 , created_at        ,    updated_at)
VALUES           (1, "Java Advance","Learn Spring Framework", "Learn Spring Framework", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                 (2, "Java Core","Learn Java Core", "Learn Java Core", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                 (3, "Frond Basis","Learn HTML, CSS, JS", "Learn HTML, CSS, JS", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                 (4, "Database","Learn MySQL", "Learn MySQL", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                 (5, "React JS","Learn React JS", "Learn React JS", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO comment(id, name, email, body, created_at, updated_at, post_id)
VALUES              (1, "Nguyen Van A", "A@gmail.com", "Bai viet bo ich", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1),
                    (2, "Nguyen Van B", "B@gmail.com", "Bai viet rat te", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2),
                    (3, "Nguyen Van C", "C@gmail.com", "Bai viet rat te", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4),
                    (4, "Nguyen Van D", "D@gmail.com", "Bai viet rat te", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4),
                    (5, "Nguyen Van E", "E@gmail.com", "Bai viet rat tot", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
