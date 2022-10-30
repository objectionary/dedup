<img alt="logo" src="https://www.objectionary.com/cactus.svg" height="100px" />

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](http://www.rultor.com/b/objectionary/dedup)](http://www.rultor.com/p/objectionary/dedup)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

[![mvn](https://github.com/objectionary/dedup/actions/workflows/mvn.yml/badge.svg?branch=master)](https://github.com/objectionary/dedup/actions/workflows/mvn.yml)
[![PDD status](http://www.0pdd.com/svg?name=objectionary/dedup)](http://www.0pdd.com/p?name=objectionary/dedup)
[![codecov](https://codecov.io/gh/objectionary/dedup/branch/master/graph/badge.svg)](https://codecov.io/gh/objectionary/dedup)
[![Maven Central](https://img.shields.io/maven-central/v/org.eolang/dedup.svg)](https://maven-badges.herokuapp.com/maven-central/org.eolang/dedup)
[![Hits-of-Code](https://hitsofcode.com/github/objectionary/dedup)](https://hitsofcode.com/view/github/objectionary/dedup)
![Lines of code](https://img.shields.io/tokei/lines/github/objectionary/dedup)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/objectionary/dedup/blob/master/LICENSE.txt)

It is a command-line tool that takes a directory with XMIR files and creates a new directory with modified XMIR files: two or more objects that are semantically equivalent are replaced with a single object.

Consider the following EO program:

```
while.
  x
  [i]
    stdout > @
      "Hello!\n"
if.
  t.lt 0
  []
    stdout > @
      "Hello!\n"
  nop
```

This code may be modified as such:

```
[i] > a
  stdout > @
    "Hello!\n"
while.
  x
  a
if.
  t.lt 0
  a
  nop
```

## How to Contribute

Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.
