create table category
(
    id        bigint auto_increment primary key,
    name      varchar(45) null,
    member_id bigint      null
);


INSERT INTO rlanddb.category (id, name, member_id) VALUES (1, '커피', 2);
INSERT INTO rlanddb.category (id, name, member_id) VALUES (2, '수제청', 2);
INSERT INTO rlanddb.category (id, name, member_id) VALUES (3, '샌드위치', 2);
INSERT INTO rlanddb.category (id, name, member_id) VALUES (4, '쿠키', 2);
