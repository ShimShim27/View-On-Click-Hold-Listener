package test.test //change package name

/***
* Add imports here
*/


abstract class ViewHoldListener:View.OnTouchListener{
    companion object{
        private const val LOOP_DELAY_MS = 100L
    }


    private var currentJob:Job? = null



    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event != null){
            val action = event.action
            if (action == MotionEvent.ACTION_DOWN){
                currentJob = CoroutineScope(Dispatchers.Default).launch {
                    while (true){
                        whileHolding()
                        delay(LOOP_DELAY_MS)
                    }
                }
            } else if (action == MotionEvent.ACTION_UP) currentJob?.cancel(null)
        }

        return true
    }


    
    abstract fun whileHolding()


}
