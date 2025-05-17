INSERT INTO post(id, title        , description            , content                 , created_at        ,    updated_at)
VALUES           (1, "Java Advance","Learn Spring Framework", "Learn Spring Framework", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO comment(id, name, email, body, created_at, updated_at, post_id)
VALUES              (1, "Nguyen Van A", "A@gmail.com", "Bai viet bo ich", CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);