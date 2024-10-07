
# Observer Design Pattern

## Intent
It is a behaviour design patte, it allow subscription mechanism to notify subscriber object if any events happen to the observing object. 

## User case 
Implementing event driven system.

Publish/subscriber mechanism eg messageque.

Use it when changes in one object need to trigger update in other objects.


## Example 
The weather station, it gather data from sensors. whenever new data is collect, it needs to notify other interested component(Observer).

It has weatherstation works as publisher and display unit as subscrber.

1. Current Display Unit
2. Static display unit
3. forcast display unit

