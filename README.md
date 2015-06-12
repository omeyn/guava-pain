# guava-pain
Trying to solve the pain of conflicting guava versions in as simple an environment as possible.

Within the g12 module is a KillAllTheThings class which tries to call methods on two classes from other projects, each of which depend on g12 and g17, respectively. That works because those two each shade guava within their artifacts.
