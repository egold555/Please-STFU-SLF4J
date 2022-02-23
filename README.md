# Please STFU SLF4J
No offence to the people who made slf4j, but its an annoying logger that needs to stfu up sometimes ;)

## Backstory
Alright so have you ever been writing some code, and you added a library. You clicked run to test your code, and you get this junk outputted to your console?
```
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
SLF4J: Failed to load class "org.slf4j.impl.StaticMDCBinder".
SLF4J: Defaulting to no-operation MDCAdapter implementation.
SLF4J: See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.
```
Plus, now there are things that are being printed to your log that are not being formatted by your custom logger.

Thats where Please STFU SLF4J comes in! Its a (almost) drop in ready piece of code that puta a piece of duct tape over SLF4J's loud mouth, silences those pesky startup errors, and even can integrate with your own custom logger! What are you waiting for?!

## Installation
Copy all the code from the [code](./code/) folder into your project.

Edit the file [ShitLogger](./code/org/golde/stfuslf4j/ShitLogger.java) to implement your own logger, so everything is forced to use your logger, and not SLF4J.
