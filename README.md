

# clj-kit
[![Build Status](https://travis-ci.org/SalvatoreTosti/clj-kit.svg?branch=master)](https://travis-ci.org/SalvatoreTosti/clj-kit)  
[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.salvatore-tosti/clj-kit.svg)](https://clojars.org/org.clojars.salvatore-tosti/clj-kit)

An extension of Clojure's standard functions, providing stuff that should just _be there_.

## Usage

The easiest way utilize _clj-kit_ is to use [Leiningen](https://leiningen.org/) to generate a project, then add _clj-kit_ as a dependency.  

```clojure
(defproject my-new-project "1.0.0-SNAPSHOT"
  :description "My great new project."
  :dependencies [[org.clojure/clojure "1.x.0"]
                [clj-kit "x.y.z"]])
```

## Documentation

You can find the [generated documentation](https://github.com/gdeer81/lein-marginalia) at https://salvatoretosti.github.io/clj-kit/.

### namespaces
* **str-kit** - String related functions.
* **coll-kit** - Collection related functions.

## License

Copyright © 2017 Salvatore Tosti

Distributed under the MIT License.
