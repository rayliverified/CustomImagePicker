[![GitHub release](https://img.shields.io/github/release/searchy2/CustomRecentImages.svg?style=flat-square)](https://github.com/searchy2/CustomRecentImages/releases) [![Libraries.io for GitHub](https://img.shields.io/librariesio/github/searchy2/CustomRecentImages.svg?style=flat-square)](https://github.com/searchy2/CustomRecentImages) [![Github file size](https://img.shields.io/badge/Size-134 KB-e91e63.svg?style=flat-square)](https://github.com/searchy2/CustomRecentImages)
# Custom Recent Images

![Screenshots](demo/app_icon.png)

Custom Recent Images is part of the Custom UI collection of ready-made, essential, and elegant Android code libraries. Custom Recent Images provides a drop-in popup gallery for selecting recent images. 

### Single Row 
![Screenshots](demo/Recent%20Images%201%20Row.png)

### Double Row
![Screenshots](demo/Recent%20Images%202%20Rows.png)

# Gradle Dependency

Add this line to your `build.gradle` project. Use the latest release version for the version code. 

```java
repositories {
    maven { url 'https://jitpack.io' }
}
compile 'com.github.searchy2:CustomRecentImages:latest-version'
```
# Usage

Just add these lines to your class, that's it.

```java
RecentImages ri = new RecentImages();
ImageAdapter adapter = ri.getAdapter(MainActivity.this);
```
`ri.getAdapter()` method reurns an adapter that you can easily set it as your gridview adapter. By default it returns device pictures
based on `Date_Taken` and `Descending` order, for changing them see Customization.

You can use regular gridview but if you want to use it exactly like above picture you need horizontal gridview.
I used jess-anders/two-way-gridview in this library. All you have to do is set below code in your xml instaed of regular gridview:

```xml
<com.jess.ui.TwoWayGridView
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:background="#E8E8E8"
    android:id="@+id/gridview"
    android:layout_width="fill_parent" 
    android:layout_height="fill_parent"
    app:columnWidth="70dp"
    app:rowHeight="70dp"
    app:numColumns="auto_fit"
    app:numRows="auto_fit"
    app:verticalSpacing="16dp"
    app:horizontalSpacing="16dp"
    app:gravity="center"/>

```
---
# Customization

RecentImages class contains some methods for customization:

`getAdapter(Context context)` default method to get adapter

`getAdapter(Context context, String columns, String sort)` parameter columns filters device images base on date, name, id and etc. parameter sort will sort them based on `Desecnding` or `Ascending` order

`setDrawable(int drawable)` to use an image from you drwable folder before loading of images

`setHeight(int height)` to set images height (in dp)

`setWidth(int width)` to set images width (in dp)

`setPadding(int padding)` to set images padding (in dp)

`setSize(int size)` to set quality of thumbnail images (values are 1, 2, 3, 4. 1 means best quality and high resulotion and 4 means least quality an low resolution)

Here is an example:

```java
RecentImages ri = new RecentImages();
ri.setHeight(70);
ri.setWidth(70);
ImageAdapter adapter = ri.getAdapter(MainActivity.this, ri.LATITUDE, ri.ASCENDING);
gridview.setAdapter(adapter);
```
