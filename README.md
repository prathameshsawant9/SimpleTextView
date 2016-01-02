# SimpleTextView
Simple TextView for using custom font's , linear gradient and setting up Html Text from xml itself.

## Features 
- Easy to use for applying custom font from Assets
- Simple method to set Linear Gradient with Vertical and Horizontal Orientation
- Set Html text from xml 

## Gradle
```groovy
    dependencies {
    	compile 'com.leo.simpletextview:simpletextvw:1.0.0'
    }
```

## Usage
### Example 1
```xml
<com.leo.simpletextview.SimpleTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Example 1"
        custom:font="pacifico.ttf"
        custom:linear_gradient="horizontal"
        custom:start_color="#FF0000"
        custom:end_color="#0000FF"/>
```
### Example 2
in layout 
```xml
<com.leo.simpletextview.SimpleTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Example 2"
        custom:text_html="@string/sample_htmltext"/>
```
in strings
```xml
<string name="sample_htmltext"><![CDATA[ <font color="purple">This is some html text!</font> ]]></string>
```
### Example 3
```java
// To set Font
mSimpleTextView.setFont("fontname.ttf");

// To set Gradient [LG_HORIZONTAL or LG_VERTICAL]
mSimpleTextView.setLinearGradient(Color.RED,Color.BLUE,SimpleTextView.LG_VERTICAL);

// To set Html Text
mSimpleTextView.setHtmlText("<font color="purple">This is some html text!</font>");
```

