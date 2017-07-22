

# clj-kit
[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.salvatore-tosti/clj-kit.svg)](https://clojars.org/org.clojars.salvatore-tosti/clj-kit)  

An extension of Clojure's standard function, providing stuff that should just _be there_.

## Usage

The easiest way utilize _clj-kit_ is to use [Leiningen](https://leiningen.org/) to generate a project, then add _clj-kit_ as a dependency.  

```clojure
(defproject my-new-project "1.0.0-SNAPSHOT"
  :description "My great new project."
  :dependencies [[org.clojure/clojure "1.x.0"]
                [clj-kit "x.y.z"]])
```

## Namespaces

### str-kit
String related functions.
* is-only-alpha?
* contains-alpha?
* is-lower?
* is-upper?
* is-integer?
* is-double?

### coll-kit
Collection related functions.
* coll-contains?
* remove-nth
* remove-random
* select-random
* split-nth
* remove-random
* rand-nth-keys
* rand-nth-values

## License

Copyright © 2017 Salvatore Tosti

Distributed under the MIT License.
