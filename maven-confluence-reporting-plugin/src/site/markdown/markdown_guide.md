## Usage

To use markdown it is enough to specify a **.md** file in the **site's uri**.

Below the supported format:


### Header
```
# h1
## h2
### h3
#### h4
```
......

### Text Format

#### strikethrough
```
~~Mistaken text.~~
```

#### bold
```
**Bold text**
```

#### italic
```
_Italic text_
```

### Unordered List

```
* Element 1
* Element 2
* Element 3
* Sublist
   1. item 1
   1. item 2
   1. item 3
```

### Ordered List

```
1. Element 1
1. Element 2
1. Element 3
1. Sublist
   * item 1
   * item 2
   * item 3
```

### Site Ref Links

```

* This one is [inline](http://google.com "Google").
* This one is [inline **wo** title](http://google.com).
* This is my [google] link defined after.
* This is my [more complex google] link defined after.
* This is my [relative](relativepage) link defined after.
* This is my [rel] link defined after.

[rel]: relativeagain
[more complex google]: http://google.com "Other google"
[google]: http://google.com

```

### Image Ref Link

```
* add an absolute ![conf-icon](http://www.lewe.com/wp-content/uploads/2016/03/conf-icon-64.png "My conf-icon") with title.
* add a relative ![conf-icon](conf-icon-64.png "My conf-icon") with title.
* add a relative ![conf-icon](conf-icon-64.png) without title.
* add a ref img ![conf-icon-y][y] with title.
* add a ref img ![conf-icon-y1][y1] without title.
* add a ref img ![conf-icon-y2][y2] relative.
* add a ref img ![conf-icon-none] relative with default refname.

[y]: http://www.lewe.com/wp-content/uploads/2016/03/conf-icon-64.png "My conf-icon"
[y1]: http://www.lewe.com/wp-content/uploads/2016/03/conf-icon-64.png
[y2]: conf-icon-64.png
[conf-icon-none]: conf-icon-64.png
```

#### confluence specific
```
![ ](${pageTitle}^image-name.png )
```

#### portable image (can be used for confluence and not)
```
![${pageTitle}^image-name.png](.images/image-name.png "")
```

### Code / Verbatim

#### code block

<pre><![CDATA[
```xml
<developers>
  <developer>
    <id>bsorrentino</id>
    <name>Bartolomeo Sorrentino</name>
    <email>bartolomeo.sorrentino@gmail.com</email>
  </developer>
</developers>
```
]]></pre>

#### inline
<pre><![CDATA[
```this is inline```  
]]></pre>

### table

```
| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |
```

### Blockquote

```
> Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.
Aenean massa. Cum sociis natoque

> Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus.
Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt.
```