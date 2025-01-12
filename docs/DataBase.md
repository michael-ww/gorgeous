./bin/mysqld_safe --defaults-file=./etc/my.cnf --user=root &

## Perform sequence
from->on->(left/right)join->where->group by->having->select->distinct->order by->limit
## Rollback
DDL can not be rollback, DCL can be rollback when set autocommit=false;