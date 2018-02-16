[![GitHub release](https://img.shields.io/github/release/searchy2/CustomImagePicker.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker/releases) [![GitHub Release Date](https://img.shields.io/github/release-date/searchy2/CustomImagePicker.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker) [![Libraries.io for GitHub](https://img.shields.io/librariesio/github/searchy2/CustomImagePicker.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker) [![GitHub issues](https://img.shields.io/github/issues/searchy2/CustomImagePicker.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker) [![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/searchy2/CustomImagePicker.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker) [![API](https://img.shields.io/badge/API-15%2B-blue.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker) [![GitHub top language](https://img.shields.io/github/languages/top/searchy2/CustomImagePicker.svg?style=flat-square)](https://github.com/searchy2/CustomImagePicker)
# Custom Image Picker

![Screenshots](screenshots/Custom-Recent-Images-Cover.gif)

Custom Image Picker is a popup image picker for quick selection of recent images. This photo chooser does not require a custom image provider. Custom Image Picker works great for choosing images in a chat app, selecting a profile image, or any quick image selection needs.

### Single Row 
![Screenshots](screenshots/Recent%20Images%201%20Row.png)

### Double Row
![Screenshots](screenshots/Recent%20Images%202%20Rows.png)

This library is part of the [Custom UI](http://rayliverified.com/index.php/code/) collection of beautiful, minimalistic, and customizable Android UI components.

# Gradle Dependency

Add this line to your `build.gradle` project. Use the latest release version for the version code. 

```java
repositories {
    maven { url 'https://jitpack.io' }
}
compile 'com.github.searchy2:CustomImagePicker:latest-version'
```
# Usage

### Code

Custom Image Picker uses a Dialog popup to display the image gallery. Copy the following code into your project and you will have a working image picker. It's that simple!

First, initialize the bottom sheet layout of our image picker gallery and create the popup dialogue. 

```java
final View bottomSheet = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
final Dialog mBottomSheetDialog = new Dialog(this, R.style.MaterialDialogSheet);
mBottomSheetDialog.setContentView(bottomSheet);
mBottomSheetDialog.setCancelable(true);
mBottomSheetDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
mBottomSheetDialog.getWindow().setGravity(Gravity.BOTTOM);
```

Next, create the image gallery adapter and show it to the user. 

```java
CustomImagePicker ri = new CustomImagePicker();
ri.setHeight(100);
ri.setWidth(100);
ImageAdapter adapter = ri.getAdapter(MainActivity.this);

TwoWayGridView gridview = bottomSheet.findViewById(R.id.gridview);
gridview.getLayoutParams().height = Units.dpToPx(mContext, 200);
gridview.setNumRows(2);
gridview.setAdapter(adapter);
gridview.setOnItemClickListener(new TwoWayAdapterView.OnItemClickListener() {
    public void onItemClick(TwoWayAdapterView parent, View v, int position, long id) {
        imageUri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id);
        //Do what you want with the returned imageUri here.
        mBottomSheetDialog.dismiss();
    }
});

mBottomSheetDialog.show();
```

That's it! Now you have a fancy new image picker! 

# Customization

### Layouts

Custom Image Picker is highly customizable. The default `bottom_sheet_default.xml` layout contains only an image gallery but you can design your own image picker layout or use an existing layout. Please view the sample app for an example image layout with action sheet buttons that capture a photo and open the device image gallery. 

### Builder Attributes

`getAdapter(Context context)` - default method to get adapter

`getAdapter(Context context, String columns, String sort)` - filter available images and sort in `Descending` or `Ascending` order. 

`setDrawable(int drawable)` - set drawable resource Id to replace default placeholder image.

`setHeight(int height)` - set image height (dp).

`setWidth(int width)` - set image width (dp).

`setPadding(int padding)` - set image padding (dp).

`setSize(int size)` - set 1, 2, 3, 4 for image thumbnail quality. 1 is the best quality and 4 is the lowest quality. Default 1.


# Features Wishlist

These features would make this library even more awesome. You can contribute to this library by developing any of the features below. Or, if you really want to see a feature developed, you can sponsor me to develop the feature.

---

>None

If you have any ideas for marking this library even more awesome, please let me know! 

---

Pull requests are most welcome!

If you've fixed a bug or have a feature you've added, just create a pull request. If you've found a bug, file an issue. If you have any questions or would like to discuss upcoming features, please get in touch. You can get in touch with me in the Contact section below. 

# ★ Acknowledgements ★
**♥ Developer ♥**

[Ray Li](https://rayliverified.com)

**♥ Designer ♥**

[Ray Li](https://rayliverified.com)

**♥ Inspiration ♥**
Image selection code from https://github.com/amirarcane/recent-images

# ★ Get in Touch ★
<a href="mailto:ray.li.verified@gmail.com">
  <img alt="Ray Li Email"
       src="https://lh3.googleusercontent.com/yN_m90WN_HSCohXdgC2k91uSTk9dnYfoxTYwG_mv_l5_05dV2CzkQ1B6rEqH4uqdgjA=w96" />
</a>
<a href="https://rayliverified.com">
  <img alt="Ray Li Website"
       src="https://lh3.googleusercontent.com/YmMGcgeO7Km9-J9vFRByov5sb7OUKetnKs8pTi0JZMDj3GVJ61GMTcTlHB7u9uHDHag=w96" />
</a>
<a href="https://twitter.com/RayLiVerified">
  <img alt="Ray Li Twitter"
       src="https://lh3.ggpht.com/lSLM0xhCA1RZOwaQcjhlwmsvaIQYaP3c5qbDKCgLALhydrgExnaSKZdGa8S3YtRuVA=w96" />
</a>
<a href="https://linkedin.com/in/rayliverified/">
  <img alt="Ray Li LinkedIn"
       src="https://lh3.googleusercontent.com/00APBMVQh3yraN704gKCeM63KzeQ-zHUi5wK6E9TjRQ26McyqYBt-zy__4i8GXDAfeys=w90" />
</a>
<a href="https://www.uplabs.com/ray">
  <img alt="Ray Li UpLabs"
       src="https://lh3.googleusercontent.com/fDJB4jtIgZQF_Dj7AFAPEv2dJOJE8LaLSbaiOOFejQJl3oFbkOLLScstkp699oMDcEU=w90" />
</a>
<a href="https://github.com/searchy2">
  <img alt="Ray Li GitHub"
       src="https://lh3.googleusercontent.com/L15QqmKK7Vl-Ag1ZxaBqNQlXVEw58JT2BDb-ef5t2eboDh0pPSLjDgi3-aQ3Opdhhyk=w96" />
</a>

# Apps Using This Library

Want to be here? You can include yourself by making a `pull request`. 

<table>
	<tr>
		<td><img src="https://lh3.googleusercontent.com/R-vJInTblK1KBOqZaSDm_ac270QBHsiIcU9agHnN-rrp9K_lkN8rLzGIH8asCfkb420Q=w64"/></td>
		<td><a href="https://play.google.com/store/apps/details?id=io.ideastarter">Crowdfunding Community</a></td>
	</tr>
</table>

#### Search Terms
android, image, photo, picker, select, selector, chooser, gallery, viewer
