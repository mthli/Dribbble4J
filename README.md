Dribbble4J
===

[Dribbble API(v1)](http://developer.dribbble.com/v1/ "Dribbble API(v1)") for Java.

## How to use the library?

You need to get a **AccessToken** with [suitable permission(scope)](http://developer.dribbble.com/v1/oauth/ "Dribbble API #oauth").

And then, for example, check if you like a shot:

    ...
    
    Dribbble dribbble = new Dribbble(ACCESS_TOKEN);
    
    ShotService service = dribbble.getShotService();
    
    try {
        System.out.printlin(
            service.isShotLike(SHOT_ID);
        );
    } catch(ResponseExpception r) {
        /* Do something here */
    }
    
    ...

[Download latest jar]( "Latest jar").

### Attentions:

 - I'm **not a Player** of Dribbble so that some methods such as `ShotService.createShot()` I have no idea to implement, you need to do that by yourself.
 
 - I have no time to complete the Javadoc and some tests, but with the [Dribbble API(v1)](http://developer.dribbble.com/v1/ "Dribbble API(v1)") you can get the clear struct of the source code.
 
So welcome pull request :)

## How to use the source code?

Just import the `Dribbble4J` folder with your __IntelliJ IDEA__.

## License:

_[Apache License, Version 2.0](https://github.com/mthli/Dribbble4J/blob/master/LICENSE "Apache License, Version 2.0")_
