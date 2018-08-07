# OSGi Services

## Code for having multiple implementations of an interface consumed all at once!

All implementations and the interface are in separate bundles. 
*Shape* is the bundle containing the interface, *Main* is the consumer bundle.
The other bundles are the implementations of *Shape*.

Here, *Main* consumes all the **active** services. This is done using filter in properties.

As a newbie to OSGi I had a tough time figuiring out how the consumer can get the services from a number of implementations of the same interface. Hence thought of sharing this code. Cheers!
