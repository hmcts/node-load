# node-load

A simple load generator for kubernetes using helm.

Allows to generate some background load to stress-test your software on a cluster. This is especially
useful to load-test applications.

This chart is quite simple. It uses an image of a Java application that keeps computing prime numbers 
(inefficiently as to use more resources) in an infinite loop.
The current defaults will generate as much computation as the the kubernetes limits settings allow.

It runs as a daemonset so each node in the cluster will have pretty much the same load on it.


**To Install**

- Run:

    > helm install node-load --name node-load

Or see Makefile.