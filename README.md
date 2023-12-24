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
* 𝙸𝚝 𝚒𝚜 𝚙𝚊𝚛𝚝 𝚘𝚏 𝚊𝚗𝚍𝚛𝚘𝚒𝚍 [𝚓𝚎𝚝𝚙𝚊𝚌𝚔](https://developer.android.com/jetpack)
* 𝙸𝚝 𝚒𝚜 𝚊 𝚍𝚊𝚝𝚊 𝚜𝚝𝚘𝚛𝚊𝚐𝚎 𝚜𝚘𝚕𝚞𝚝𝚒𝚘𝚗 𝚝𝚑𝚊𝚝 𝚊𝚕𝚕𝚘𝚠𝚜 𝚢𝚘𝚞 𝚝𝚘 𝚜𝚝𝚘𝚛𝚎 `𝚔𝚎𝚢-𝚟𝚊𝚕𝚞𝚎` 𝚙𝚊𝚒𝚛𝚜
* 𝙸𝚝 𝚞𝚜𝚎𝚜 `𝙺𝚘𝚝𝚕𝚒𝚗 𝚌𝚘𝚛𝚘𝚞𝚝𝚒𝚗𝚎𝚜` 𝚊𝚗𝚍 `𝙵𝚕𝚘𝚠`
* 𝙸𝚝 𝚒𝚜 𝚞𝚜𝚎𝚍 𝚝𝚘 𝚜𝚝𝚘𝚛𝚎 𝚍𝚊𝚝𝚊 `𝚊𝚜𝚢𝚗𝚌𝚑𝚛𝚘𝚗𝚘𝚞𝚜𝚕𝚢`, `𝚌𝚘𝚗𝚜𝚒𝚜𝚝𝚎𝚗𝚝𝚕𝚢`, 𝚊𝚗𝚍 `𝚝𝚛𝚊𝚗𝚜𝚊𝚌𝚝𝚒𝚘𝚗𝚊𝚕𝚕𝚢`

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
* 𝙷𝚎𝚛𝚎 𝚠𝚎 𝚞𝚜𝚎 `𝚍𝚊𝚝𝚊𝚜𝚝𝚘𝚛𝚎 𝚙𝚛𝚎𝚏𝚎𝚛𝚎𝚗𝚌𝚎𝚜` 𝚝𝚘 𝚜𝚝𝚘𝚛𝚎 𝚊 𝚋𝚘𝚘𝚕𝚎𝚊𝚗 𝚟𝚊𝚕𝚞𝚎 𝚒𝚗 𝚝𝚑𝚎 𝚙𝚎𝚛𝚜𝚒𝚜𝚝𝚎𝚗𝚌𝚎 𝚕𝚘𝚌𝚊𝚕𝚕𝚢 𝚊𝚗𝚍 𝚛𝚎𝚝𝚛𝚒𝚎𝚟𝚎 𝚒𝚝
* 𝙿𝚛𝚘𝚓𝚎𝚌𝚝 𝚑𝚊𝚜 𝚊 𝚕𝚒𝚜𝚝 𝚘𝚏 𝚒𝚝𝚎𝚖𝚜 𝚍𝚒𝚜𝚙𝚕𝚊𝚢𝚎𝚍 𝚒𝚗 𝚊 `𝚛𝚎𝚌𝚢𝚌𝚕𝚎𝚛 𝚟𝚒𝚎𝚠`
* `𝙼𝚅𝚅𝙼` 𝚊𝚛𝚌𝚑𝚒𝚝𝚎𝚌𝚝𝚞𝚛𝚎 𝚒𝚜 𝚞𝚜𝚎𝚍 𝚏𝚘𝚛 𝚝𝚑𝚎 𝚒𝚖𝚙𝚕𝚎𝚖𝚎𝚗𝚝𝚊𝚝𝚒𝚘𝚗 
* `𝙷𝚒𝚕𝚝` 𝚒𝚜 𝚞𝚜𝚎𝚍 𝚊𝚜 𝚊 𝚍𝚎𝚙𝚎𝚗𝚍𝚎𝚗𝚌𝚢 𝚒𝚗𝚓𝚎𝚌𝚝𝚒𝚘𝚗 𝚝𝚘𝚘𝚕 𝚝𝚘 𝚒𝚗𝚓𝚎𝚌𝚝 𝚝𝚑𝚎 𝚍𝚊𝚝𝚊𝚜𝚝𝚘𝚛𝚎 𝚙𝚛𝚎𝚏𝚎𝚛𝚎𝚗𝚌𝚎𝚜 𝚝𝚘 𝚝𝚑𝚎 𝚟𝚒𝚎𝚠 𝚖𝚘𝚍𝚎𝚕 
* 𝚆𝚎 𝚘𝚋𝚜𝚎𝚛𝚟𝚎 𝚝𝚑𝚎 𝚌𝚑𝚊𝚗𝚐𝚎𝚜 𝚒𝚗 𝚝𝚑𝚎 𝚊𝚌𝚝𝚒𝚟𝚒𝚝𝚢

<p align="left">
  <img width=300 height=600 src="https://github.com/devrath/literate-datastore-preferences/blob/main/assets/output.gif">
</p>


## **`𝚂𝚞𝚙𝚙𝚘𝚛𝚝`** ☕
𝙸𝚏 𝚢𝚘𝚞 𝚏𝚎𝚎𝚕 𝚕𝚒𝚔𝚎 𝚜𝚞𝚙𝚙𝚘𝚛𝚝 𝚖𝚎 𝚊 𝚌𝚘𝚏𝚏𝚎𝚎 𝚏𝚘𝚛 𝚖𝚢 𝚎𝚏𝚏𝚘𝚛𝚝𝚜, 𝙸 𝚠𝚘𝚞𝚕𝚍 𝚐𝚛𝚎𝚊𝚝𝚕𝚢 𝚊𝚙𝚙𝚛𝚎𝚌𝚒𝚊𝚝𝚎 𝚒𝚝.</br>
<a href="https://www.buymeacoffee.com/devrath" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/yellow_img.png" alt="𝙱𝚞𝚢 𝙼𝚎 𝙰 𝙲𝚘𝚏𝚏𝚎𝚎" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

## **`𝙲𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚎`** 🙋‍♂️
𝚁𝚎𝚊𝚍 [𝚌𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚒𝚘𝚗 𝚐𝚞𝚒𝚍𝚎𝚕𝚒𝚗𝚎𝚜](CONTRIBUTING.md) 𝚏𝚘𝚛 𝚖𝚘𝚛𝚎 𝚒𝚗𝚏𝚘𝚛𝚖𝚊𝚝𝚒𝚘𝚗 𝚛𝚎𝚐𝚊𝚛𝚍𝚒𝚗𝚐 𝚌𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚒𝚘𝚗.

## **`𝙵𝚎𝚎𝚍𝚋𝚊𝚌𝚔`** ✍️ 
𝙵𝚎𝚊𝚝𝚞𝚛𝚎 𝚛𝚎𝚚𝚞𝚎𝚜𝚝𝚜 𝚊𝚛𝚎 𝚊𝚕𝚠𝚊𝚢𝚜 𝚠𝚎𝚕𝚌𝚘𝚖𝚎, [𝙵𝚒𝚕𝚎 𝚊𝚗 𝚒𝚜𝚜𝚞𝚎 𝚑𝚎𝚛𝚎](https://github.com/devrath/literate-datastore-preferences/issues/new).

## **`𝙵𝚒𝚗𝚍 𝚝𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚞𝚜𝚎𝚏𝚞𝚕`** ? ❤️
𝚂𝚞𝚙𝚙𝚘𝚛𝚝 𝚒𝚝 𝚋𝚢 𝚌𝚕𝚒𝚌𝚔𝚒𝚗𝚐 𝚝𝚑𝚎 ⭐ 𝚋𝚞𝚝𝚝𝚘𝚗 𝚘𝚗 𝚝𝚑𝚎 𝚞𝚙𝚙𝚎𝚛 𝚛𝚒𝚐𝚑𝚝 𝚘𝚏 𝚝𝚑𝚒𝚜 𝚙𝚊𝚐𝚎. ✌️

## **`𝙻𝚒𝚌𝚎𝚗𝚜𝚎`** ![Licence](https://img.shields.io/github/license/google/docsy) :credit_card:
𝚃𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚒𝚜 𝚕𝚒𝚌𝚎𝚗𝚜𝚎𝚍 𝚞𝚗𝚍𝚎𝚛 𝚝𝚑𝚎 𝙰𝚙𝚊𝚌𝚑𝚎 𝙻𝚒𝚌𝚎𝚗𝚜𝚎 𝟸.𝟶 - 𝚜𝚎𝚎 𝚝𝚑𝚎 [𝙻𝙸𝙲𝙴𝙽𝚂𝙴](https://github.com/devrath/literate-datastore-preferences/blob/main/LICENSE) 𝚏𝚒𝚕𝚎 𝚏𝚘𝚛 𝚍𝚎𝚝𝚊𝚒𝚕𝚜.


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>
