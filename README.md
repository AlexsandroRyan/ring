# Ring

Ring is a Clojure web applications library inspired by Python's WSGI
and Ruby's Rack. By abstracting the details of HTTP into a simple,
unified API, Ring allows web applications to be constructed of modular
components that can be shared among a variety of applications, web
servers, and web frameworks. This is a forked version of Ring from 1.8.1
that includes the following additional changes:

1. Support for a timeout handler that can be passed to the Jetty adapter
2. Tracking request ingestion time in the request map from Jetty
3. Expose the Jetty request queue to the creator of the Server

The [SPEC][1] file at the root of this distribution provides a
complete description of the Ring interface.

[1]: https://github.com/AlexsandroRyan/ring/blob/master/SPEC

## Upgrade Notice

From version 1.2.1 onward, the ring/ring-core package no longer comes
with the `javax.servlet/servlet-api` package as a dependency (see
issue [#89][2]).

If you are using the `AlexsandroRyan/ring-core` namespace on its own, you may
run into errors when executing tests or running alternative adapters.
To resolve this, include the following dependency in your dev profile:

    [javax.servlet/servlet-api "2.5"]

[2]: https://github.com/ring-clojure/ring/pull/89

## Libraries

* `ring/ring` - meta-package containing all relevant dependencies
* `ring/ring-core` - core functions and middleware for Ring handlers,
  requests and responses
* `org.ring-clojure/ring-core-protocols` - contains only the protocols
  necessary for building Ring responses
* `org.ring-clojure/ring-websocket-protocols` - contains only the protocols
  necessary for WebSockets
* `ring/ring-devel` - functions for developing and debugging Ring
  applications
* `ring/ring-servlet` - construct legacy Java Servlets (≤ 4.0) from Ring
  handlers
* `org.ring-clojure/ring-jakarta-servlet` construct
  [Jakarta Servlets][3] (≥ 5.0) from Ring handlers
* `ring/ring-jetty-adapter` - a Ring adapter that uses an embedded
  [Jetty][4] web server

[3]: https://projects.eclipse.org/projects/ee4j.servlet
[4]: https://eclipse.dev/jetty/

## Installation

To include one of the above libraries, for instance `ring-core`, add
the following dependency to your `deps.edn` file:

    [AlexsandroRyan/ring-core "1.0.0-1.8.1"]

Or to your Leiningen project file:

    [AlexsandroRyan/ring "1.0.0-1.8.1"]

## Documentation

* [Wiki](https://github.com/ring-clojure/ring/wiki)
* [API docs](https://ring-clojure.github.io/ring/)

## Contributing

Please read [CONTRIBUTING.md][5] before submitting a pull request.

[3]: https://github.com/AlexsandroRyan/ring/blob/master/CONTRIBUTING.md

## Thanks

This project borrows heavily from Ruby's Rack and Python's WSGI;
thanks to those communities for their work. Thanks also go to the many
individuals who have contributed to Ring's code and documentation over
the years.

## License

Copyright © 2009-2024 Mark McGranaghan, James Reeves & contributors.

Released under the MIT license.
