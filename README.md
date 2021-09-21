# literate-datastore
This repository describes how to use data store in a mvvm based project

| Contents |
| -------- |
| What is Data Store(https://github.com/devrath/literate-datastore/blob/main/README.md#what-is-data-store) |
| Types of Data Store(https://github.com/devrath/literate-datastore/blob/main/README.md#types-of-data-store) |
| Datastore Preferences(https://github.com/devrath/literate-datastore/blob/main/README.md#datastore-preferences) |
| Comparison of Datastore preferences with shared preferences(https://github.com/devrath/literate-datastore/blob/main/README.md#comparison-of-datastore-preferences-with-shared-preferences) |
| About the project(https://github.com/devrath/literate-datastore/blob/main/README.md#about-the-project) |



### What is [Data Store](https://developer.android.com/topic/libraries/architecture/datastore?gclid=CjwKCAjwhaaKBhBcEiwA8acsHFr6Svpzv9_bUiFBjH89XbKaXBST8QvfZu3zh_LAtlfv28jp195jHhoCi5QQAvD_BwE&gclsrc=aw.ds#kts)
* It is part of android [jetpack](https://developer.android.com/jetpack)
* It is a data storage solution that allows you to store `key-value` pairs
* It uses `Kotlin coroutines` and `Flow`
* It is used to store data `asynchronously`, `consistently`, and `transactionally`

### Types of [Data Store](https://developer.android.com/topic/libraries/architecture/datastore?gclid=CjwKCAjwhaaKBhBcEiwA8acsHFr6Svpzv9_bUiFBjH89XbKaXBST8QvfZu3zh_LAtlfv28jp195jHhoCi5QQAvD_BwE&gclsrc=aw.ds#kts)

<p align="center">
<a><img src="https://github.com/devrath/literate-datastore/blob/main/assets/types.png"></a>
</p>

### [Datastore Preferences](https://developer.android.com/topic/libraries/architecture/datastore?gclid=CjwKCAjwhaaKBhBcEiwA8acsHFr6Svpzv9_bUiFBjH89XbKaXBST8QvfZu3zh_LAtlfv28jp195jHhoCi5QQAvD_BwE&gclsrc=aw.ds#preferences-datastore)
The Preferences DataStore implementation uses the DataStore and Preferences classes to persist simple key-value pairs to disk.

### Comparison of Datastore preferences with shared preferences
<p align="left">
<a><img width=400 height=400 src="https://github.com/devrath/literate-datastore/blob/main/assets/data_store_shared_prefs.png"></a>
</p>

### About the project
* Here we use `datastore preferences` to store a boolean value in the persistence locally and retrieve it
* Project has a list of items displayed in a `recycler view`
* `MVVM` architecture is used for the implementation 
* `Hilt` is used as a dependency injection tool to inject the datastore preferences to the view model 
* We observe the changes in the activity  

