CREATE table task
(
    id          bigserial primary key,
    date        DATE    not null,
    description text,
    done        boolean not null default false
);

create index task_date_idx on task (date);
create index task_done_idx on task (done);

CREATE table users
(
    id       bigserial primary key,
    login    text not null,
    password text not null
);