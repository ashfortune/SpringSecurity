
create table menu
(
    id            bigint auto_increment                   primary key,
    kor_name      varchar(45)                             not null,
    eng_name      varchar(45)                             not null,
    price         int                                     not null,
    reg_date      datetime    default current_timestamp() not null,
    category_id   bigint                                  null,
    reg_member_id bigint                                  null,
    constraint kor_name_UNIQUE  unique (kor_name)
);

INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (1, '아메리카노', 'Americano', 4500, '2024-02-19 11:11:59', 1, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (2, '나이트로 바닐라 크림', 'Nitro Vanilla Cream', 5900, '2024-02-19 11:12:07', 1, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (3, '하니딸리가떼', 'honeyStrawberryLatte', 6000, '2024-02-19 11:12:39', 1, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (4, '시그니처 더 블랙 콜드 브루', 'Signature The Black Cold Brew', 19500, '2024-02-19 11:12:59', 1, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (5, '제주 비자림 콜드 브루', 'Jeju Forest Cold Brew', 6800, '2024-02-19 11:14:10', 1, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (6, '자몽아이스티', 'jamongicetee', 3000, '2024-02-19 11:14:18', 2, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (7, '딸기 피지오', 'Strawberry Fizzio', 3000, '2024-02-19 11:15:12', 2, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (8, '디카페인아메리카노', 'decafamericano', 5500, '2024-02-19 11:15:27', 1, 1);
INSERT INTO rlanddb.menu (id, kor_name, eng_name, price, reg_date, category_id, reg_member_id) VALUES (9, '카라멜 마끼아또', 'Caramel Macchiato', 4500, '2024-02-19 11:16:28', 1, 1);
