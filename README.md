# SampleNotification-Notify
Android Library to Recieve Notification for android Apps
 - USAGE 
 - First Add Firebase To yout project 
 
 -*second Initialize Object of Notification Library Like this :*
  
  ```
   private lateinit var notify: Notify
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notify = Notify()
```

**By this , Firebase is Initialized and a service is generated to get the token for the app**
-*then there's two methods to be used :
  ```
   private lateinit var notify: Notify
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notify = Notify()
        notify.getToken(this@MainActivity)
        
```
- this will print the token regisetred by firebase 

  ```
   private lateinit var notify: Notify
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notify = Notify()
        Notify.sendTokenToWebService(this@MainActivity)
        
```

- this will send this specific token to webService
