Maven Artifact + Source Code = Happiness
====
This branch shows how to toggle between maven repo and source code.

1. Manually clone library repo code at the same directory level as your shell repo code. (Also for this example, checkout the `02-git-submodules`branch of the library.)
1. Create a flag in `gradle.properties` to toggle between artifact & source
1. Add your local source code as a project directory in `settings.gradle`
1. Add conditional logic to the app module `build.gradle` to toggle between artifact & source.

You will be responsible for manually cloning / checking out your library code, but now you can work in one Andorid Studio project and update shell and library code at the same time, while switching back to the benefits of a maven artifact once you have finished making library changes.
