# AsMultiModule
Android Studio Multi Module build with a java-only module

# Lint checks
The lint checks in the java-only module do NOT work when we use the `implementation` configuration.  
When we use `compile` it they work.

see: https://docs.gradle.org/current/userguide/java_library_plugin.html#sec:java_library_configurations_graph

related links:

 * [Android Studio 3.0 bug - Android lint rules run on pure java modules](https://issuetracker.google.com/issues/62086752)
 * [RxLint 1.3 - 
rxlint doesn't work in multimodule android projects](https://bitbucket.org/littlerobots/rxlint/issues/9/rxlint-doesnt-work-in-multimodule-android#)
 

