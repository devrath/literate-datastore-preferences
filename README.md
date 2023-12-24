<h1 align="center">𝙻𝚒𝚝𝚎𝚛𝚊𝚝𝚎-𝚍𝚊𝚝𝚊𝚜𝚝𝚘𝚛𝚎-𝚙𝚛𝚎𝚏𝚎𝚛𝚎𝚗𝚌𝚎𝚜</h1>

![Banner](https://github.com/devrath/literate-datastore-preferences/blob/main/assets/banner.jpeg)

<p align="center">
<a><img src="https://img.shields.io/badge/Built%20Using-Kotlin-silver?style=for-the-badge&logo=kotlin"></a>
<a><img src="https://img.shields.io/badge/Built%20By-Android%20Studio-red?style=for-the-badge&logo=android%20studio"></a>  
<a><img src="https://img.shields.io/badge/persistence-Datastore%20preferences%20library-deeppink?style=for-the-badge&logo=Bitrise"></a>  
<a><img src="https://img.shields.io/badge/Hilt-Dependency%20Injection-orange?style=for-the-badge&logo=Microsoft"></a>  
<a><img src="https://img.shields.io/badge/MVVM-Architecture-yellow?style=for-the-badge&logo=Adobe"></a>  

</p>

<div align="center">
  
| Contents |
| -------- |
| [𝚆𝚑𝚊𝚝 𝚒𝚜 𝚊 𝙳𝚊𝚝𝚊 𝚂𝚝𝚘𝚛𝚎](https://github.com/devrath/literate-datastore/blob/main/README.md#what-is-data-store) |
| [𝚃𝚢𝚙𝚎𝚜 𝚘𝚏 𝙳𝚊𝚝𝚊 𝚂𝚝𝚘𝚛𝚎](https://github.com/devrath/literate-datastore/blob/main/README.md#types-of-data-store) |
| [𝙳𝚊𝚝𝚊𝚜𝚝𝚘𝚛𝚎 𝙿𝚛𝚎𝚏𝚎𝚛𝚎𝚗𝚌𝚎𝚜](https://github.com/devrath/literate-datastore/blob/main/README.md#datastore-preferences) |
| [𝙲𝚘𝚖𝚙𝚊𝚛𝚒𝚜𝚘𝚗 𝚘𝚏 𝙳𝚊𝚝𝚊𝚜𝚝𝚘𝚛𝚎 𝚙𝚛𝚎𝚏𝚎𝚛𝚎𝚗𝚌𝚎𝚜 𝚠𝚒𝚝𝚑 𝚜𝚑𝚊𝚛𝚎𝚍 𝚙𝚛𝚎𝚏𝚎𝚛𝚎𝚗𝚌𝚎𝚜](https://github.com/devrath/literate-datastore/blob/main/README.md#comparison-of-datastore-preferences-with-shared-preferences) |
| [𝙰𝚋𝚘𝚞𝚝 𝚝𝚑𝚎 𝚙𝚛𝚘𝚓𝚎𝚌𝚝](https://github.com/devrath/literate-datastore/blob/main/README.md#about-the-project) |

</div>


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

<p align="left">
  <img width=300 height=600 src="https://github.com/devrath/literate-datastore-preferences/blob/main/assets/output.gif">
</p>


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>
