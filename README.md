Entrevoisins by Ray-Hylian

* 1st step : download the project on the following link https://github.com/Ray-Hylian/OpenClassrooms
* then : open with Android Studio/open an existing project or get from version control/past the previous link
* lastly : the application is open

How does it work ?
In this app, the user can add a new neighbour from an existing list and fill differents infos (name, address, phone number, website and a short instruction). It's also possible to convert a neighbour in favorite, who will be displayed in a favorites list.
Moreover, the user can delete a neighbour or a favorite. 

Successfull tests :

Unit tests
NeighbourServiceTest.java : 
- add and delete a new neighbour or a favorite

Instrumented tests 
NeighbourListTest.java : 
- the list of neighbours is displayed
- a deleted neighbour doesn't appears in the list
- the details are displayed if the user click on a neighbour
- the correct infos correspond to the right neighbour
- the favorites list is working

