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
## License

Copyright 2016 Prathamesh Sawant

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
