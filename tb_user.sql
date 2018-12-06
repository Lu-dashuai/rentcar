prompt PL/SQL Developer import file
prompt Created on 2018??12??6?? by admin
set feedback off
set define off
prompt Creating TB_USER...
create table TB_USER
(
  empno    NUMBER(4),
  ename    VARCHAR2(10),
  job      VARCHAR2(9),
  hiredate DATE,
  sal      NUMBER(7,2),
  comm     NUMBER(7,2),
  deptno   NUMBER(2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for TB_USER...
alter table TB_USER disable all triggers;
prompt Deleting TB_USER...
delete from TB_USER;
commit;
prompt Loading TB_USER...
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7369, 'SMITH', '????', to_date('12-12-1990', 'dd-mm-yyyy'), 800, 1000, 20);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7499, 'ALLEN', 'SALESMAN', to_date('20-02-1981', 'dd-mm-yyyy'), 1600, 300, 30);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7521, 'WARD', 'SALESMAN', to_date('22-02-1981', 'dd-mm-yyyy'), 1250, 500, 30);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7566, 'JONES', 'MANAGER', to_date('02-04-1981', 'dd-mm-yyyy'), 2975, 0, 20);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7654, 'MARTIN', 'SALESMAN', to_date('28-09-1981', 'dd-mm-yyyy'), 1250, 1400, 30);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7698, 'BLAKE', 'MANAGER', to_date('01-05-1981', 'dd-mm-yyyy'), 2850, 0, 30);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7782, 'CLARK', 'MANAGER', to_date('09-06-1981', 'dd-mm-yyyy'), 2450, 0, 10);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7788, 'SCOTT', 'ANALYST', to_date('19-04-1987', 'dd-mm-yyyy'), 3000, 0, 20);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7839, 'KING', 'PRESIDENT', to_date('17-11-1981', 'dd-mm-yyyy'), 5000, 0, 10);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7844, 'TURNER', 'SALESMAN', to_date('08-09-1981', 'dd-mm-yyyy'), 1500, 0, 30);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7876, 'ADAMS', 'CLERK', to_date('23-05-1987', 'dd-mm-yyyy'), 1100, 0, 20);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7900, 'JAMES', 'CLERK', to_date('03-12-1981', 'dd-mm-yyyy'), 950, 0, 30);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7902, 'FORD', 'ANALYST', to_date('03-12-1981', 'dd-mm-yyyy'), 3000, 0, 20);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (7934, 'MILLER', 'CLERK', to_date('23-01-1982', 'dd-mm-yyyy'), 1300, 0, 10);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (21, 'luruihua', 'lur', to_date('08-12-2018', 'dd-mm-yyyy'), 1, null, null);
insert into TB_USER (empno, ename, job, hiredate, sal, comm, deptno)
values (6, '???', '11', to_date('04-07-2012', 'dd-mm-yyyy'), 2, null, null);
commit;
prompt 16 records loaded
prompt Enabling triggers for TB_USER...
alter table TB_USER enable all triggers;
set feedback on
set define on
prompt Done.
