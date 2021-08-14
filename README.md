# View-On-Click-Hold-Listener 📚
This is a simple snippet written in kotlin for a listener when holding any views or button in android.

## 🔧Setup
* Get the code [here](https://github.com/ShimShim27/View-On-Click-Hold-Listener/blob/main/ViewHoldListener.kt) and put in your IDE.
* Replace the package name and import the needed libraries <br/>

## ⚙️Usage

Using the listener is pretty straight forward. Check the sample code below.<br/>

```
  val exampleView = //any view
  
  exampleView.setOnTouchListener(object:ViewHoldListener:View{
      override fun whileHolding(){
        //Things you want to do while holding the view
      }
  })
```
