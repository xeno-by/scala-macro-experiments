package examples

import ddl._

object SimpleDSL {
  val b = "b"

  val foos = CREATE TABLE t"my_table_name" (
    c"empno" NUMBER(5) PRIMARY KEY,
    c"empno2" NUMBER(5) PRIMARY KEY,
    PRIMARY KEY(pk"empno", pk"empno2")
  )
}
